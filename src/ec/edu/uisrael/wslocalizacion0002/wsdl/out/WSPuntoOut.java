package ec.edu.uisrael.wslocalizacion0002.wsdl.out;
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
import org.ksoap2.serialization.SoapPrimitive;

import java.util.Hashtable;

/**
 * Created by Henry on 19/2/2017.
 */
public class WSPuntoOut  implements KvmSerializable {

	private String serial_id;
    private String latitud;
    private String longitud;
    private String ubicacion;

    public WSPuntoOut(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("serial_id"))
        {
            Object obj = soapObject.getProperty("serial_id");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) soapObject.getProperty("serial_id");
                serial_id = j.toString();
            }
        }
        if (soapObject.hasProperty("latitud"))
        {
            Object obj = soapObject.getProperty("latitud");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) soapObject.getProperty("latitud");
                latitud = j.toString();
            }
        }        
        if (soapObject.hasProperty("longitud"))
        {
            Object obj = soapObject.getProperty("longitud");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) soapObject.getProperty("longitud");
                longitud = j.toString();
            }
        }
        if (soapObject.hasProperty("ubicacion"))
        {
            Object obj = soapObject.getProperty("ubicacion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) soapObject.getProperty("ubicacion");
                ubicacion = j.toString();
            }
        }
        
    }

    
    
    public Object getProperty(int arg0) {

        switch(arg0)
        {
            case 0:
                return serial_id;
            case 1:
                return latitud;
            case 3:
                return longitud;
            case 4:
                return ubicacion;
        }
        return null;
    }


    
    
    public int getPropertyCount() {
        return 4;
    }

    public void getPropertyInfo(int index,@SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index)
        {
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "serial_id";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "latitud";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "longitud";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "ubicacion";
                break;
                
            default:break;
        }
    }


    
    
    
    
    public void setProperty(int index, Object value) {
        switch(index)
        {
            case 0:
            	serial_id = value.toString();
                break;
            case 1:
            	latitud = value.toString();
                break;
            case 2:
            	longitud = value.toString();
                break;
            case 3:
            	ubicacion = value.toString();
                break;
                
            default:
                break;
        }
    }
	public String getSerial_id() {
		return serial_id;
	}
	public String getLatitud() {
		return latitud;
	}
	public String getLongitud() {
		return longitud;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	
	@Override
	public String toString() {
		return "WSPuntoOut [serial_id=" + serial_id + ", latitud=" + latitud
				+ ", longitud=" + longitud + ", ubicacion=" + ubicacion + "]";
	} 
}
