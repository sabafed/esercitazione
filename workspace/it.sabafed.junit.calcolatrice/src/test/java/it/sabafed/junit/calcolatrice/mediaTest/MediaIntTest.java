package it.sabafed.junit.calcolatrice.mediaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import it.sabafed.junit.calcolatrice.Calcolatrice;

public class MediaIntTest {

	@Test
	void potenzaDoubleTest() {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int e = 5;
		
		int[] numbers = new int[] {a,b,c,d,e};
		
		double mean = (a+b+c+d+e)/5;
		
		Calcolatrice calcolatrice = new Calcolatrice();
		
		assertEquals(mean, calcolatrice.media(numbers));
	}
}
