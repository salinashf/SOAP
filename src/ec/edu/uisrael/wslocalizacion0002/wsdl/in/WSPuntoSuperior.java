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

/**
 * Created by Henry on 19/2/2017.
 */
public class WSPuntoSuperior   implements KvmSerializable {
    private WSPuntoIn punto;

    public WSPuntoSuperior(WSPuntoIn punto) {
        this.punto = punto;
    }

    public WSPuntoSuperior(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("punto"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("punto");
            punto =  new WSPuntoIn(j);
            
        }
    }
    
    public Object getProperty(int arg0) {

        switch(arg0)
        {
            case 0:
                return punto;
        }
        return null;
    }

    public int getPropertyCount() {
        return 1;
    }

    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes")Hashtable arg1, PropertyInfo info) {
        switch(index)
        {
            case 0:
                info.type = WSPuntoIn.class;
                info.name = "punto";
                break;
            default:break;
        }
    }

    public void setProperty(int index, Object value) {
        switch(index)
        {
            case 0:
                punto = (WSPuntoIn)value;
                break;
            default:
                break;
        }
    }

	public WSPuntoIn getPunto() {
		return punto;
	}

}
