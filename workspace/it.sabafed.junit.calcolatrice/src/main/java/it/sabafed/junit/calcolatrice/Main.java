package it.sabafed.junit.calcolatrice;

public class Main {

	public static void main(String[] args) {
		
		int int0 = 0;
		int int1 = 1;
		int int2 = 2;
		int int9 = 9;
		
		double d1 = 1.2;
		double d2 = 2.3;
		double d3 = 3.4;
		double d4 = 4.5;
		double d5 = 5.6;
		
		System.out.println("Esercizio Calcolatrice!");
		Calcolatrice calc = new Calcolatrice();
		
		// Somma int
		System.out.println(int2+" + "+int0+" = "+calc.somma(int2, int0));
		
		// Sottrazione double
		System.out.println(d5+" - "+d3+" = "+calc.sottrazione(d5, d3));
		
		// Divisione double
		System.out.println(d2+" / "+d1+" = "+calc.divisione(d2, d1));
		
		try {
			// Divisione int (con eccezione)
			System.out.println(int9+" / "+int0+" = "+calc.divisione(int9, int0));
		} catch (Exception Exception) {
		}
		
		
		// Potenza int
		System.out.println(int1+" ^"+int2+" = "+calc.potenza(int1, int2));
		
		// Media double
		System.out.println(
				d1+" + "+
				d2+" + "+
				d3+" + "+
				d4+" + "+
				d5+" / 5 = "+
				calc.media(new double[] {d1,d2,d3,d4,d5}));
	}
}
