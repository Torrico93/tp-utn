package classes;

public class Pote {
	String gusto1;
	String gusto2;
	String gusto3;
	String gusto4;
	boolean crema = false;
	boolean chocolate = false;
	boolean almendras = false;


	public void setOpcional(int opcion) {
		switch (opcion) {
			case 1:
				crema = true;
				break;
			case 2:
				chocolate = true;
				break;
			case 3:
				almendras = true;
			default:
				break;
		}
	}


	@Override
	public String toString() {
		return "Pote:\ngusto1=" + gusto1 + "\ngusto2=" + gusto2 + "\ngusto3=" + gusto3 + "\ngusto4=" + gusto4
				+ "\ncrema=" + crema + "\nchocolate=" + chocolate + "\nalmendras=" + almendras;
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

	public String getGusto4() {
		return gusto4;
	}

	public void setGusto4(String gusto4) {
		this.gusto4 = gusto4;
	}


}
