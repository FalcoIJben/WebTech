package nl.saxion.view;

import java.util.ArrayList;
import java.util.List;

import nl.saxion.contactenlijst.R;
import nl.saxion.model.Contact;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ContactAdapter extends ArrayAdapter<Contact>{

	public ContactAdapter(Context context, int resource, ArrayList<Contact> objects) {
		super(context, resource, objects);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		View v = convertView;
		
		
		if(v == null){
			LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			v = inflater.inflate(R.layout.contact_item, parent, false);
		
		}
		
		Contact c = super.getItem(position);
		
		if(c != null){
			TextView naam = (TextView) v.findViewById(R.id.textViewNaam);
			TextView tussenV = (TextView) v.findViewById(R.id.textViewTV);
			TextView achterNaam = (TextView) v.findViewById(R.id.textViewAchterNaam);
			TextView nummer = (TextView) v.findViewById(R.id.textViewNummer);
			ImageView foto = (ImageView) v.findViewById(R.id.imageView);
			
			
			naam.setText(c.getVoorNaam() + " ");
			tussenV.setText(c.getTussenV() + " ");
			achterNaam.setText(c.getAchterNaam());
			nummer.setText("06"+c.getNummer());
			foto.setImageResource(c.getFoto());
			
		}
		
		
		return v;
	}
	
	
	
	
	
	

}
