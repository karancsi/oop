package forgástest;
import forgástest.Henger;
import forgástest.Téglatest;;
public class forgástestfut {

	
	public static void main(String[] args) {
		Henger h1 = new Henger(5,10);
		System.out.println(h1.toString());
		System.out.println("A h1 térfogata:"+ h1.getVolume());
		System.out.println("");
		
		
		Téglatest t1 = new Téglatest(2, 5, 3);
		System.out.println(h1.toString());
		System.out.println("A t1 térfogata:"+ t1.getVolume());
		System.out.println("");
	}

}
