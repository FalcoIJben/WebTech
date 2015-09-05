package com.example.View;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import com.example.Model.Bericht;
import com.example.Model.BerichtenLijst;
import com.example.oefentoets.OefenToetsApp;
import com.example.oefentoets.R;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class BerichtenAdapter extends ArrayAdapter<Bericht>{
	private ArrayList<Bericht> berichten;
	private int resource;
	

	public BerichtenAdapter(Context context, int resource, List<Bericht> objects) {
		
		super(context, resource, objects);
		
		this.resource = resource;
		OefenToetsApp app = (OefenToetsApp) getContext().getApplicationContext();
		berichten = app.getModel().getBerichten();
		
		
		
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		Bericht bericht = berichten.get(position);
		
		if(convertView == null){
			convertView = LayoutInflater.from(getContext()).inflate(resource, parent, false);
		}
		
		
		TextView sender = (TextView) convertView.findViewById(R.id.TextViewSender);
		TextView message = (TextView) convertView.findViewById(R.id.textViewMessage);
		
		
		
		sender.setText(bericht.getSender());
		message.setText(bericht.getMessage());	
		
		
		
		
		
		return convertView;
	}
	
	
	
}
