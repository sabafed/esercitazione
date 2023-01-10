package it.sabafed.junit.calcolatrice.sottrazioneTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import it.sabafed.junit.calcolatrice.Calcolatrice;

public class SottrazioneIntTest {

	@Test
	void sottrazioneIntTest() {
		int a = 1;
		int b = 2;
		int diff = a - b;
		
		Calcolatrice calcolatrice = new Calcolatrice();
		
		assertEquals(diff, calcolatrice.sottrazione(a, b));
	}
}
