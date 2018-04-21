package polinom;

import java.util.Scanner;

import matematika.Polinom;

public class Proba {
	

	public static void main(String[] args) {
		LinearisPolinom p1 = new LinearisPolinom(2,5);
		
		System.out.println(p1);
		LinearisPolinom tomb [] = new LinearisPolinom [2];
		System.out.println("Adja meg a polinomok együtthatóit:");
		
		Scanner beolvasas = new Scanner(System.in);
		
		for (int i = 0; i < tomb.length; i++) {
			System.out.println("Elso egyutthato: a =");
			double a = beolvasas.nextDouble();
			System.out.println("Masodik egyutthato: b =");
			double b = beolvasas.nextDouble();
			beolvasas.nextLine();
			
			tomb[i] = new LinearisPolinom(a, b);	
			
		}
		 for(LinearisPolinom linpolinom : tomb){
			 System.out.println(linpolinom);
		 }
		 
		 fvTabla (tomb[tomb.length -1]);
		 
	
	}
	public static void  fvTabla(Polinom polinom){
		System.out.println(polinom + "fv táblája");
		System.out.println("x\ty");
		
		for (double i = 0; i <= 1; i+= 0.1) {
			System.out.println(i + "\t");
			System.out.println(polinom.szamol(i));
			System.out.println(polinom.toString());
		}
		
	

	}

}
