package csomag;

public class Vmi_mas extends Aru {
	private double mennyiseg;
	public double egysegar(){
		return this.kerekitvebruttoar() / this.mennyiseg;
	}

	public Vmi_mas(String nev, int nettoar, int afakulcs, double mennyiseg) {
		super(nev, nettoar, afakulcs);
		this.mennyiseg = mennyiseg;
		
	}
	public String toString(){
		return super.toString() + "egysegár:" + this.egysegar()/ this.mennyiseg;
	}
	
	public boolean Vmi_masosszehas(Vmi_mas v1, Vmi_mas v2){
		if(v1.egysegar()> v2.egysegar())
			return true;
		
		return false;
	}


}
