package ec.edu.uisrael.wslocalizacion0002;
/**
 * (c) 2017 Salinas Henry  
 * (c) 2017 in House
 * 
 * @author Salinas Henry  
 * @since 13:46:22 - 14.09.2017
 */
public class PuntoLista {
	
	private  String    pntx  ;
	public String getPntx() {
		return pntx;
	}
	public void setPntx(String pntx) {
		this.pntx = pntx;
	}
	public String getPnty() {
		return pnty;
	}
	public void setPnty(String pnty) {
		this.pnty = pnty;
	}
	private  String    pnty;
	public PuntoLista(String pntx, String pnty) {
		super();
		this.pntx = pntx;
		this.pnty = pnty;
	}

}
