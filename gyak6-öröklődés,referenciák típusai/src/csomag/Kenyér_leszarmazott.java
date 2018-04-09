package csomag;

public class Kenyér_leszarmazott extends Product {
	private double mennyiseg;
	public Kenyér_leszarmazott(String Nev, int Nettoar, int Afakulcs, double mennyiseg) {
		super(Nev, Nettoar, Afakulcs);
		this.mennyiseg =mennyiseg;
		
	}




	@Override
	public String toString() {//ős toString metódusát meghívjuk
		return "Kenyér ["+ super.toString() + ", egysegar: " + Bruttoar()/ mennyiseg + " Ft]"; // egységár kiszámítása
		
	}

	public static boolean elsokenyer_nagyonbbar(Kenyér_leszarmazott elso_kenyer, Kenyér_leszarmazott masodik_kenyer){
		return (elso_kenyer.Bruttoar()/elso_kenyer.mennyiseg > masodik_kenyer.Bruttoar()/masodik_kenyer.mennyiseg);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
