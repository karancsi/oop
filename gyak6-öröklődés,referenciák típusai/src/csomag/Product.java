package csomag;

public class Product {

	private String Nev;
	private int Nettoar;
	private int Afakulcs;
	
	public Product (String Nev,int Nettoar,int Afakulcs){
		this.Nev=Nev;
		this.Nettoar=Nettoar;
		this.Afakulcs=Afakulcs;
	}
	
	public int Bruttoar(){
		return (int)(Nettoar*(Afakulcs/100.0) +1);
	}
	
	
	
	
	@Override
	public String toString() {
		return "Product: [Nev=" + Nev + ", Nettoar=" + Nettoar + ", Afakulcs="
				+ Afakulcs + "]";
	}
	
	public void netto_arat_nov(int szazalek){
		Nettoar= (int)(Nettoar*(1 + szazalek/100.0));
	}
	
	public int dragabb_e(Product masik_aru){
		if(Bruttoar () > masik_aru.Bruttoar()){
			return 1;
		}
		else if (Bruttoar () < masik_aru.Bruttoar()){
			return -1;
		}
		return 0;
	}
	
	
	
	
	public String getNev() {
		return Nev;
	}

	public void setNev(String nev) {
		Nev = nev;
	}

	public int getNettoar() {
		return Nettoar;
	}

	public void setNettoar(int nettoar) {
		Nettoar = nettoar;
	}

	public int getAfakulcs() {
		return Afakulcs;
	}

	public void setAfakulcs(int afakulcs) {
		Afakulcs = afakulcs;
	}

	public static void main(String[] args) {
	

	}

}
