package aufgabenblatt5.aufgabe16;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import Prog1Tools.IOTools;

public class Aufgabe16 {
public static void main(String[] args) {
	System.out.println("Stopuhr starten mit Eingabetaste!");
	IOTools.readLine();

	Date startDate = new Date();
	System.out.println("Startzeitpunkt: " + startDate);
	StopwatchThread t = new StopwatchThread();
	t.start();
	

	IOTools.readLine();

	t.interrupt();
	Date stopDate = new Date();
	System.out.println(stopDate);
	System.out.println("Gesamtlaufzeit: " + getDateDiff(startDate, stopDate, TimeUnit.MILLISECONDS));
}

/**
 * Get a diff between two dates
 * @param date1 the oldest date
 * @param date2 the newest date
 * @param timeUnit the unit in which you want the diff
 * @return the diff value, in the provided unit
 */
public static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
    long diffInMillies = date2.getTime() - date1.getTime();
    return timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
}
}
