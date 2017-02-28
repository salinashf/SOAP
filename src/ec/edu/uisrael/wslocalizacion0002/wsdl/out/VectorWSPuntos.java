package ec.edu.uisrael.wslocalizacion0002.wsdl.out;
/**
 * (c) 2017 Salinas Henry  
 * (c) 2017 in House
 * 
 * @author Salinas Henry  
 * @since 13:46:22 - 14.09.2017
 */

import java.util.Hashtable;
import java.util.Vector;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

public class VectorWSPuntos extends Vector<WSPuntoOut> implements KvmSerializable {
	private static final long serialVersionUID = 1L;


    public VectorWSPuntos(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject != null){
            int size = soapObject.getPropertyCount();
            for (int i0=0;i0<size;i0++){
                Object obj = soapObject.getProperty(i0);
                if (obj!=null && obj.getClass().equals(SoapObject.class)){
                    SoapObject j0 =(SoapObject) soapObject.getProperty(i0);
                    WSPuntoOut j1= new WSPuntoOut(j0);
                    add(j1);
                }
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        return this.get(arg0);
    }
    
    @Override
    public int getPropertyCount() {
        return this.size();
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        info.name = "WSPunto";
        info.type = WSPuntoOut.class;
    }
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }

	@Override
	public String toString() {
	   String  out  ="VectorWSPuntos [*]";
	   int   position =0;
	   for(WSPuntoOut punto : this ){
		   position++;
		   
	    	out = out+ " { "+position+" } " + punto.toString();
	    	
	    }
		return out;
	}
}