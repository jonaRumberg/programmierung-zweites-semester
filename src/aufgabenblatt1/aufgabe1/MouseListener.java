package aufgabenblatt1.aufgabe1;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseListener extends MouseAdapter{
	
	Component c;

	public MouseListener (Component c ) {
		this.c = c;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		c.setBackground(Color.WHITE);
	}
}
