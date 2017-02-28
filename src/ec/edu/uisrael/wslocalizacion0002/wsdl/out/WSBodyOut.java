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

import java.util.Hashtable;

/**
 * Created by Henry on 19/2/2017.
 */
public class WSBodyOut implements KvmSerializable {
	private VectorWSPuntos puntos;


	public WSBodyOut(SoapObject soapObject) {
		if (soapObject == null)
			return;
		if (soapObject.hasProperty("puntos")) {
			SoapObject j = (SoapObject) soapObject.getProperty("puntos");
			puntos = new VectorWSPuntos(j);

		}
	}

	public Object getProperty(int arg0) {

		switch (arg0) {
		case 0:
			return puntos;
		}

		return null;
	}

	public int getPropertyCount() {
		return 1;
	}

	public void getPropertyInfo(int index,@SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
		switch (index) {
		case 0:
			info.type = PropertyInfo.VECTOR_CLASS;
			info.name = "puntos";
			break;
		default:
			break;
		}
	}

	public void setProperty(int index, Object value) {
		switch (index) {
		case 0:
			puntos = (VectorWSPuntos) value;
			break;
		default:
			break;
		}
	}

	@Override
	public String toString() {
		return "WSBodyOut [puntos=" + puntos + "]";
	}

	public VectorWSPuntos getPuntos() {
		return puntos;
	}
	
}
