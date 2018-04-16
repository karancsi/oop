package mypackage;

public class Henger extends Hasab {
	private double radius;
	public Henger(double high) {
		super(high);	
	}


	public Henger(double high, double radius) {
		super(high);
		this.radius = radius;
	}


	@Override
	public double getArea() {
		return radius*radius *Math.PI;
	}


	@Override
	public String toString() {
		return "Henger [radius=" + radius + ", getArea()=" + getArea() + "magassag=" + getHigh() + "]";
	}
	
}
	


