package aufgabenblatt1.aufgabe5;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Aufgabe5 extends JFrame{
	
	JTextField euroField, resField;
	JComboBox<String> select;
	
	Container c;
	
	public Aufgabe5() {
		c = getContentPane();
		
		euroField = new JTextField("100");
		add(euroField, BorderLayout.NORTH);
		euroField.addActionListener(new calcEvent());
		
		resField = new JTextField("100");
		add(resField, BorderLayout.SOUTH);
		resField.addActionListener(new backCalcEvent());
		
		select = new JComboBox<String>();
		add(select, BorderLayout.CENTER);
		select.addActionListener(new calcEvent());
		
		for (int i = 0; i < 11; i++) {
			select.addItem(EuroConverter.getBezeichnung(i));
		}
		
		calcAndDispl();

	}

	public static void main(String[] args) {
		Aufgabe5 frame = new Aufgabe5();
		frame.setTitle("Eurorechner");
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void calcAndDispl() {
		resField.setText(""+EuroConverter.convertFromEuro(Double.valueOf(euroField.getText()), select.getSelectedIndex()));
	}
	
	public void backCalcAndDispl() {
		euroField.setText(""+EuroConverter.convertToEuro(Double.valueOf(resField.getText()), select.getSelectedIndex()));
	}
	
	class calcEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			calcAndDispl();
		}
		
	}
	
	class backCalcEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			backCalcAndDispl();
		}
		
	}
}
