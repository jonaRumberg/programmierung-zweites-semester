package aufgabenblatt1.aufgabe3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ampel extends JFrame{
	
	JButton red, yellow, green;
	JRadioButton redb, yellowb, greenb;
	ButtonGroup trafficlight;
	
	//containers for layout
	JPanel leftp, rightp;
	
	int selected = 0;
	
	
	public Ampel () {
		
		//set up layout
		setLayout(new FlowLayout());
		leftp = new JPanel();
		leftp.setLayout(new BorderLayout());
		rightp = new JPanel();
		rightp.setLayout(new BorderLayout());
		
		
		//radio button group leftp
		trafficlight = new ButtonGroup();
		
		redb = new JRadioButton("rot");
		redb.addActionListener(new EventListener("red"));
		redb.setSelected(true);
		trafficlight.add(redb);
		leftp.add(redb, BorderLayout.NORTH);

		yellowb = new JRadioButton("gelb");
		yellowb.addActionListener(new EventListener("yellow"));
		trafficlight.add(yellowb);
		leftp.add(yellowb, BorderLayout.CENTER);

		greenb = new JRadioButton("grün");
		greenb.addActionListener(new EventListener("green"));
		trafficlight.add(greenb);
		leftp.add(greenb, BorderLayout.SOUTH);
		
		
		//label group (array) rightp
		red = new JButton();
		red.setText("       ");
		red.setOpaque(true);
		red.setBackground(Color.black);
		red.setForeground(Color.black);
		red.addActionListener(new EventListener("red"));
		rightp.add(red, BorderLayout.NORTH);
		
		yellow = new JButton();
		yellow.setText("       ");
		yellow.setOpaque(true);
		yellow.setBackground(Color.black);		
		yellow.setForeground(Color.black);
		yellow.addActionListener(new EventListener("yellow"));
		rightp.add(yellow, BorderLayout.CENTER);

		green = new JButton();
		green.setText("       ");
		green.setOpaque(true);
		green.setBackground(Color.black);
		green.setForeground(Color.black);
		green.addActionListener(new EventListener("green"));
		rightp.add(green, BorderLayout.SOUTH);
		
		//build up screen
		add(leftp);
		add(rightp);

		
		setTitle("Ampel");
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Ampel();
	}
	
	
	
	class EventListener implements ItemListener, ActionListener {

		String col;
		
		public EventListener(String col) {
			this.col = col;
		}

		
		@Override
		public void itemStateChanged(ItemEvent e) {
			validate();
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			validate();
		}
		
		public void validate() {
			switch (col) {
				case "red": {
					
					redb.setSelected(true);
					red.setBackground(Color.RED);
					red.setForeground(Color.RED);
					
					yellowb.setSelected(false);
					yellow.setBackground(Color.BLACK);
					yellow.setForeground(Color.BLACK);

					greenb.setSelected(false);
					green.setBackground(Color.BLACK);
					green.setForeground(Color.BLACK);
					
					break;
				}
				
				case "yellow": {
					redb.setSelected(false);
					red.setBackground(Color.BLACK);
					red.setForeground(Color.BLACK);
					
					greenb.setSelected(false);
					green.setBackground(Color.BLACK);
					green.setForeground(Color.BLACK);
					
					yellowb.setSelected(true);
					yellow.setBackground(Color.YELLOW);
					yellow.setForeground(Color.YELLOW);
					
					break;
				}
				
				case "green": {
					redb.setSelected(false);
					red.setBackground(Color.BLACK);
					red.setForeground(Color.BLACK);
					
					yellowb.setSelected(false);
					yellow.setBackground(Color.BLACK);
					yellow.setForeground(Color.BLACK);

					greenb.setSelected(true);
					green.setBackground(Color.GREEN);
					green.setForeground(Color.GREEN);
					
					break;
				}
				default:{
					break;
				}
			
			}
		}
	}
}
