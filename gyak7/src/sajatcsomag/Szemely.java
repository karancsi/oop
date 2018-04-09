package sajatcsomag;

public class Szemely {
	private String nev;
	private int kor;
	
	

	@Override
	public String toString() {
		return "Szemely [nev:" + nev + ", kor:" + kor + "]";
	}



	public String getNev() {
		return nev;
	}



	public int getKor() {
		return kor;
	}

	public boolean életkorNagyobb(Szemely masik) {
		return getKor() > masik.getKor();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
