package aufgabenblatt1.aufgabe1;

import javax.swing.JFrame;

public class MasterAppl {
	public static void main(String[] args) {
		Aufgabe1 frame = new Aufgabe1();
		frame.setTitle("Aufgabe1");
		frame.setSize(250,150);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
