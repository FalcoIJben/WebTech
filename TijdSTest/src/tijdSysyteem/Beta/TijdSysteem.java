package tijdSysyteem.Beta;

import java.util.Timer;

public class TijdSysteem {
	static Timer tickTimer = new Timer();
	static TickTask task = new TickTask();
	final static private int TICKS_PER_SEC = 60;
	static boolean pause;
		
		
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//while (!pause){
			
			tickTimer.schedule(task, 0, (1000/TICKS_PER_SEC));
			
		//}

	}

}
