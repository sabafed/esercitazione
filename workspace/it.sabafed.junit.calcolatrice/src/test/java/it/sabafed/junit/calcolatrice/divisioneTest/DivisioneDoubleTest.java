package it.sabafed.junit.calcolatrice.divisioneTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import it.sabafed.junit.calcolatrice.Calcolatrice;

public class DivisioneDoubleTest {

	@Test
	void sommaDoubleTest() {
		double a = 1.0;
		double b = 2.0;
		double div = a/b;
		
		Calcolatrice calcolatrice = new Calcolatrice();
		
		assertEquals(div, calcolatrice.divisione(a, b));
	}
}
