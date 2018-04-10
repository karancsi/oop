package forgástest;

public class Téglatest extends Hasáb {
	private double a;
	private double b;
	
	
	public Téglatest (double a, double b,int height) {
		super(height);
		this.a=a;
		this.b=b;
	}

	
	public  double baseArea() {
		
		return a*b;
	}
	
	
	@Override
	public String toString() {
		return "Téglatest [a=" + this.a + ", b=" + this.b + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
