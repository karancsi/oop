import java.util.Random;
public class szamolo {

	public szamolo() {
	}
	;
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		//kalkulator, kell ket operandus és egy operator
		/*java.util.Scanner bemenet = new java.util.Scanner(System.in);//baloldal statikus, jobb oldal dinamikus
		System.out.println("Kérem az elso operandust:"); //for-each 4 alapelv vizsgán
		System.out.println("Értéke:");
		double e_operandus = bemenet.nextDouble();
		System.out.println(e_operandus);
		
		System.out.println("Kérem a masodik operandust:");
		System.out.println("Értéke:");
		double m_operandus = bemenet.nextDouble();
		System.out.println(m_operandus);
		
		System.out.println("Kérem az operatort:");
		String operator =bemenet.nextLine();//space-t is olvas
		operator = bemenet.next();// csak egy szot olvas
		
		double eredmeny=0.0;
		
		/*switch (operator) {
		
		case "+" :
			
			eredmeny=e_operandus+m_operandus;
			break;
		case "-" :
			eredmeny=e_operandus-m_operandus;
			break;
		case "*":
			eredmeny=e_operandus*m_operandus;
			break;
		case "/":
			eredmeny=e_operandus/m_operandus;
			break;
		default:
			break;
		}
		
		if (operator == "+") {
			eredmeny = e_operandus+m_operandus;
		}
		else if (operator == "-"){
			eredmeny =e_operandus-m_operandus;
		}
		else if (operator == "*"){
			eredmeny =e_operandus*m_operandus;
		}
		else if(operator == "/"){
			eredmeny =e_operandus/m_operandus;
		}
		else{
			;
		}
		System.out.println("Az eredmeny: ");
		System.out.println(eredmeny);
		
		
		
		System.out.println("Kérem adja meg a kiszamitando operatort:");
		System.out.println("kifejezes:");
		String kifejezes = bemenet.nextLine();//spacet is
		String [] tomb = kifejezes.split(" ");
		e_operandus = Double.parseDouble(tomb[0]);
		m_operandus = Double.parseDouble(tomb[2]);
		operator = (tomb[1]);
		System.out.println(tomb[0]);
		System.out.println(tomb[1]);
		System.out.println(tomb[2]);
		*/
		
		//int [] tomb_2 = new int [10];
		int  tomb_2 [] = new int [10];
		Random veletleno = new Random();
		for (int i = 0; i < tomb_2.length; i++) {
			//tomb_2 [i] = veletleno.nextInt (50) +1;
			tomb_2[i] = (int) (Math.random()*50) +1;//*50 hogy hány számot akarsz +1 az az also határ
			System.out.println(tomb_2[i]); 
		}
		System.out.println("Fordítva:");
		for (int i = tomb_2.length-1; i >=0; i--) {
			
			System.out.println(tomb_2[i]);
		}
		
		//legnagyobb páros szám megkeresese
		int max = tomb_2[0];
		int maxp =0;
		for (int i = 0; i < tomb_2.length; i++){
			if(tomb_2[i]>max){
				max=tomb_2[i];
			}
		
		if(max%2==0)
		{
			maxp=max;
		}
		else
		{
			System.out.println("");;
		}
		}
		System.out.println("A legnagyobb paros szam:");
		System.out.println(maxp);
		//bemenet.close();
		
		
		
		//mértani kozep
		double mertani_atlag=1;
		double tomb_3 [] = new double [10];
		
		double produktum=1;
		for (int i = 0; i < tomb_3.length; i++) {
			tomb_3[i] = (double) (Math.random()*30) +30;
			produktum *= tomb_3[i];
			System.out.println(tomb_3[i]);
		}
		mertani_atlag = Math.pow(mertani_atlag, 1.0 / tomb_3.length);
		System.out.println("Az atlag:");
		System.out.println(mertani_atlag);

	}
	

}
