
public class alkalmazott {

	private String nev ;
	private long fizetes;
	public void fiznov(long ertek)//amennyit megkapunk értéket, azzal megnöveljük a fizetéset 
	{
		fizetes += ertek;	
	}
	
	public String getNev() {
		return nev;
	}

	public void setNev(String nevparameter) {
		this.nev = nevparameter;
	}

	public long getFizetes() {
		return fizetes;
	}

	public void setFizetes(long fizetes) {
		this.fizetes = fizetes;
	}

	@Override
	public String toString() {
		return "alkalmazott neve: " + nev + ", fizetese: " + fizetes + "Ft";
	}

	public boolean fizintervallumkozt(long alsohatar, long felsohatar)//fizetés intervallumok között
	{
		return fizetes >= alsohatar && fizetes <= felsohatar;
	}
	
	public long adoerteke(double adokulcs) 
	{
		return (long)(fizetes * adokulcs);
	}
	public boolean nagyobbe(alkalmazott masik) {//nagyonn fizetésű, mint egy másik alkalmazotté
		return fizetes > masik.fizetes;
	}
	
	
	public static void main(String[] args) {
		

	}

}
