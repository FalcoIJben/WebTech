package tijdSysyteem.Beta;

import java.util.TimerTask;

public class TickTask extends TimerTask{
	private int tick;
	

	@Override
	public void run() {
		if(tick > 59){
			tick = 0;
		}
		checkUpdates(tick);
		tick++;
	}
	private void checkUpdates(int tick){
		//checkt welke updates moeten worden uitgevoerd
		if(tick%10==0){
			doeShit();	
		}
		if(tick%30==0){
			doeMeerShit();
		}
		//enz.
	}
	private void doeShit(){
		System.out.println("1");
	}
	private void doeMeerShit(){
		System.out.println(" ");
	}
		
}


