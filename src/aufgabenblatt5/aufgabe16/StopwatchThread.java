package aufgabenblatt5.aufgabe16;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StopwatchThread extends Thread {
	
	
	
	@Override
	public void run() {
		while(!isInterrupted()) {
			try {
				Date now = new Date();
				String dateString = new SimpleDateFormat("HH:mm:ss").format(now);
				System.out.println(dateString);
				sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
		}
	}

}
