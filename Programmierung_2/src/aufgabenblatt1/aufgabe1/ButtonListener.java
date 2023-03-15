package aufgabenblatt1.aufgabe1;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener{

	Component c;
	
	public ButtonListener (Component c) {
		this.c = c;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		c.setBackground(Color.BLACK);
	}

}
