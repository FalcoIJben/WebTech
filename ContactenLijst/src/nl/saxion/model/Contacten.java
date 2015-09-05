package nl.saxion.model;

import java.util.ArrayList;

public class Contacten {
	

	private ArrayList<Contact> contacten = new ArrayList<Contact>();
	
	
	public void addContact(Contact contact){
		contacten.add(contact);
	}
	public ArrayList<Contact> getContacten(){
		return contacten;
	}

}
