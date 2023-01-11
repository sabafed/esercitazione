package it.corso.junitTest.business;

import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

public class StudentBOConstructorTest {

	@Test
	void StudentBOConstructorTest() {
		
		StudentBO studentBO = new StudentBO();
		
		assertSame(studentBO.getClass(), StudentBO.class);
	}
}
