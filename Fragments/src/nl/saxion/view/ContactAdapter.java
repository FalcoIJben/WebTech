package nl.saxion.view;

import java.util.ArrayList;
import java.util.List;

import nl.saxion.model.Contact;

import android.content.Context;
import android.widget.ArrayAdapter;

public class ContactAdapter extends ArrayAdapter<Contact>{

	public ContactAdapter(Context context, int resource, List<Contact> objects) {
		super(context, resource, objects);
		
	}

}
