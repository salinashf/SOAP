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
import org.ksoap2.serialization.SoapPrimitive;

import java.util.Hashtable;
public class WSHeaderIn implements KvmSerializable {

    private String dispositivo;
    private String canal;
    private String medio;
    private String aplicacion;
    private String usuario;
    private String fechaHora;
    private String idioma;
    private String ip;

    public WSHeaderIn( String dispositivo, String canal, String medio, String aplicacion, String usuario, String fechaHora, String idioma, String ip) {
        this.dispositivo = dispositivo;
        this.canal = canal;
        this.medio = medio;
        this.aplicacion = aplicacion;
        this.usuario = usuario;
        this.fechaHora = fechaHora;
        this.idioma = idioma;
        this.ip = ip;
    }

    public WSHeaderIn(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("dispositivo"))
        {
            Object obj = soapObject.getProperty("dispositivo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) soapObject.getProperty("dispositivo");
                dispositivo = j.toString();
            }
        }
        if (soapObject.hasProperty("canal"))
        {
            Object obj = soapObject.getProperty("canal");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) soapObject.getProperty("canal");
                canal = j.toString();
            }
        }
        if (soapObject.hasProperty("medio"))
        {
            Object obj = soapObject.getProperty("medio");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) soapObject.getProperty("medio");
                medio = j.toString();
            }
        }
        if (soapObject.hasProperty("aplicacion"))
        {
            Object obj = soapObject.getProperty("aplicacion");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) soapObject.getProperty("aplicacion");
                aplicacion = j.toString();
            }
        }
        if (soapObject.hasProperty("usuario"))
        {
            Object obj = soapObject.getProperty("usuario");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) soapObject.getProperty("usuario");
                usuario = j.toString();
            }
        }
        if (soapObject.hasProperty("fechaHora"))
        {
            Object obj = soapObject.getProperty("fechaHora");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) soapObject.getProperty("fechaHora");
                fechaHora = j.toString();
            }
        }
        if (soapObject.hasProperty("idioma"))
        {
            Object obj = soapObject.getProperty("idioma");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) soapObject.getProperty("idioma");
                idioma = j.toString();
            }
        }
        if (soapObject.hasProperty("ip"))
        {
            Object obj = soapObject.getProperty("ip");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) soapObject.getProperty("ip");
                ip = j.toString();
            }
        }
        
    }
    
    
    
    
    
    
    
    public Object getProperty(int arg0) {

        switch(arg0)
        {
            case 0:
                return dispositivo;
            case 1:
                return canal;
            case 2:
                return medio;
            case 3:
                return aplicacion;
            case 4:
                return usuario;
            case 5:
                return fechaHora;
            case 6:
                return idioma;
            case 7:
                return ip;
        }

        return null;
    }

    public int getPropertyCount() {
        return 8;
    }

    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes")  Hashtable arg1, PropertyInfo info) {
        switch(index)
        {
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "dispositivo";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "canal";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "medio";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "aplicacion";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "usuario";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "fechaHora";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "idioma";
                break;
            case 7:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "ip";
                break;
            default:break;
        }
    }

    public void setProperty(int index, Object value) {
        switch(index)
        {
            case 0:
                dispositivo = value.toString();
                break;
            case 1:
                canal = value.toString();
                break;
            case 2:
                medio = value.toString();
                break;
            case 3:
                aplicacion = value.toString();
                break;
            case 4:
                usuario = value.toString();
                break;
            case 5:
                fechaHora = value.toString();
                break;
            case 6:
                idioma = value.toString();
                break;
            case 7:
                ip = value.toString();
                break;
            default:
                break;
        }
    }

	public String getDispositivo() {
		return dispositivo;
	}

	public String getCanal() {
		return canal;
	}

	public String getMedio() {
		return medio;
	}

	public String getAplicacion() {
		return aplicacion;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getFechaHora() {
		return fechaHora;
	}

	public String getIdioma() {
		return idioma;
	}

	public String getIp() {
		return ip;
	}
    
    
}
