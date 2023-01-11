package it.sabafed.junit.calcolatrice.divisioneTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
	
		// Testing Illegal argument (division by zero) 
		IllegalArgumentException illegalArgumentException =
	                assertThrows(IllegalArgumentException.class,
	                        () -> calcolatrice.divisione(a,0));
		
		assertEquals("Division by zero", illegalArgumentException.getMessage());
		
	}
}
