package csomag;

public class Product_run {

	

	public static void main(String[] args) {
		Product Aru = new Product("Valami kaja",200,24); //.setNettoar = (200);
		//Aru.setNettoar(400);
		Kenyér_leszarmazott kobjektum = new Kenyér_leszarmazott("kenyer",100,15,0.75);
		Aru.netto_arat_nov(20);
		System.out.println(Aru);
		System.out.println(kobjektum);
		
		int melyikdragabb = kobjektum.dragabb_e(Aru);
		int melyik = Aru.dragabb_e(kobjektum);
		
		System.out.println(melyikdragabb);
		System.out.println(melyik);
		
	}
}
