package com.example.fragments;

import nl.saxion.model.ContactenLijst;
import android.app.Application;

public class FragmentAplicatie extends Application {
	
	private ContactenLijst contactenLijst;

	@Override
	public void onCreate() {
		super.onCreate();
		
		contactenLijst = new ContactenLijst();
		
		
		
	}
	public ContactenLijst getcontactenLijst(){
		return contactenLijst;
	}

	
	
	
	
}
