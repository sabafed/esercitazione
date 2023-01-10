package it.sabafed.junit.calcolatrice.potenzaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import it.sabafed.junit.calcolatrice.Calcolatrice;

public class PotenzaDoubleTest {

	@Test
	void potenzaDoubleTest() {
		double a = 1.0;
		double b = 2.0;
		
		double pow = Math.pow(a, b);
		
		Calcolatrice calcolatrice = new Calcolatrice();
		
		assertEquals(pow, calcolatrice.potenza(a, b));
	}
}
