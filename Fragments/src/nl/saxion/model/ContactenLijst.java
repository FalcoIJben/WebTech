package nl.saxion.model;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class ContactenLijst extends Observable implements Observer {
	
	private ArrayList<Contact> contacten = new ArrayList<Contact>();

	public ContactenLijst(){
		
	}
	
	public void addContact(String voornaam, String achternaam, int nummer, String woonplaats){
		contacten.add(new Contact(voornaam, achternaam, nummer, woonplaats));
		notifyObservers();
	}
	public void removeContact(int position){
		contacten.remove(position);
	}
	
	
	
	
	
	
	@Override
	public void update(Observable observable, Object data) {
		setChanged();
		notifyObservers();
		
	}

}
