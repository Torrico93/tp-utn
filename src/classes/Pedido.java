package classes;

public class Pedido {
	Cono c = new Cono();
	Vaso v = new Vaso();
	Pote p = new Pote();
	String pedidoCompleto;
	
	
	public String getPedidoCompleto() {
		return "El pedido completo es:\n" + c.toString() + "\n" + v.toString() + "\n" + p.toString() + "\n";
	}

	public Cono getC() {
		return c;
	}

	public void setC(Cono c) {
		this.c = c;
	}

	public Vaso getV() {
		return v;
	}

	public void setV(Vaso v) {
		this.v = v;
	}

	public Pote getP() {
		return p;
	}

	public void setP(Pote p) {
		this.p = p;
	}
	
	
	
	
	

}
