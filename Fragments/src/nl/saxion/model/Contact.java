package nl.saxion.model;

import java.util.Observable;

public class Contact extends Observable{
	
	
	private String voornaam;
	private String achternaam;
	private int nummer;
	private String woonplaats;
	
	
	public Contact(String voornaam, String achternaam, int nummer, String woonplaats){
		this.voornaam = voornaam;
		this.achternaam = achternaam;
		this.nummer = nummer;
		this.woonplaats = woonplaats;
		
		
		
	}


	public String getVoornaam() {
		return voornaam;
	
		
	}


	public String getAchternaam() {
		return achternaam;
	}


	public int getNummer() {
		return nummer;
	}


	public String getWoonplaats() {
		return woonplaats;
	}


	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}


	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}


	public void setNummer(int nummer) {
		this.nummer = nummer;
	}


	public void setWoonplaats(String woonplaats) {
		this.woonplaats = woonplaats;
	}
	
	

}
