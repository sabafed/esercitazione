package it.sabafed.junit.calcolatrice.potenzaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import it.sabafed.junit.calcolatrice.Calcolatrice;

public class PotenzaIntTest {

	@Test
	void potenzaIntTest() {
		int a = 1;
		int b = 2;
		
		double pow = Math.pow(a, b);
		
		Calcolatrice calcolatrice = new Calcolatrice();
		
		assertEquals(pow, calcolatrice.potenza(a, b));
	}
}
