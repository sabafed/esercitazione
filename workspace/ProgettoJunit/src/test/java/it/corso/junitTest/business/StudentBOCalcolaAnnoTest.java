package it.corso.junitTest.business;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import it.corso.junitTest.model.Student;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentBOCalcolaAnnoTest {
	
	@Test
	void calcolaAnnoTest() {
		String nome = "TestNome";
        String cognome = "TestCognome";
        int age = 10;
        long matr = 123456;
        
        int yearOfBirth = 2023 - age;
        
        Student student = new Student(nome,cognome,age,matr);
        
        StudentBO studentBO = new StudentBO();
        
        int calcolaAnno = studentBO.calcolaAnno(student);
        
        /*
         * To fail the test:
         * 		assertNotEquals(yearOfBirth,calcolaAnno);
         */
        assertEquals(yearOfBirth,calcolaAnno);
	}
}
