package com.example.oefentoets;

import java.util.Observable;
import java.util.Observer;

import com.example.Model.Bericht;
import com.example.Model.BerichtenLijst;
import com.example.View.BerichtenAdapter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends Activity implements Observer {
	private BerichtenLijst berichten;
	private BerichtenAdapter adapter;
	private ListView listView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		OefenToetsApp app = (OefenToetsApp) getApplicationContext();
		berichten = app.getModel();
		berichten.addObserver(this);
		
		berichten.addBericht(new Bericht("Lekker dan", "ikke", 3));
		berichten.addBericht(new Bericht("dit is een test", "nobody", 3));
		berichten.addBericht(new Bericht("was lekker gister", "je Moeder", 3));
		
		adapter = new BerichtenAdapter(this, R.layout.bericht_item, berichten.getBerichten());
		
		listView = (ListView) findViewById(R.id.listViewberichten);
		listView.setAdapter(adapter);
		
		listView.setOnItemClickListener(new ItemClicked());
		
		
		
		
		
		
		
		
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
	private void startEditActivity(int position){
		Intent intent = new Intent(this, EditActivity.class);
		intent.putExtra("position", position);
		startActivity(intent);
		
	}
	
	public class ItemClicked implements OnItemClickListener{

		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
			startEditActivity(position);
			
			
		}
		
	}
	

	@Override
	public void update(Observable observable, Object data) {
		adapter.notifyDataSetChanged();
		
	}
}
