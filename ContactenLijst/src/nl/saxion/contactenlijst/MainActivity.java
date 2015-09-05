package nl.saxion.contactenlijst;

import java.util.ArrayList;

import nl.saxion.model.Contact;
import nl.saxion.view.ContactAdapter;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	private ListView list;
	private ArrayList<Contact> contacten = new ArrayList<Contact>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		ContactAdapter adapter = new ContactAdapter(this, R.layout.contact_item, contacten);
		Contact ik = new Contact("Falco","IJben", "52648206", R.drawable.ic_launcher);
		contacten.add(ik);
		contacten.add(ik);
		contacten.add(ik);
		
		list = (ListView) findViewById(R.id.listView1);
		
		list.setItemsCanFocus(true);
		list.setAdapter(adapter);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Contact clickedContact = (Contact) parent.getItemAtPosition(position);
				
			    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
			    intent.putExtra("naam", clickedContact.getVoorNaam());
			    intent.putExtra("achternaam", clickedContact.getAchterNaam());
			    
			    startActivity(intent);
			}
			
		});
		
		
		
		
		
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
