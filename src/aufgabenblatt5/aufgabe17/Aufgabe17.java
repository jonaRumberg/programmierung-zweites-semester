package aufgabenblatt5.aufgabe17;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Aufgabe17 extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//UI components
	Container gridContainer;
	
	
	ColorRunLabel col1;
	ColorRunLabel col2;
	ColorRunLabel col3;
	
	StartStopButton but1;
	StartStopButton but2;
	StartStopButton but3;
	
	
	public Aufgabe17() {
		
		//add components
		
		col1 = new ColorRunLabel(Color.red);
		col2 = new ColorRunLabel(Color.yellow);
		col3 = new ColorRunLabel(Color.green);
		
		but1 = new StartStopButton(Color.red);
		but2 = new StartStopButton(Color.yellow);
		but3 = new StartStopButton(Color.green);
		
		but1.addActionListener(new ButListener(col1, but1));
		but2.addActionListener(new ButListener(col2, but2));
		but3.addActionListener(new ButListener(col3, but3));
		
		
		gridContainer = new Container();
		gridContainer.setLayout(new GridLayout(2,3));
		
		gridContainer.add(col1);
		gridContainer.add(col2);
		gridContainer.add(col3);
		gridContainer.add(but1);
		gridContainer.add(but2);
		gridContainer.add(but3);
		
		add(gridContainer);
		
		setTitle("Aufgabe 17");
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Aufgabe17 frame = new Aufgabe17();
	}
	
	class ButListener implements ActionListener {
		
		ColorRunLabel col;
		StartStopButton but;
		
		public ButListener(ColorRunLabel _col, StartStopButton _but) {
			col = _col;
			but = _but;
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(but.isStart()) {
				col.start();
			}
			else 
			{
				col.stop();
			}
			but.switchText();
		}
		
	}
}
