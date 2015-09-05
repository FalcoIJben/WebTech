package com.example.View;

import com.example.oefentoets.R;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

public class BerichtView extends View {
	private AttributeSet attrs;


	public BerichtView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		this.attrs = attrs;
		init();
	}
	public BerichtView(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.attrs = attrs;
		init();
	}
	public BerichtView(Context context) {
		super(context);
		init();
	}
	private void init(){
		LayoutInflater.from(getContext()).inflate(R.layout.bericht_item, (ViewGroup) findViewById(R.id.listViewberichten), false);
	}
	@Override
	protected void onDraw(Canvas canvas) {
		Paint paint = new Paint();
		canvas.drawCircle(50, 40, 10, paint);
	}
	
	
}
