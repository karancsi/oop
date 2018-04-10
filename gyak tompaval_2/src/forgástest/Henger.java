package forgástest;

public class Henger extends Hasáb {

	private double radius;
	
	public Henger(int radius,int height){
		super(height);//muszáj az első utasításnak lennie
		this.radius = radius;
	}
	
	
	
	@Override //ellenőrzi h tényleg felüldefiniálás e, a fordítónak szól
	
	public double baseArea() {
		
		/*return this.radius*this.radius*Math.PI;*/
		return Math.pow(radius, 2)*Math.PI;
	}
	
	
	

	@Override
	public String toString() {
		return "Henger [radius=" + this.radius + "magasság:" + super.getHeight()+"]";
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
