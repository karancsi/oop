package szopogep;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

import szgep.Merevlemez;

public class Taroloteszt {

	public static void main(String[] args) throws IOException {
		
		Merevlemez[] tomb = new Merevlemez[5];
		
		Scanner sc = new Scanner (System.in);
		
		for (int i = 0; i < 5; i++) {
	/*		System.out.println("Adja meg a foglaltságot: ");
			double foglalt = sc.nextDouble();
			
			
			System.out.println("Adja meg a kapacitást: ");
			double kapacitas = sc.nextDouble();
		
			
			System.out.println("Adja meg a markajat: ");
			String marka = sc.next();
			*/
	
			BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("Adja meg a foglaltságot: ");
			double foglalt = input.read();
			
			System.out.println("Adja meg a kapacitást: ");
			double kapacitas = input.read();
			
			System.out.println("Adja meg a markajat: ");
			String marka = input.readLine();
			
			
			tomb[i] = new Merevlemez (marka, kapacitas, foglalt);
		//Arrays.sort(tomb);
			
			
		}
		sc.close();
		
		legNagyobb(tomb);
	
		nagyobbE(tomb);
		
		for (int i = 0; i < 5; i++) {
			System.out.println(tomb[i].toString());
		}
		
		
		
	}

	public static String legNagyobb(Merevlemez[] tomb) {
		double max = 0;
		int lofasz = 0;
		for(int i = 0; i < tomb.length;i++) {
			if (max < tomb[i].getKapacitas() ) {
				max = tomb[i].getKapacitas();
				lofasz = i;
			
			}
	
		}
	
		System.out.println("A legnagyobb: "+tomb[lofasz].toString());
		
		
		return tomb[lofasz].toString();
}
	
	
public static int nagyobbE(Merevlemez[] tomb) {
	
	int x=0;
	for(int i = 0;i < tomb.length;i++ ) {
		
		if(tomb[i].getFoglalt() < tomb[i].getFreePLace()) {
			x++;
		}
	
	}
	
	System.out.println(x);
	
	
	return x;
}	
	
	
	
	
	
	
}
