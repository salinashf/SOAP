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

/**
 * Created by Henry on 19/2/2017.
 */
public class WSPuntoIn  implements KvmSerializable {

    private String pntoX;
    private String pntoY;

    public WSPuntoIn(String pntoX, String pntoY) {
        this.pntoX = pntoX;
        this.pntoY = pntoY;
    }
    public WSPuntoIn(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("pntoX"))
        {
            Object obj = soapObject.getProperty("pntoX");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) soapObject.getProperty("pntoX");
                pntoX = j.toString();
            }
        }
        if (soapObject.hasProperty("pntoY"))
        {
            Object obj = soapObject.getProperty("pntoY");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) soapObject.getProperty("pntoY");
                pntoY = j.toString();
            }
        }
    }
    public Object getProperty(int arg0) {

        switch(arg0)
        {
            case 0:
                return pntoX;
            case 1:
                return pntoY;
        }
        return null;
    }

    public int getPropertyCount() {
        return 2;
    }

    public void getPropertyInfo(int index,@SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index)
        {
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "pntoX";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "pntoY";
                break;
            default:break;
        }
    }

    public void setProperty(int index, Object value) {
        switch(index)
        {
            case 0:
                pntoX = value.toString();
                break;
            case 1:
                pntoY = value.toString();
                break;
            default:
                break;
        }
    }
	public String getPntoX() {
		return pntoX;
	}
	public String getPntoY() {
		return pntoY;
	}


}
