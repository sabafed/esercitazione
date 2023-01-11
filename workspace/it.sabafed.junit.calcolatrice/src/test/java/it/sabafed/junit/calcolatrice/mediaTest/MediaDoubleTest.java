package it.sabafed.junit.calcolatrice.mediaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import it.sabafed.junit.calcolatrice.Calcolatrice;

public class MediaDoubleTest {

	@Test
	void potenzaDoubleTest() {
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
