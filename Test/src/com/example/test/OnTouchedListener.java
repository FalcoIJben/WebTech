package com.example.test;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class OnTouchedListener implements View.OnTouchListener {

	int GridSize = 144;
	int OptionSize = 96;
	private boolean spacedTop;
	private boolean spacedLeft;

	public OnTouchedListener(boolean spacedTop, boolean spacedLeft) {
		this.spacedTop = spacedTop;
		this.spacedLeft = spacedLeft;

		// hier moet ook de grootte van de plaatjes (dus ook die van de hitbox)
		// worden bepaal
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		if (event.getActionMasked() == MotionEvent.ACTION_UP) {

			float X = event.getX();
			float Y = event.getY();

			if (Y < OptionSize && Y > 0) {

				if (spacedLeft) {

					if (X < 0 && X > (0 - (1 * OptionSize))) {
						
						// FireTower

					} else if (X < (0 - (1 * OptionSize))
							&& X > (0 - (2 * OptionSize))) {
						// FrostTower

					} else if (X < (0 - (2 * OptionSize))
							&& X > (0 - (3 * OptionSize))) {
						// NatureTower

					}

				} else {

					if (X > GridSize + (0 * OptionSize)
							&& X < (GridSize + (1 * OptionSize))) {
						// FireTower

					} else if (X > GridSize + (1 * OptionSize)
							&& X < (GridSize + (2 * OptionSize))) {
						// FrostTower

					} else if (X > GridSize + (2 * OptionSize)
							&& X < (GridSize + (3 * OptionSize))) {
						// NatureTower

					}

				}

			}

			if (X < OptionSize && X > 0) {

				if (spacedTop) {
					if (Y < 0 && Y > (0 - (1 * OptionSize))) {
						// AirTower

					} else if (Y < (0 - (1 * OptionSize))
							&& Y > (0 - (2 * OptionSize))) {
						// EarthTower

					} else if (Y < (0 - (2 * OptionSize))
							&& Y > (0 - (3 * OptionSize))) {
						// ElecTower

					}
				} else {

					if (Y > GridSize + (0 * OptionSize)
							&& Y < (GridSize + (1 * OptionSize))) {
						// AirTower

					} else if (Y > GridSize + (1 * OptionSize)
							&& Y < (GridSize + (2 * OptionSize))) {
						// EarthTower

					} else if (Y > GridSize + (2 * OptionSize)
							&& Y < (GridSize + (3 * OptionSize))) {
						// ElecTower

					}

				}

			}

		}

		return true;
	}
	public void setSpaced(boolean spacedTop, boolean spacedLeft){
		this.spacedTop = spacedTop;
		this.spacedLeft = spacedLeft;
	}

}