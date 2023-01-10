package it.sabafed.junit.calcolatrice.sommaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import it.sabafed.junit.calcolatrice.Calcolatrice;

public class SommaDoubleTest {

	@Test
	void sommaDoubleTest() {
		double a = 1.0;
		double b = 2.0;
		double sum = a+b;
		
		Calcolatrice calcolatrice = new Calcolatrice();
		
		assertEquals(sum, calcolatrice.somma(a, b));
	}
}
