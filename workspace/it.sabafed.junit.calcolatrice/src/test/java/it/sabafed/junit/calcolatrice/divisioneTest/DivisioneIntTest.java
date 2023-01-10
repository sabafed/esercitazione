package it.sabafed.junit.calcolatrice.divisioneTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import it.sabafed.junit.calcolatrice.Calcolatrice;

public class DivisioneIntTest {
	@Test
	void sommaDoubleTest() {
		int a = 1;
		int b = 2;
		double div = a/b;
		
		Calcolatrice calcolatrice = new Calcolatrice();
		
		assertEquals(div, calcolatrice.divisione(a, b));
	}
}
