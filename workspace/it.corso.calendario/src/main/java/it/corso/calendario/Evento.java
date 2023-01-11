package it.corso.calendario;

public class Evento {

	private String nome;
	private String descrizione;
	
	private int anno;
	private int mese;
	private int giorno;
	
	public Evento() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Evento(String nome, String descrizione, int anno, int mese, int giorno) {
		super();
		this.nome = nome;
		this.descrizione = descrizione;
		
		this.anno = anno;
		this.mese = mese;
		this.giorno = giorno;
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
	
	public int getAnno() {
		return anno;
	}
	
	public void setAnno(int anno) {
		this.anno = anno;
	}
	
	public int getMese() {
		return mese;
	}
	
	public void setMese(int mese) {
		this.mese = mese;
	}
	
	public int getGiorno() {
		return giorno;
	}
	
	public void setGiorno(int giorno) {
		this.giorno = giorno;
	}
}
