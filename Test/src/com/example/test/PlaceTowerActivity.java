package com.example.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RelativeLayout;


public class PlaceTowerActivity extends Activity {
		private static boolean spacedTop = true;
    	private static boolean spacedLeft = true;
    	private float offSetX = 0; //-470
    	private float offSetY = 0; //-710
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        
        
        
            

            // Creating a new RelativeLayout
            RelativeLayout relativeLayout = new RelativeLayout(this);

            // Defining the RelativeLayout layout parameters.
            // In this case I want to fill its parent
            RelativeLayout.LayoutParams rlp = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.MATCH_PARENT,
                    RelativeLayout.LayoutParams.MATCH_PARENT);
            

            // Creating a new ImageView
            ImageView ivCenter = new ImageView(this);
            ivCenter.setImageResource(R.drawable.ic_launcher);
            ivCenter.setId(1);
            ImageView ivAir = new ImageView(this);
            ivAir.setImageResource(R.drawable.air_level_1);
            ivAir.setId(2);
            ImageView ivEarth = new ImageView(this);
            ivEarth.setImageResource(R.drawable.earth_level_1);
            ivEarth.setId(3);
            ImageView ivElec = new ImageView(this);
            ivElec.setImageResource(R.drawable.elec_level_1);
            ivElec.setId(4);
            ImageView ivFire = new ImageView(this);
            ivFire.setImageResource(R.drawable.fire_level_1);
            ivFire.setId(5);
            ImageView ivFrost = new ImageView(this);
            ivFrost.setImageResource(R.drawable.frost_level_1);
            ivFrost.setId(6);
            ImageView ivNature = new ImageView(this);
            ivNature.setImageResource(R.drawable.nature_level_1);
            ivNature.setId(7);
            
            
            // TextView tv = new TextView(this);
            // tv.setText("Test");

            // Defining the layout parameters of the ImageView
            RelativeLayout.LayoutParams center = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT);
            center.addRule(RelativeLayout.CENTER_IN_PARENT);
            //center.addRule(RelativeLayout.CENTER_IN_PARENT);
            
            
            //Deze shit kan je  gebruiken om het op de goeie plaats te laten komen
            //offset X
            ivCenter.setTranslationX(offSetX);
            ivAir.setTranslationX(offSetX);
            ivEarth.setTranslationX(offSetX);
            ivElec.setTranslationX(offSetX);
            ivFire.setTranslationX(offSetX);
            ivFrost.setTranslationX(offSetX);
            ivNature.setTranslationX(offSetX);
            
            //offset Y
            ivCenter.setTranslationY(offSetY);
            ivAir.setTranslationY(offSetY);
            ivEarth.setTranslationY(offSetY);
            ivElec.setTranslationY(offSetY);
            ivFire.setTranslationY(offSetY);
            ivFrost.setTranslationY(offSetY);
            ivNature.setTranslationY(offSetY);
         
            
            

            
            // Setting the parameters on the Image
            ivCenter.setLayoutParams(center);
            
            // hier kan je bepalen waar je de opties wilt tekenen.
            if(spacedTop){
            	ivAir.setLayoutParams(getRLPAbove(ivCenter));
            	ivEarth.setLayoutParams(getRLPAbove(ivAir));
            	ivElec.setLayoutParams(getRLPAbove(ivEarth));
            	
            	
            } else {
            	ivAir.setLayoutParams(getRLPBelow(ivCenter));
            	ivEarth.setLayoutParams(getRLPBelow(ivAir));
            	ivElec.setLayoutParams(getRLPBelow(ivEarth));
            }
            if(spacedLeft){
            	ivFire.setLayoutParams(getRLPLeft(ivCenter));
            	ivFrost.setLayoutParams(getRLPLeft(ivFire));
            	ivNature.setLayoutParams(getRLPLeft(ivFrost));
            } else {
            	ivFire.setLayoutParams(getRLPRight(ivCenter));
            	ivFrost.setLayoutParams(getRLPRight(ivFire));
            	ivNature.setLayoutParams(getRLPRight(ivFrost));
            }
            
            
            

            
           

            // Adding the Image to the RelativeLayout as a child
            relativeLayout.addView(ivCenter);
            relativeLayout.addView(ivAir);
            relativeLayout.addView(ivEarth);
            relativeLayout.addView(ivElec);
            relativeLayout.addView(ivFire);
            relativeLayout.addView(ivFrost);
            relativeLayout.addView(ivNature);
            
            
			
	        OnTouchedListener touchListener = new OnTouchedListener(spacedTop, spacedLeft);
	        
	        ivCenter.setOnTouchListener(touchListener);
	        ivAir.setOnTouchListener(touchListener);
	        ivEarth.setOnTouchListener(touchListener);
	        ivElec.setOnTouchListener(touchListener);
	        ivFire.setOnTouchListener(touchListener);
	        ivFrost.setOnTouchListener(touchListener);
	        ivNature.setOnTouchListener(touchListener);
	        
         
           

            // Setting the RelativeLayout as our content view
            setContentView(relativeLayout, rlp);
            
           
           
           
           
           
    }
    /**
     * 
     * @param parent the view to align with
     * @return the LayoutParams of the view
     */
    private RelativeLayout.LayoutParams getRLPAbove (ImageView parent){
    	RelativeLayout.LayoutParams rlReturn = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
    	rlReturn.addRule(RelativeLayout.ABOVE, parent.getId());
    	if(spacedLeft){
    		rlReturn.addRule(RelativeLayout.ALIGN_LEFT, parent.getId());
    	} else {
    		rlReturn.addRule(RelativeLayout.ALIGN_RIGHT, parent.getId());
    	}
    	
    	return rlReturn;
    }
    /**
     * 
     * @param parent the view to align with
     * @return the LayoutParams of the view
     */
    private RelativeLayout.LayoutParams getRLPBelow (ImageView parent){
    	RelativeLayout.LayoutParams rlReturn = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
    	rlReturn.addRule(RelativeLayout.BELOW, parent.getId());
    	if(spacedLeft){
    		rlReturn.addRule(RelativeLayout.ALIGN_LEFT, parent.getId());
    	} else {
    		rlReturn.addRule(RelativeLayout.ALIGN_RIGHT, parent.getId());
    	}
    	
    	return rlReturn;
    }
    /**
     * 
     * @param parent the view to align with
     * @return the LayoutParams of the view
     */
    private RelativeLayout.LayoutParams getRLPLeft (ImageView parent){
    	RelativeLayout.LayoutParams rlReturn = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
    	rlReturn.addRule(RelativeLayout.LEFT_OF, parent.getId());
    	if(spacedTop){
    		rlReturn.addRule(RelativeLayout.ALIGN_TOP, parent.getId());
    	} else {
    		rlReturn.addRule(RelativeLayout.ALIGN_BOTTOM, parent.getId());
    	}
    	
    	
    	return rlReturn;
    }
    /**
     * 
     * @param parent the view to align with
     * @return the LayoutParams of the view
     */
    private RelativeLayout.LayoutParams getRLPRight (ImageView parent){
    	RelativeLayout.LayoutParams rlReturn = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
    	rlReturn.addRule(RelativeLayout.RIGHT_OF, parent.getId());
    	if(spacedTop){
    		rlReturn.addRule(RelativeLayout.ALIGN_TOP, parent.getId());
    	} else {
    		rlReturn.addRule(RelativeLayout.ALIGN_BOTTOM, parent.getId());
    	}
    	
    	return rlReturn;
    }
    public void placeTower(int towerId){
    	//plaats tower toch
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
