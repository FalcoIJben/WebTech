package com.example.Model;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class BerichtenLijst extends Observable implements Observer{

	private ArrayList<Bericht> berichten = new ArrayList<Bericht>();
	
	public BerichtenLijst(){
		
	}
	
	public void update(Observable observable, Object data) {
		hasChanged();
		notifyObservers();
		
	}
	
	
	public Bericht getBericht(int index){
		return berichten.get(index);
	}
	public ArrayList<Bericht> getBerichten() {
		return berichten;
	}
	public void addBericht(Bericht bericht){
		berichten.add(bericht);
		bericht.addObserver(this);
	}

}
