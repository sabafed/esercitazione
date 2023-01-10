package it.sabafed.televisore.tv;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Main {

	public static void main(String[] args) {

		Calcola tv = new Calcola();
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			System.out.println("Inserisci un canale");
			int input = scanner.nextInt();
			
			tv.settaCanale(input);
			
			tv.stampaCanale();
		
		} catch (InputMismatchException inputMismatchException) {
		
			tv.getLogger().error(inputMismatchException);
		}

	}

}
