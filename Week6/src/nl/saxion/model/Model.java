package nl.saxion.model;

import java.util.Observable;

import android.util.Log;

public class Model extends Observable{
	
	private int kever;
	private int voelsprieten;
	private Dice dice1 = new Dice();
	private Dice dice2 = new Dice();
	private Dice dice3 = new Dice();
	
	
	
	public Model(){
		
	}
	
	public Dice getDice1() {
		return dice1;
	}
	public Dice getDice2() {
		return dice2;
	}
	public Dice getDice3() {
		return dice3;
	}
	public void rollDices(){
		dice1.roll();
		dice2.roll();
		dice3.roll();
		Log.d("DEBUG","jatoch");
		
		
	}
	
	
	
	
	
	
	
	
	
}
