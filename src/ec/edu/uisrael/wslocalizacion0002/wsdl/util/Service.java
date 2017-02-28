package ec.edu.uisrael.wslocalizacion0002.wsdl.util ;
/**
 * (c) 2017 Salinas Henry  
 * (c) 2017 in House
 * 
 * @author Salinas Henry  
 * @since 13:46:22 - 14.09.2017
 */


import ec.edu.uisrael.wslocalizacion0002.wsdl.out.WSBodyOut;
import ec.edu.uisrael.wslocalizacion0002.wsdl.out.WSError;
import ec.edu.uisrael.wslocalizacion0002.wsdl.out.WSHeaderOut;
import ec.edu.uisrael.wslocalizacion0002.wsdl.util.WSEnums.SoapProtocolVersion;
import java.util.List;
import org.ksoap2.HeaderProperty;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.ksoap2.serialization.SoapObject;
import android.os.AsyncTask;

public class Service {
    
	
	public static  String NAMESPACE ="http://uisrael.edu.ec/servicios";
    public static String METHOD_NAME = "ConsultarPuntos";
    public String url="http://192.168.150.53:8080/WSLocalizacion0002/services/WSLocalizacion0002SOAP";
    public int timeOut = 60000;
    public static String SOAP_ACTION = "http://uisrael.edu.ec/servicios/ConsultarPuntos";
    
    public IWsdlEvents eventHandler;
    public SoapProtocolVersion soapVersion;   
    public Service(){}
    public Service(IWsdlEvents eventHandler)
    {
        this.eventHandler = eventHandler;
    }
    public Service(IWsdlEvents eventHandler,String url)
    {
        this.eventHandler = eventHandler;
        this.url = url;
    }
    public Service(IWsdlEvents eventHandler,String url,int timeOutInSeconds)
    {
        this.eventHandler = eventHandler;
        this.url = url;
        this.setTimeOut(timeOutInSeconds);
    }
    public void setTimeOut(int seconds){
        this.timeOut = seconds * 1000;
    }
    public void setUrl(String url){
        this.url = url;
    }
    public void serviceAsync(Request req) throws Exception{
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires IWsdl2Events");
        serviceAsync(req, null);
    }
    public void serviceAsync(final Request req,final List<HeaderProperty> headers) throws Exception{
        
        new AsyncTask<Void, Void, Response>(){
            @Override
            protected void onPreExecute() {
                eventHandler.WsdlStartedRequest();
            };
            @Override
            protected Response doInBackground(Void... params) {
                return serviceExecute(req, headers);
            }
            @Override
            protected void onPostExecute(Response result)
            {
                eventHandler.WsdlEndedRequest();
                if (result != null){
                    eventHandler.WsdlFinished("ServiceSample", result);
                }
            }
        }.execute();
    }
    
    public Response serviceExecute(Request req){
        return serviceExecute(req, null);
    }
    
    public Response serviceExecute(Request reqs,List<HeaderProperty> headers){
    	
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = false;
        SoapObject soapReq = new SoapObject(NAMESPACE,METHOD_NAME);
        soapReq.addProperty("headerIn",reqs.getProperty(0));
        soapReq.addProperty("bodyIn",reqs.getProperty(1));
        soapEnvelope.setOutputSoapObject(soapReq);
        
        HttpTransportSE httpTransport = new HttpTransportSE(url,timeOut);
        try{
            if (headers!=null){
                httpTransport.call(SOAP_ACTION, soapEnvelope,headers);
            }else{
                httpTransport.call(SOAP_ACTION, soapEnvelope);
            }
            SoapObject result=(SoapObject)soapEnvelope.bodyIn;
            WSHeaderOut headerOut = null;
            
            if (result.hasProperty("headerOut"))
            {
                SoapObject soapHeaderOut = (SoapObject)result.getProperty("headerOut");
                headerOut  =  new WSHeaderOut(soapHeaderOut);
            }
            WSBodyOut bodyOut = null;  
            if (result.hasProperty("bodyOut"))
            {
                SoapObject soapbodyOut = (SoapObject)result.getProperty("bodyOut");
                bodyOut  =  new WSBodyOut(soapbodyOut);
            }
            
            WSError error = null;  
            if (result.hasProperty("error"))
            {
                SoapObject soaperror = (SoapObject)result.getProperty("error");
                error = new WSError(soaperror);
            }
            Response resultVariable =  new Response (headerOut,bodyOut,error);
            return resultVariable;

        }catch (Exception e) {
            if (eventHandler != null)
                eventHandler.WsdlFinishedWithException(e);
        }
        return null;
    }
   
    
    
    
    
    
    
    
    
    
}
