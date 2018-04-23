package sajat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Proba {

	public Proba() {

	}

	
	public static void main(String[] args) {
		int elemekszama= 5;
		int tomb[] = new int [elemekszama];
		
		Scanner beolvasas= new Scanner(System.in);
		
		for (int i = 0; i < tomb.length; i++) {
			boolean rosszAdat = true;
			do {
				System.out.println("Adja meg a(z)" + i+1 + ". számot: ");
				try {tomb[i] = Integer.parseInt(beolvasas.nextLine ());
				 rosszAdat = false;
				
				} catch (InputMismatchException e) {
					System.out.println("rossz input");
				}
			catch (NumberFormatException e) {
				System.out.println("rossz input");
			}
				
			} while (rosszAdat);
		
			 
		}
		System.out.println("A tömb elemei:");
		for (int i : tomb) {
			System.out.println(i);
		}
		beolvasas.close();
	}

}
