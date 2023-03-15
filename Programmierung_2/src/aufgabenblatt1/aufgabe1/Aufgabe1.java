package aufgabenblatt1.aufgabe1;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Aufgabe1 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Component c;
	JButton btn;
	ButtonListener bL;
	MouseListener mL;

	public Aufgabe1 () {
		
		c = getContentPane();
		
		mL = new MouseListener(c);
		c.addMouseListener(mL);
		
		btn = new JButton("Drück Mich!");
		
		bL = new ButtonListener(c);
		btn.addActionListener(bL);
		
		add(btn, BorderLayout.NORTH);
	}
}
