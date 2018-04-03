package csomag;

public class Aru {

	
		private String nev;
		private int nettoar;
		private int afakulcs;
		
		public Aru(String nev,int nettoar,int afakulcs){
			this.nev= nev;
			this.nettoar = nettoar;
			this.afakulcs = afakulcs;
		}
		public int kerekitvebruttoar(){
			return this.nettoar + (nettoar *(int)(this.afakulcs/100));
		}
		
		/*@Override
		public String toString() {
			return "Aru [nev=" + nev + "]";
		}ezt maga a java generálja, elotte az override az annotáció*/
		
		
		public void nettoarnovelő(int afakulcsIn){
			this.nettoar= this.nettoar  + (this.nettoar * (afakulcsIn/100));
		}
		
		public int aruhasonlitas (Aru other){
			if(this.kerekitvebruttoar() > other.kerekitvebruttoar())
				return 1;
			else if (this.kerekitvebruttoar() <other.kerekitvebruttoar())
				return -1;
			else
				return 0;
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
