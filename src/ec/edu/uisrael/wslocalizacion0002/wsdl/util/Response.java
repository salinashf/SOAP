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
import ec.edu.uisrael.wslocalizacion0002.wsdl.out.WSBodyOut;
import ec.edu.uisrael.wslocalizacion0002.wsdl.out.WSError;
import ec.edu.uisrael.wslocalizacion0002.wsdl.out.WSHeaderOut;

public class Response implements KvmSerializable {

	private WSHeaderOut  headerOut;
	private WSBodyOut bodyOut;
	private WSError error ;
	
	public Response(WSHeaderOut headerOut, WSBodyOut puntos,WSError errMessage) {
		super();
		this.headerOut = headerOut;
		this.bodyOut = puntos;
		this.error = errMessage;
	}
	
	public Response(SoapObject soapObject) {
		if (soapObject == null)
			return;
		if (soapObject.hasProperty("headerOut")) {
			SoapObject j = (SoapObject) soapObject.getProperty("headerOut");
			headerOut = new WSHeaderOut(j);  
		}		
		if (soapObject.hasProperty("bodyOut")) {
			Object obj = soapObject.getProperty("bodyOut");
			bodyOut =  new WSBodyOut((SoapObject)obj);  
		}
		if (soapObject.hasProperty("error")) {
			Object obj = soapObject.getProperty("error");
			error =  new WSError((SoapObject)obj); 
		}
	}

	@Override
	public Object getProperty(int arg0) {
		switch (arg0) {
		case 0:
			return headerOut;
		case 1:
			return bodyOut;
		case 2:
			return error;
		}
		return null;
	}

	@Override
	public int getPropertyCount() {
		return 3;
	}

	@Override
	public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
		switch (index) {
		case 0:
			info.type = WSHeaderOut.class;
			info.name = "headerOut";
			break;
		case 1:
			info.type = WSBodyOut.class;
			info.name = "bodyOut";
			break;
		case 2:
			info.type = WSError.class;
			info.name = "error";
			break;
		}
	}

	@Override
	public void setProperty(int arg0, Object arg1) {
	}

	public WSHeaderOut getHeaderOut() {
		return headerOut;
	}

	public WSBodyOut getBodyOut() {
		return bodyOut;
	}

	public WSError getError() {
		return error;
	}

	@Override
	public String toString() {
		return "Response [headerOut=" + headerOut + ", bodyOut=" + bodyOut
				+ ", error=" + error + "]";
	}
}
