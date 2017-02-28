package ec.edu.uisrael.wslocalizacion0002.wsdl.in;
/**
 * (c) 2017 Salinas Henry  
 * (c) 2017 in House
 * 
 * @author Salinas Henry  
 * @since 13:46:22 - 14.09.2017
 */

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import java.util.Hashtable;
public class WSBodyIn   implements KvmSerializable {

	private WSPuntoSuperior puntoSuperior;
    private WSPuntoInferior puntoInferior;
    
    public WSBodyIn(WSPuntoSuperior puntoSuperior, WSPuntoInferior puntoInferior) {
        this.puntoSuperior = puntoSuperior;
        this.puntoInferior = puntoInferior;
    }

    public WSBodyIn(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("puntoSuperior"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("puntoSuperior");
            puntoSuperior =  new WSPuntoSuperior(j);
            
        }if (soapObject.hasProperty("puntoInferior"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("puntoInferior");
            puntoInferior =  new WSPuntoInferior(j);
            
        }
    }
    
    public Object getProperty(int arg0) {

        switch(arg0)
        {
            case 0:
                return puntoSuperior;
            case 1:
                return puntoInferior;
        }

        return null;
    }

    public int getPropertyCount() {
        return 2;
    }

    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index)
        {
            case 0:
                info.type =WSPuntoSuperior.class;
                info.name = "puntoSuperior";
                break;
            case 1:
                info.type = WSPuntoInferior.class;
                info.name = "puntoInferior";
                break;
            default:break;
        }
    }

    public void setProperty(int index, Object value) {
        switch(index)
        {
            case 0:
                puntoSuperior = (WSPuntoSuperior)value;
                break;
            case 1:
                puntoInferior = (WSPuntoInferior)value;
                break;
            default:
                break;
        }
    }

	public WSPuntoSuperior getPuntoSuperior() {
		return puntoSuperior;
	}

	public WSPuntoInferior getPuntoInferior() {
		return puntoInferior;
	}
    
}
