package ec.edu.uisrael.wslocalizacion0002;
/**
 * (c) 2017 Salinas Henry  
 * (c) 2017 in House
 * 
 * @author Salinas Henry  
 * @since 13:46:22 - 14.09.2017
 */
import java.util.Calendar;
import java.util.Date;
import ec.edu.uisrael.wslocalizacion0002.wsdl.in.WSBodyIn;
import ec.edu.uisrael.wslocalizacion0002.wsdl.in.WSHeaderIn;
import ec.edu.uisrael.wslocalizacion0002.wsdl.in.WSPuntoInferior;
import ec.edu.uisrael.wslocalizacion0002.wsdl.in.WSPuntoSuperior;
import ec.edu.uisrael.wslocalizacion0002.wsdl.in.WSPuntoIn;
import ec.edu.uisrael.wslocalizacion0002.wsdl.util.IWsdlEvents;
import ec.edu.uisrael.wslocalizacion0002.wsdl.util.Request;
import ec.edu.uisrael.wslocalizacion0002.wsdl.util.Response;
import ec.edu.uisrael.wslocalizacion0002.wsdl.util.Service;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity implements IWsdlEvents  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button   bntExe  =  (Button)findViewById(R.id.bntExeServ);
        bntExe.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {
				callWebService();
			}
		});
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

	public void callWebService(){
        Service srv1 = new Service(this);
        WSHeaderIn headerIn =  new WSHeaderIn("abcxxxx1011","http","soap","movil","usr_admin",new Date().toString(),Calendar.getInstance().getTimeZone().toString(),"192.168.11.01");
        WSBodyIn bodyIn = new WSBodyIn(
        		new WSPuntoSuperior(new WSPuntoIn("20","30")),
        		new WSPuntoInferior(new WSPuntoIn("20","30"))
        		);
        Request  request   =  new Request(headerIn, bodyIn);
        try {
          srv1.serviceAsync(request) ;	 
		} catch (Exception e) {
			e.printStackTrace();
		}  
    }
    
	public void outWebService(String out){
		EditText   txtOut  =  (EditText)findViewById(R.id.txtOuotSoap);
		txtOut.setText(out);
    }
	
	
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
	@Override
	public void WsdlStartedRequest() {
		Log.e("Wsdl", "WsdlStartedRequest");
		outWebService("WsdlStartedRequest");
		
	}
	@Override
	public void WsdlFinished(String methodName, Object data) {
		Log.e("Wsdl", "WsdlFinished");
		Log.e("Wsdl",methodName);
		Response response  =  ((Response)data);
		
		//outWebService("WsdlFinished " +response.toString());
		outWebService("WsdlFinished " +response.getBodyOut().toString());
		
	}
	@Override
	public void WsdlFinishedWithException(Exception ex) {
		Log.e("Wsdl", "WsdlFinishedWithException");
		outWebService("WsdlFinishedWithException " +ex.getMessage());
		
	}
	@Override
	public void WsdlEndedRequest() {
		Log.e("Wsdl", "WsdlEndedRequest");
		outWebService("WsdlEndedRequest " );
		
	}
}
