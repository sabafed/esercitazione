package it.sabafed.junit.calcolatrice.sottrazioneTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import it.sabafed.junit.calcolatrice.Calcolatrice;

public class SottrazioneDoubleTest {

	@Test
	void sottrazioneDoubleTest() {
		double a = 1.0;
		double b = 2.0;
		double diff = a - b;
		
		Calcolatrice calcolatrice = new Calcolatrice();
		
		assertEquals(diff, calcolatrice.sottrazione(a, b));
	}
}
