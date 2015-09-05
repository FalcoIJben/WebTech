package com.example.test;

import android.util.Log;
import android.view.DragEvent;
import android.view.View;



public class OnDragListener implements android.view.View.OnDragListener{
	final int AIR_VIEW_ID = 2;
	final int EARTH_VIEW_ID = 3;
	final int ELEC_VIEW_ID = 4;
	final int FIRE_VIEW_ID = 5;
	final int FROST_VIEW_ID = 6;
	final int NATURE_VIEW_ID = 7;
	


	@Override
	public boolean onDrag(View v, DragEvent event) {
		
		Log.d("Drag", "Drag");
		// if event can be handled/will be handled return true
		// else false
		
		if(event.getAction()==DragEvent.ACTION_DRAG_STARTED){
			Log.d("Drag", "Drag started");
			
			
			// return true, anders krijgt de handler geen verdere info
			return true;
			
		} else if(event.getAction()==DragEvent.ACTION_DRAG_ENTERED){
			return true;
			
		} else if(event.getAction()==DragEvent.ACTION_DRAG_LOCATION){
			return true;
			
		} else if(event.getAction()==DragEvent.ACTION_DRAG_EXITED){
			return true;
			
		} else if(event.getAction()==DragEvent.ACTION_DROP){
			//hier moet worden bepaald welke toren het wordt.
			// door:
			int id = v.getId();
			if(id == AIR_VIEW_ID){
				// plaats air tower
				//enz.
				Log.d("Tower", "plaats: air");
				
			} else if(id == EARTH_VIEW_ID){
				Log.d("Tower", "plaats: earth");
				
			} else if(id == ELEC_VIEW_ID){
				Log.d("Tower", "plaats: elec");
				
			} else if(id == FIRE_VIEW_ID){
				Log.d("Tower", "plaats: fire");
				
			} else if(id == FROST_VIEW_ID){
				Log.d("Tower", "plaats: frost");
				
			} else if(id == NATURE_VIEW_ID){
				Log.d("Tower", "plaats: nature");
				
			} else {
				//geen toren plaatsten 
				Log.d("Tower", "plaats: niks");
			}
			
			
			
			return true;
			
		} else if(event.getAction()==DragEvent.ACTION_DRAG_ENDED){
			// geef menu niet meer weer
			
		} 
		
		return false;
		
		
		
	
	}

}
