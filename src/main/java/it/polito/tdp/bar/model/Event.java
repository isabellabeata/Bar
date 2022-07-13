package it.polito.tdp.bar.model;

import java.time.Duration;


public class Event implements Comparable<Event> {
	
	//1.cercare di capire quante tipologie di evento abbiamo (se 1, non ci preoccupiamo)
	//in questo esempio arrivo dei clienti, e quando i clienti lasciano il tavolo
	
	public enum EventType{
		ARRIVO_GRUPPO_CLIENTI,
		TAVOLO_LIBERATO
	}
	
	//definisco l'attributo del singolo evento
	private EventType type;
	private Duration time;
	private int persone;
	private Duration durata;
	private double tolleranza;
	private Tavolo tavolo;
	
	public Event(EventType type, Duration time, int persone, Duration durata, double tolleranza, Tavolo tavolo) {
		super();
		this.type = type;
		this.time = time;
		this.persone = persone;
		this.durata = durata;
		this.tolleranza = tolleranza;
		this.tavolo = tavolo;
	}
	public EventType getType() {
		return type;
	}
	public void setType(EventType type) {
		this.type = type;
	}
	public Duration getTime() {
		return time;
	}
	public void setTime(Duration time) {
		this.time = time;
	}
	public int getPersone() {
		return persone;
	}
	public void setPersone(int persone) {
		this.persone = persone;
	}
	public Duration getDurata() {
		return durata;
	}
	public void setDurata(Duration durata) {
		this.durata = durata;
	}
	public double getTolleranza() {
		return tolleranza;
	}
	public void setTolleranza(double tolleranza) {
		this.tolleranza = tolleranza;
	}
	public Tavolo getTavolo() {
		return tavolo;
	}
	public void setTavolo(Tavolo tavolo) {
		this.tavolo = tavolo;
	}
	@Override
	public int compareTo(Event o) {
		
		return this.getTime().compareTo(o.getTime());
	}


}
