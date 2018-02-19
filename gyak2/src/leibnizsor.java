/**
 * 
 */

/**
 * @author karancsi
 *
 */
public class leibnizsor {

	public static void main(String[] args) {
		//Leibniz-féle sor
		double pi=0;
		int darab = 4000;
		int elojel =1;
		for (int i = 1; i <= darab; i+=2) {
			pi +=elojel*1.0/i;
			elojel*=-1;
			
		}
		
		System.err.println("Leibniz-féle sor: ");
		System.out.println("pi/4 erteke:" + pi);
		System.out.println("pi erteke:" + pi*4);
	}
	//Faktoriális
	
	
	
	
	}



