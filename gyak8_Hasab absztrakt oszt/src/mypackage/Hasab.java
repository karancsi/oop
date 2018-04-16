package mypackage;

public abstract class Hasab {

	private double heigh;
	

	public Hasab(double high) {
		super();
		this.heigh = high;
	}
	
	public double getHigh() {
		return heigh;
	}

	
	public abstract double getArea();
	public double getVolume(){
		return getArea()*this.heigh;
	}

	
	public void setHigh(int high) {
		this.heigh = high;
	}
	public boolean Compare(Hasab otherhasab){
		return getVolume()> otherhasab.getVolume();
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
