package aufgabenblatt5.aufgabe17;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class StartStopButton extends JButton {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StartStopButton(Color bgColor) {
		
		setBackground(bgColor);
		setFont(new Font("Arial", 1, 25));
		setText("Start");
	}
	
	public boolean isStart() {
		return getText().equals("Start");
	}
	
	public void switchText() {
		setText(isStart()?"Stop":"Start");
	}
}
