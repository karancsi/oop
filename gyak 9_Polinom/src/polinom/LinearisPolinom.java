package polinom;

import matematika.Polinom;

public class LinearisPolinom implements Polinom { // y=ax+b
	private double a;
	private double b;
	
	public double szamol (double x){
		return a*x +b;
	}

	@Override
	public int getFoka() {
		
		return 1;//ugy is elsofoku a polinomunk
	}


	public LinearisPolinom(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		if(b>0){
			return "y= " + a+" x  + " + b ;
		}
		else{
		return "y= " + a+"x" + b ;
	}
	}

	
	
}
