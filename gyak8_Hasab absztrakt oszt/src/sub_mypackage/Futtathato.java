package sub_mypackage;

import mypackage.Henger;
import mypackage.Teglatest;

public class Futtathato {
	
	
	public static void main(String[] args) {
		Henger h1 = new Henger(5,2);
		
		System.out.println(h1);
		System.out.println(h1.getVolume());
		
		Teglatest t1 = new Teglatest(5,3,2);
		
		System.out.println(t1);
		System.out.println(t1.getVolume());
		
		System.out.println(t1.Compare(h1));
		System.out.println(h1.Compare(t1));
		
		if (t1.Compare(h1)) {
			System.out.println("A téglatest nagyobb térfogatú");
			
		} else {
			System.out.println("A henger nagyobb térfogatú");
		}
	}

}
