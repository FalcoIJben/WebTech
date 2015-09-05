package com.example.testing;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Toast;

public class OnSwipeListener implements OnTouchListener{
	
	private Context context;
	private float Xstart;
	
	public OnSwipeListener(Context context){
		this.context = context;
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		if(event.getActionMasked() == MotionEvent.ACTION_DOWN){
			//begin van swipe
			Xstart = event.getX();
			
			
		} else if(event.getActionMasked() == MotionEvent.ACTION_UP){
			if(event.getX() < (Xstart-50)){
				//naar links
				Toast.makeText(context, "naar links", Toast.LENGTH_SHORT).show();
			} else if(event.getX() > (Xstart+50)){
				//naar rechts
				Toast.makeText(context, "naar rechts", Toast.LENGTH_SHORT).show();
			}
		}
		return true;
	}

}
