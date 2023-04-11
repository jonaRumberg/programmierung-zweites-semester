package aufgabenblatt5.aufgabe17;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class ColorRunLabel extends JLabel implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Thread t;
	private boolean running = false;
	
	public ColorRunLabel(Color bgColor) {
		setBackground(bgColor);
		setOpaque(true);
		setFont(new Font("Arial", 1, 50));
		setText("0");

	}
	
	public void start() {
		t = new Thread(this);
		running = true;
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (running) {
			
			int randInt = (int) (Math.random() * 10);
			setText(""+randInt);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				break;
			}
		}
	}
	
	public void stop() {
		running = false;
	}
	
	
	
}
