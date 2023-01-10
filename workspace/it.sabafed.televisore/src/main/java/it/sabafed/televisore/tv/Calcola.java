package it.sabafed.televisore.tv;

import org.apache.log4j.Logger;

public class Calcola {
	
	final static Logger logger = Logger.getLogger(Calcola.class);
	private int canale;
	
	public void stampaCanale() {
		logger.info("Canale stampato:"+canale);
	}
	
	public void settaCanale(int canale) {
		this.canale = canale;
		logger.info("Canale settato:"+this.canale);
	}

	public static Logger getLogger() {
		return logger;
	}
}
