package ec.edu.uisrael.wslocalizacion0002.wsdl.util;
/**
 * (c) 2017 Salinas Henry  
 * (c) 2017 in House
 * 
 * @author Salinas Henry  
 * @since 13:46:22 - 14.09.2017
 */

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import ec.edu.uisrael.wslocalizacion0002.wsdl.in.WSBodyIn;
import ec.edu.uisrael.wslocalizacion0002.wsdl.in.WSHeaderIn;

public class Request implements KvmSerializable {

	public WSHeaderIn headerIn;
	public WSBodyIn bodyIn;


	public Request() {
		super();

	}

	public Request(WSHeaderIn headerIn, WSBodyIn bodyIn) {
		super();
		this.headerIn = headerIn;
		this.bodyIn = bodyIn;
	}

	public Request(SoapObject soapObject) {
		if (soapObject == null)
			return;
		if (soapObject.hasProperty("headerIn")) {
			Object obj = soapObject.getProperty("headerIn");
			headerIn   =  new  WSHeaderIn((SoapObject)obj); 
		}
		if (soapObject.hasProperty("bodyIn")) {
			Object obj = soapObject.getProperty("bodyIn");
			bodyIn   =  new  WSBodyIn((SoapObject)obj); 
		}

	}

	@Override
	public Object getProperty(int arg0) {
		switch (arg0) {
		case 0:
			return headerIn;
		case 1:
			return bodyIn;
		}
		return null;
	}

	@Override
	public int getPropertyCount() {
		return 2;
	}

	@Override
	public void getPropertyInfo(int index,@SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
		switch (index) {
		case 0:
			info.type = WSHeaderIn.class;
			info.name = "headerIn";
			break;
		case 1:
			info.type = WSBodyIn.class;
			info.name = "bodyIn";
			break;
		}
	}

	@Override
	public void setProperty(int arg0, Object arg1) {
	}

}
