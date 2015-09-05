package nl.saxion.week6;

import nl.saxion.model.Model;
import nl.saxion.view.DiceView;
import android.app.Application;
import android.util.Log;
import nl.saxion.week6.R;


public class GooienAplicatie extends Application{

	
	private Model model;

	@Override
	public void onCreate() {
		model = new Model();
		
		
	
		super.onCreate();
		
		
		
		
		
		
	}
	public Model getModel(){
		return model;
	}

	
	

}
