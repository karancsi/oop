package harmadik;

import java.awt.Color;

import sajat.Iszinezheto;

public class Toll extends Aru implements Iszinezheto {
	Color szin;
	private String markanev;
	public Toll() {
		
	}
	
	public Toll(int ar,String markanev, String nev,Color szin) {
		super(ar, nev);
		this.szin= szin;
		this.markanev = markanev;
		
		
	}

	@Override
	public Color getSzin() {
		
		return null;
	}

	@Override
	public void setSzin(Color szin) {
		
		
	}

	@Override
	public String toString() {
		return "Toll [szin=" + szin + ", toString()=" + super.toString() + "]";
	}

	
	public static void main(String[] args) {
		

	}

}
