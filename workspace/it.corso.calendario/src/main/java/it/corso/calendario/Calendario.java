package it.corso.calendario;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Calendario {

	private String nome;
	private String descrizione;
	private Set<Evento> eventi = new HashSet<>();
	
	public Calendario() {
		super();
	}
	
	public Calendario(String nome, String descrizione, Set<Evento> eventi) {
		super();
		this.nome = nome;
		this.descrizione = descrizione;
		this.eventi = eventi;
	}
	
	public void addEvento() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\tINSERISCI UN NOME PER QUESTO EVENTO");
		String nomeEv = scan.next();
		
		System.out.println("\tINSERISCI UNA DESCRIZIONE DI QUESTO EVENTO");
		String descrizioneEv = scan.next();
		
		System.out.println("\tINSERISCI UN GIORNO PER QUESTO EVENTO");
		int giornoEv = scan.nextInt();
		
		System.out.println("\tINSERISCI UN MESE PER QUESTO EVENTO");
		int meseEv = scan.nextInt();
		
		System.out.println("\tINSERISCI UN ANNO PER QUESTO EVENTO");
		int annoEv = scan.nextInt();
		
		Evento evento = new Evento(nomeEv,descrizioneEv,annoEv,meseEv,giornoEv);
		
		eventi.add(evento);
		
		scan.close();
		
		System.out.println("EVENTO AGGIUNTO AL CALENDARIO");
	}
	
	public void removeEvento(Evento evento) {
		eventi.remove(evento);
	}
	
	public void printAllEventi() {
		System.out.println("Eventi presenti nel calendario:");
		for (Evento e : eventi) {
			System.out.println("\t"+e);
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public Set<Evento> getEventi() {
		return eventi;
	}
	
	public void setEventi(Set<Evento> eventi) {
		this.eventi = eventi;
	}
}
