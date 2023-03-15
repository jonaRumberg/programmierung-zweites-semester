package aufgabenblatt1.aufgabe2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JLabel;

public class KnopfHorcher implements ActionListener{

	private JLabel anzeigeLabel;
	private Date datum;
	private Aufgabe2 parent;

	public KnopfHorcher (JLabel anzeigeLabel, Aufgabe2 parent, Date datum) {
		this.anzeigeLabel = anzeigeLabel;
		this.parent = parent;
		this.datum = datum;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		datum = new Date();
		anzeigeLabel.setText(parent.gewaelt.format(datum));
	}

}
