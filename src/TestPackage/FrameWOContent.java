package TestPackage;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Point;
import java.awt.event.*;

public class FrameWOContent extends JFrame {

	Container c;
	
	MyMouseListener mL;

	public FrameWOContent() {
		add(new JLabel("TEST"));

		c = getContentPane();

		JButton btn = new JButton("Test");
		ActionListenerButton bL = new ActionListenerButton();
		
		mL = new MyMouseListener();
				

		btn.addActionListener(bL);

		c.add(btn, BorderLayout.NORTH);
		c.addMouseListener(mL);
	}
	
	class MyMouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			e.getSource();
			Point eLoc = e.getLocationOnScreen();
			System.out.println(eLoc.getX());
		}

		@Override
		public void mousePressed(MouseEvent e) {
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			
		}
		
	}

	class ActionListenerButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// Hintergrundfarbe des Containers zufaellig aendern
			float zufall = (float) Math.random();
			Color grauton = new Color(zufall, zufall, zufall);
			c.setBackground(grauton); // Zugriff auf c moeglich, da
		}

	}

	public static void main(String args[]) {
		FrameWOContent myFrame = new FrameWOContent();

		myFrame.setTitle("Frame W/O Content");
		myFrame.setSize(300, 150);
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
