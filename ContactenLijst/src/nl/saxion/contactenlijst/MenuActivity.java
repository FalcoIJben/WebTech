package nl.saxion.contactenlijst;

import java.util.ArrayList;

import nl.saxion.model.Contact;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MenuActivity extends Activity {
	
	ArrayList<Contact> contacen = new ArrayList<Contact>();
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		
		
		
		Button ok = (Button) findViewById(R.id.buttonOK);
		EditText naam = (EditText) findViewById(R.id.editTextVN);
		EditText achterNaam = (EditText) findViewById(R.id.editTextAN);
				
		naam.setText(getIntent().getCharSequenceExtra("naam"));

		
		achterNaam.setText(getIntent().getCharSequenceExtra("achternaam"));
		
		
		
		ok.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
				
			}
		});
		
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
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
