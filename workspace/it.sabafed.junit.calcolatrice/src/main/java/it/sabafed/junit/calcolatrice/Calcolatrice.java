package it.sabafed.junit.calcolatrice;

public class Calcolatrice {

	public Calcolatrice() {
		super();
	}
	
	
	public int somma(int a, int b) {
		return Integer.sum(a, b);
	}
	
	public double somma(double a, double b) {
		return Double.sum(a, b);
	}
	
	public int sottrazione(int a, int b) {
		return (a - b);
	}
	
	public double sottrazione(double a, double b) {
		return (a - b);
	}
	
	public double divisione(int a, int b) {
		
		if (b == 0) {
			throw new IllegalArgumentException("Division by zero");
		}
		
		return a / b;
	}
	
	
	public double divisione(double a, double b) {
		
		if (b == 0.0) {
			throw new IllegalArgumentException("Division by zero");
		}
		
		return (a / b);
	}
	
	public double potenza(int a, int b) {
		return Math.pow(a, b);
	}
	
	public double potenza(double a, double b) {
		return Math.pow(a, b);
	}
	
	
	public double media(int[] numbers) {
		
		if (numbers.length == 0) {
			throw new IllegalArgumentException("Division by zero");
		}
		
		double mean = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			mean += numbers[i];
		}
		
		return mean / numbers.length; 
	}
	
	public double media(double[] numbers) {
		
		if (numbers.length == 0) {
			throw new IllegalArgumentException("Division by zero");
		}
		
		
		double mean = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			mean += numbers[i];
		}
		
		return mean / numbers.length; 
	}
}
