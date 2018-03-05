
public class alkalmazott_haszn {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		alkalmazott Alkalmazott = new alkalmazott();//alk-tipus Alk-neve
		/*Alkalmazott.nev = "Kiss Pista";
		Alkalmazott.fizetes = 1000;
		System.out.println(Alkalmazott.nev);*/
		Alkalmazott.setNev("Kiss Pista");
		Alkalmazott.setFizetes(20);
		
		
		/*System.out.println(Alkalmazott.toString());
		System.out.println(Alkalmazott);
		Alkalmazott.fiznov(110);
		System.out.println(Alkalmazott);*/
		
		System.out.println(Alkalmazott.getNev());
		System.out.println(Alkalmazott.getFizetes());
		System.out.println(Alkalmazott.fizintervallumkozt(10, 1200));
		System.out.println(Alkalmazott.adoerteke(0.16));
		
		alkalmazott masikalk = new alkalmazott();//másik alkalmazott, bal oldal a statikus jobb oldal a dinamikus, a new operatort alkalmaztuk
		masikalk.setNev("Dzseniffer");
		masikalk.setFizetes(30);
		System.out.println(masikalk.getNev());
		System.out.println(Alkalmazott.nagyobbe(masikalk));
		
		alkalmazott []alkalmazottak = new alkalmazott[5];
		for (int i = 0; i < alkalmazottak.length; i++) {
			alkalmazottak[i] = new alkalmazott () ;
			alkalmazottak[i].setNev("A");
			alkalmazottak[i].setFizetes((long)Math.random()*20);
			System.out.println(alkalmazottak[i]);
			
		}
	}

}
