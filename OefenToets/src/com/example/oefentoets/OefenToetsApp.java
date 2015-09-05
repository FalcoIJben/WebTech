package com.example.oefentoets;

import java.util.Observable;
import java.util.Observer;

import com.example.Model.BerichtenLijst;

import android.app.Application;
import android.util.Log;

public class OefenToetsApp extends Application implements Observer {
	
	private BerichtenLijst model;

	@Override
	public void onCreate() {
		
		model = new BerichtenLijst();
		model.addObserver(this);
		Log.d("App", "dit doet het");
		super.onCreate();
		
	}
	public BerichtenLijst getModel(){
		return model;
	}
	@Override
	public void update(Observable observable, Object data) {
		
		
	}
	
	

}
