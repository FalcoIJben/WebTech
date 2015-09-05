package nl.saxion.model;

import java.util.Observable;

import android.util.Log;

public class Dice extends Observable{
	private int number;

	public Dice(){
		number = 6;
	}
	
	public void roll(){
		number = (int) (Math.random()*5+1.9);
		Log.d("debug", "" + number);
		setChanged();
		
		notifyObservers(this);
	} 
	public int getNumber(){
		return number;
	}
	
	
}
