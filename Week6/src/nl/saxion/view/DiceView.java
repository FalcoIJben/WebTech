package nl.saxion.view; 

import java.util.Observable;
import java.util.Observer;

import nl.saxion.model.Dice;
import nl.saxion.model.Model;
import nl.saxion.week6.GooienAplicatie;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class DiceView extends View implements Observer{
	private int diceNumber = 1;
	private Paint paint;
	private Canvas canvas;
	private Model model;
	


	public DiceView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		init();
	}
	
	public DiceView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}
	public DiceView(Context context) {
		super(context);
		init();
	}
	
	private void init(){
		paint = new Paint();
		paint.setColor(Color.rgb(0, 0, 0));
		
		GooienAplicatie app = (GooienAplicatie) getContext().getApplicationContext();
		model = app.getModel();
		
		setWillNotDraw(false);
		
		
	}

	@Override
	public void onDraw(Canvas canvas) {
		Log.d("DEBUG","kijk eens aan");
		int radius = 15; 
		
		int leftPointX = (canvas.getWidth()/3);
		int rightPointX = (canvas.getWidth()/3*2);
		int middelPointX = (canvas.getWidth()/2);
			
		int topPointY = (canvas.getHeight()/4);
		int middlePointY = (canvas.getHeight()/4*2);
		int bottomPointY = (canvas.getHeight()/4*3);

		this.canvas = canvas;
		

		
		if(diceNumber==1){
			//draw 1
			canvas.drawCircle(middelPointX, middlePointY, radius, paint);
		} else if(diceNumber == 2){
			//draw 2
			canvas.drawCircle(leftPointX, topPointY, radius, paint);
			canvas.drawCircle(rightPointX, bottomPointY, radius, paint);
		} else if(diceNumber == 3){
			// draw 3
			canvas.drawCircle(leftPointX, topPointY, radius, paint);
			canvas.drawCircle(middelPointX, middlePointY, radius, paint);
			canvas.drawCircle(rightPointX, bottomPointY, radius, paint);
			
		} else if(diceNumber == 4){
			// draw 4
			
		} else if(diceNumber == 5){
			// draw 5
			
		} else {
			// draw 6

			canvas.drawCircle(leftPointX, topPointY, radius, paint);
			canvas.drawCircle(leftPointX, middlePointY, radius, paint);
			canvas.drawCircle(leftPointX, bottomPointY, radius, paint);
		
			canvas.drawCircle(rightPointX, topPointY, radius, paint);
			canvas.drawCircle(rightPointX, middlePointY, radius, paint);
			canvas.drawCircle(rightPointX, bottomPointY, radius, paint);
		}
		
		
		
		
		
	}

	@Override
	public void update(Observable observable, Object data) {
		Dice dice = (Dice) data;
		diceNumber = dice.getNumber();
		Log.d("DEBUG", "LOL"+diceNumber);
		
		this.invalidate();
		
		
		
		
	}

	
	

	
	
	
}
