package nl.saxion.week6;

import nl.saxion.model.Model;



import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import nl.saxion.view.DiceView;

public class MainActivity extends Activity {

	
	private DiceView diceView1, diceView2, diceView3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		GooienAplicatie app = (GooienAplicatie) getBaseContext().getApplicationContext();
		Model model = app.getModel();
		
		
		
		diceView1 = (DiceView)findViewById(R.id.DiceView1);
		diceView2 = (DiceView)findViewById(R.id.diceView2);
		diceView3 = (DiceView)findViewById(R.id.diceView3);
		
		
		
		
		
		
	
		
		
		
		
		model.getDice1().addObserver(diceView1);
		model.getDice2().addObserver(diceView2);
		model.getDice3().addObserver(diceView3);
		
		
	
		
		
		
		
		model.rollDices();
		
		model.rollDices();
		model.rollDices();model.rollDices();
		
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
