package it.corso.calendarioTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import it.corso.calendario.Calendario;
import it.corso.calendario.Evento;

public class CalendarioTest {

	@Test
	void CalendarioSuperTest(){
		Calendario cal = new Calendario();
		
		assertSame(Calendario.class, cal.getClass());
	}
	
	@Test
	void CalendarioFieldTest(){
		Evento ev1 = new Evento();
		Evento ev2 = new Evento();
		
		Set<Evento> eventi = new HashSet<>();
		eventi.add(ev1);
		eventi.add(ev2);
		
		Calendario cal = new Calendario("nome","descrizione",eventi);
		
		assertSame(Calendario.class, cal.getClass());
	}
	
	@Test
	void removeEventoTest() {
		Evento ev1 = new Evento();
		
		Set<Evento> eventi = new HashSet<>();
		eventi.add(ev1);

		Calendario cal = new Calendario("nome","descrizione",eventi);
		
		cal.removeEvento(ev1);
		
		assertEquals(0,cal.getEventi().size());
	}
}
