package sajatcsomag;

public class Gyermek extends Szemely {
	private String iskola;
	

	public Gyermek(String nev,int kor, String iskola) {
		//super(nev,kor);
		this.iskola = iskola;
	}




	public String getIskola() {
		return iskola;
	}



	@Override
	public String toString() {
		return "Gyermek [iskola=" + iskola + ", toString()=" + super.toString()
				+ "]";
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
