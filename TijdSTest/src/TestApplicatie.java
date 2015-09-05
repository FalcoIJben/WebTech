import java.util.Timer;


public class TestApplicatie {
	
	final private static int TICKS_PER_SEC = 10;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		TickTask task = new TickTask();
		Timer tick= new Timer();
		
	
		
		
		tick.schedule(task,0,(1000/TICKS_PER_SEC));
			
		
		

	}

}
