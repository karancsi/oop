/**
 * 
 */

/**
 * @author karancsi
 *
 */
public class class2 {

	
	public static void main(String[] args) {
		//Wallis-formula
		double pi=1;
		int darab =1000/2;
		for (int i = 1; i <= darab ; i++) {
			pi *= 2.0*i/(2*i-1);
			pi *= 2.0*i/(2*i+1);
		}
		System.err.println("Wallis-formula: ");
		System.out.println("pi/2 erteke:" + pi);
		System.out.println("pi/2 erteke:" + pi*2);
	}

}
