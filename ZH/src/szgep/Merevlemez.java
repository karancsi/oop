package szgep;

public class Merevlemez extends Adathordozo {

	private double foglalt;

	public Merevlemez(String marka, double kapacitas, double foglalt) {
		super(marka, kapacitas);
		this.foglalt = foglalt;
	}

	public double getFoglalt() {
		return foglalt;
	}



	@Override
	public double getFreePLace() {
		return getKapacitas() - foglalt;
	}




	@Override
	public String toString() {
		return "Merevlemez [getFoglalt()=" + getFoglalt() + ", getFreePLace()=" + getFreePLace() + ", getKapacitas()="
				+ getKapacitas() + ", getAdathordozó()=" + getAdathordozó() + "]";
	}

	public boolean osszeHasonlit(Merevlemez other) {
		if (other.getFreePLace() < getFreePLace() ) 
			return true;
		
		return false;
				
	}
	
	public static Merevlemez nagyobbE(Merevlemez a, Merevlemez b) {
		if (a.getKapacitas() < b.getKapacitas())
			return b;
		
		else	 return a;
		
	}
	
}
