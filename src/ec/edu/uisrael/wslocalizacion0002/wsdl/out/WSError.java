package ec.edu.uisrael.wslocalizacion0002.wsdl.out;
/**
 * (c) 2017 Salinas Henry  
 * (c) 2017 in House
 * 
 * @author Salinas Henry  
 * @since 13:46:22 - 14.09.2017
 */

import java.util.Hashtable;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class WSError  implements KvmSerializable {

	private String codigo;
    private String mensaje;
    private String tipo;
    private String recurso;
    private String componente;



    public WSError(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("codigo"))
        {
            Object obj = soapObject.getProperty("codigo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) soapObject.getProperty("codigo");
                codigo = j.toString();
            }
        }
        if (soapObject.hasProperty("mensaje"))
        {
            Object obj = soapObject.getProperty("mensaje");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) soapObject.getProperty("mensaje");
                mensaje = j.toString();
            }
        }
        if (soapObject.hasProperty("tipo"))
        {
            Object obj = soapObject.getProperty("tipo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) soapObject.getProperty("tipo");
                tipo = j.toString();
            }
        }
        if (soapObject.hasProperty("recurso"))
        {
            Object obj = soapObject.getProperty("recurso");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) soapObject.getProperty("recurso");
                recurso = j.toString();
            }
        }
        if (soapObject.hasProperty("componente"))
        {
            Object obj = soapObject.getProperty("componente");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) soapObject.getProperty("componente");
                componente = j.toString();
            }
        }
        
        
    }
    
    
    
    
    
    
    
    public Object getProperty(int arg0) {

        switch(arg0)
        {
            case 0:
                return codigo;
            case 1:
                return mensaje;
            case 2:
                return tipo;
            case 3:
                return recurso;
            case 4:
                return componente;

        }

        return null;
    }

    public int getPropertyCount() {
        return 5;
    }

 
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes")  Hashtable arg1, PropertyInfo info) {
        switch(index)
        {
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "codigo";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "mensaje";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "tipo";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "recurso";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "componente";
                break;
            default:break;
        }
    }

    public void setProperty(int index, Object value) {
        switch(index)
        {
            case 0:
                codigo = value.toString();
                break;
            case 1:
                mensaje = value.toString();
                break;
            case 2:
                tipo = value.toString();
                break;
            case 3:
                recurso = value.toString();
                break;
            case 4:
                componente = value.toString();
                break;
            default:
                break;
        }
    }

	@Override
	public String toString() {
		return "WSError [codigo=" + codigo + ", mensaje=" + mensaje + ", tipo="
				+ tipo + ", recurso=" + recurso + ", componente=" + componente
				+ "]";
	}

    public String getCodigo() {
		return codigo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public String getTipo() {
		return tipo;
	}

	public String getRecurso() {
		return recurso;
	}

	public String getComponente() {
		return componente;
	}

}
