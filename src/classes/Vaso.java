package classes;

public class Vaso {
	String gusto1;
	String gusto2;
	String gusto3;
	boolean crema = false;
	boolean chocolate = false;
	
	
	public void setOpcional(int opcion) {
		switch (opcion) {
		case 1:
			crema = true;
			break;
		case 2:
			chocolate = true;
			break;
		default:
			break;
		}
	}
	
	


	@Override
	public String toString() {
		return "Vaso:\ngusto1=" + gusto1 + "\ngusto2=" + gusto2 + "\ngusto3=" + gusto3 + "\ncrema=" + crema
				+ "\nchocolate=" + chocolate;
	}




	public String getGusto1() {
		return gusto1;
	}


	public void setGusto1(String gusto1) {
		this.gusto1 = gusto1;
	}


	public String getGusto2() {
		return gusto2;
	}


	public void setGusto2(String gusto2) {
		this.gusto2 = gusto2;
	}


	public String getGusto3() {
		return gusto3;
	}


	public void setGusto3(String gusto3) {
		this.gusto3 = gusto3;
	}
	
	
	
	
}
