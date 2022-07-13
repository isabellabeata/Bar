package it.polito.tdp.bar.model;

public class Statistiche {
	
	private int clientiTot;
	private int clientiSoddisfatti;
	private int clientiInsoddisfatti;
	
	
	
	//costruttore vuoto che andiamo ad aggiornare ogni volta con i metodi di incremento, per non
	//sovrascrivere ogni volta
	public Statistiche() {
		super();
		this.clientiTot = 0;
		this.clientiSoddisfatti = 0;
		this.clientiInsoddisfatti = 0;
	}
	
	public void incrementaClienti(int n) {
		this.clientiTot+=n;
	}
	
	public void incrementaSoddisfatti(int n) {
		this.clientiSoddisfatti+=n;
	}
	
	public void incrementaInsoddisfatti(int n) {
		this.clientiInsoddisfatti+=n;
	}

	public int getClientiTot() {
		return clientiTot;
	}

	public int getClientiSoddisfatti() {
		return clientiSoddisfatti;
	}

	public int getClientiInsoddisfatti() {
		return clientiInsoddisfatti;
	}
	
	
	
	
	
}
