package it.sabafed.junit.calcolatrice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalcolatriceTest {

	@Test
	void sommaIntTest() {
		int a = 1;
		int b = 2;
		int sum = a+b;
		
		Calcolatrice calcolatrice = new Calcolatrice();
		
		assertEquals(sum, calcolatrice.somma(a, b));
	}
	
	@Test
	void sommaDoubleTest() {
		double a = 1.0;
		double b = 2.0;
		double sum = a+b;
		
		Calcolatrice calcolatrice = new Calcolatrice();
		
		assertEquals(sum, calcolatrice.somma(a, b));
	}
	
	@Test
	void sottrazioneIntTest() {
		int a = 1;
		int b = 2;
		int diff = a - b;
		
		Calcolatrice calcolatrice = new Calcolatrice();
		
		assertEquals(diff, calcolatrice.sottrazione(a, b));
	}
	
	@Test
	void sottrazioneDoubleTest() {
		double a = 1.0;
		double b = 2.0;
		double diff = a - b;
		
		Calcolatrice calcolatrice = new Calcolatrice();
		
		assertEquals(diff, calcolatrice.sottrazione(a, b));
	}
	
	@Test
	void divisioneIntTest() {
		int a = 1;
		int b = 2;
		double div = a/b;
		
		Calcolatrice calcolatrice = new Calcolatrice();
		
		assertEquals(div, calcolatrice.divisione(a, b));
	
		// Testing Illegal argument (division by zero) 
		IllegalArgumentException illegalArgumentException =
	                assertThrows(IllegalArgumentException.class,
	                        () -> calcolatrice.divisione(a,0));
		
		assertEquals("Division by zero", illegalArgumentException.getMessage());
	}
	
	@Test
	void divisioneDoubleTest() {
		double a = 1.0;
		double b = 2.0;
		double div = a/b;
		
		Calcolatrice calcolatrice = new Calcolatrice();
		
		
		assertEquals(div, calcolatrice.divisione(a, b));
		
		// Testing Illegal argument (division by zero) 
		IllegalArgumentException illegalArgumentException =
	                assertThrows(IllegalArgumentException.class,
	                        () -> calcolatrice.divisione(a,0.0));
		
		assertEquals("Division by zero", illegalArgumentException.getMessage());
	}
	
	@Test
	void potenzaIntTest() {
		int a = 1;
		int b = 2;
		
		double pow = Math.pow(a, b);
		
		Calcolatrice calcolatrice = new Calcolatrice();
		
		assertEquals(pow, calcolatrice.potenza(a, b));
	}
	
	@Test
	void potenzaDoubleTest() {
		double a = 1.0;
		double b = 2.0;
		
		double pow = Math.pow(a, b);
		
		Calcolatrice calcolatrice = new Calcolatrice();
		
		assertEquals(pow, calcolatrice.potenza(a, b));
	}
	
	@Test
	void mediaIntTest() {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int e = 5;
		
		int[] numbers = new int[] {a,b,c,d,e};
		int[] empty = new int[] {};
		
		double mean = (a+b+c+d+e)/5;
		
		Calcolatrice calcolatrice = new Calcolatrice();
		
		assertEquals(mean, calcolatrice.media(numbers));
		
		// Testing Illegal argument (division by zero) 
		IllegalArgumentException illegalArgumentException =
				assertThrows(IllegalArgumentException.class,
						() -> calcolatrice.media(empty));
		
		assertEquals("Division by zero", illegalArgumentException.getMessage());
	}
	
	@Test
	void mediaDoubleTest() {
		double a = 1.0;
		double b = 2.0;
		double c = 3.0;
		double d = 4.0;
		double e = 5.0;
		
		double[] numbers = new double[] {a,b,c,d,e};
		double[] empty = new double[] {};
		
		double mean = (a+b+c+d+e)/5;
		
		Calcolatrice calcolatrice = new Calcolatrice();
		
		
		assertEquals(mean, calcolatrice.media(numbers));
		
		// Testing Illegal argument (division by zero) 
		IllegalArgumentException illegalArgumentException =
	                assertThrows(IllegalArgumentException.class,
	                        () -> calcolatrice.media(empty));
		
		assertEquals("Division by zero", illegalArgumentException.getMessage());
	}
}
