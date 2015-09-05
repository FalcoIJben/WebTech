package com.example.oefentoets;

import com.example.Model.Bericht;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

public class EditActivity extends Activity{
	private Bericht bericht;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edit);
		OefenToetsApp app = (OefenToetsApp) getApplicationContext();
		bericht = app.getModel().getBericht(getIntent().getIntExtra("position", 0));
		
		TextView sender = (TextView) findViewById(R.id.textVieweditSender);
		TextView message = (TextView) findViewById(R.id.textVieweditMessage);
		EditText priority = (EditText) findViewById(R.id.editTextPriority);
		CheckBox isRead = (CheckBox) findViewById(R.id.checkBoxoIsRead);
		
		sender.setText(bericht.getSender());
		message.setText(bericht.getMessage());
		priority.setText(""+bericht.getPriority());
		isRead.setChecked(bericht.isRead());
		
		priority.setOnEditorActionListener(new OnEditorActionListener() {
			
			@Override
			public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
				
					if(v.getText().charAt(0) == '1'){
						bericht.setPriority(1);
						
					} else if(v.getText().charAt(0) == '2'){
						bericht.setPriority(2);
						
					} else if(v.getText().charAt(0) == '3'){
						bericht.setPriority(2);
						
					}
					v.setText(""+bericht.getPriority());
				
				return true;
			}
		});
		
		isRead.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				bericht.setIsRead(isChecked);
				
			}
		});
		
	}
	

}
