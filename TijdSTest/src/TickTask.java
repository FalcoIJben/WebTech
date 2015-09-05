import java.util.TimerTask;


public class TickTask extends TimerTask {
	private int tick;
	private int sec;
	private boolean clock = true;

	@Override
	public void run() {
		System.out.println("tick: "+tick);
		if(tick > 9){
			tick=0;
			System.out.println("seconde: "+sec);
			if(sec > 9){
				this.cancel();
			}
			sec++;
		}
		tick++;
	}
	

	

}
