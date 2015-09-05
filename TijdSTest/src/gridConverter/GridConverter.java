package gridConverter;

public class GridConverter {
	
	
	
	//blok in pixels
	private double blockWidth;
	private double blockHeight;
	
	//ofset in pixels = het aantal pixels vanaf de rand van een block naar het midden
	private double offSetHeight;
	private double offsetWidth;
	
	
	/**
	 * 
	 * @param gridHeight het aantal bocks in de hoogte
	 * @param gridWidth het aantal blocks in de breedte
	 * @param canvasHeight de breedte van het canvas in pixels
	 * @param canvasWidth de hoogte van het canvas in pixels
	 */
	public GridConverter(int gridHeight, int gridWidth, int canvasHeight, int canvasWidth){
		blockWidth = (canvasWidth/gridWidth);
		blockHeight = (canvasHeight/gridHeight);
		offsetWidth = (blockWidth/2);
		offSetHeight = (blockHeight/2);
	}
	
	/**
	 * 
	 * @param gridHeight de hoogte op het gridBoard in blocks
	 * @return de hoogte op het canvas in pixels
	 */
	public int getHeight(int gridHeight){
		return (int) (gridHeight*blockHeight);
	}
	
	/**
	 * 
	 * @param gridWidth de breedte op het gridBoard in blocks
	 * @return de breedte op het canvas in pixels
	 */
	public int getWidth(int gridWidth){
		return (int) (gridWidth*blockWidth);
	}
	
	/**
	 * 
	 * @param gridHeight de hoogte op het gridBoard in blocks
	 * @return de hoogte op het canvas in pixels, van het midden van een block
	 */
	public int getHeightMiddle (int gridHeight){
		return (int) (gridHeight*blockHeight);
	}	
	
	/**
	 * 
	 * @param gridWidth de breedte op het gridBoard in blocks
	 * @return de breedte op het canvas in pixels, van het midden van een block
	 */
	public int getWidthMiddle(int gridWidth){
		return (int) (gridWidth*blockWidth);
	}
	
	
	// het zlefde kan je doen met het punt waar een unit getekend moet worden, daarvoor moet je de straal 
	// of de diameter meegeven van een unit
	

}
