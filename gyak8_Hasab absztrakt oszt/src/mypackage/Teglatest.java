package mypackage;

public class Teglatest extends Hasab {
	private double a;
	private double b;

	public Teglatest(double high, double a, double b) {
		super(high);
		this.a = a;
		this.b = b;
	}

	@Override
	public double getArea() {
		
		return a*b;
	}

	@Override
	public String toString() {
		return "Teglatest [a=" + a + ", b=" + b + ", getHigh()=" + getHigh()
				+ "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
