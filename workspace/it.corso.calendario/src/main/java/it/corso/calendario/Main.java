package it.corso.calendario;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Main {

	final static Logger logger = Logger.getLogger(Main.class);
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("BENVENUTO IN CALENDARIO");
		
		try {
			System.out.println("INSERISCI UN NOME PER QUESTO CALENDARIO");
			String nomeCal = scan.next();
			
			System.out.println("INSERISCI UNA DESCRIZIONE DI QUESTO CALENDARIO");
			String descrizioneCal = scan.next();
			
			// Creazione istanza di calendario
			Calendario cal = new Calendario();
			// Set nome e descrizione calendario
			cal.setNome(nomeCal);
			cal.setDescrizione(descrizioneCal);
						
			System.out.println("INSERISCI IL PRIMO EVENTO NEL CALENDARIO:");
			
			cal.addEvento();
			
		} catch (IllegalArgumentException illegalArgumentException) {
			
			logger.error(illegalArgumentException);
		
		} catch (Exception exception) {
		
			logger.warn("Eccezione:", exception);
			
		}
	}
}
