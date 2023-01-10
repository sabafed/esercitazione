package it.sabafed.junit.calcolatrice.sommaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import it.sabafed.junit.calcolatrice.Calcolatrice;

public class SommaIntTest {

	@Test
	void sommaIntTest() {
		int a = 1;
		int b = 2;
		int sum = a+b;
		
		Calcolatrice calcolatrice = new Calcolatrice();
		
		assertEquals(sum, calcolatrice.somma(a, b));
	}
}
