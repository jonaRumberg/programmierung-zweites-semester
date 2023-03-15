package aufgabenblatt1.aufgabe2;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Aufgabe2 extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel beschriftung, datumsAnzeige;
	private JComboBox<String> formatAuswahl;
	private Date datum;
	private JButton aktualisierung;
	private final SimpleDateFormat KURZ = new SimpleDateFormat("dd.MM.yyyy (HH:mm)"); // Datum mit Jahr und Uhrzeit
	private final SimpleDateFormat MITTEL = new SimpleDateFormat("dd.MMMMMMMM, HH:mm:ss"); // Datum und Uhrzeit mit Sekunden
	private final SimpleDateFormat LANG = new SimpleDateFormat("EE, dd.MMMMMMM, HH:mm"); // Tag,Datum und Uhrzeit
	
	public SimpleDateFormat gewaelt = LANG;
	
	public Aufgabe2 () {
		datum = new Date();
		
		
		formatAuswahl = new JComboBox<String>();
		formatAuswahl.addItem("Tag, Datum und Uhrzeit");
		formatAuswahl.addItem("Datum und Uhrzeit mit Sekunden");
		formatAuswahl.addItem("Datum mit Jahr und Uhrzeit");
		
		formatAuswahl.addItemListener(new AnzeigeListener());

		add(formatAuswahl, BorderLayout.NORTH);

		
		beschriftung = new JLabel("Datum und Uhrzeit");
		add(beschriftung, BorderLayout.WEST);


		datumsAnzeige = new JLabel(gewaelt.format(datum));
		add(datumsAnzeige, BorderLayout.EAST);

		
		aktualisierung = new JButton("Anzeige aktualisieren");
		aktualisierung.addActionListener(new KnopfHorcher(datumsAnzeige, this, datum));
		add(aktualisierung, BorderLayout.SOUTH);
		

	}


	public static void main(String[] args) {
		JFrame frame = new Aufgabe2();
		frame.setTitle("Zeitangabe");
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	
	class AnzeigeListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			switch ((String) e.getItem()) {
			case "Tag,Datum und Uhrzeit":
				gewaelt = LANG;
				datumsAnzeige.setText(gewaelt.format(datum));
				break;

			case "Datum und Uhrzeit mit Sekunden":
				gewaelt = MITTEL;
				datumsAnzeige.setText(gewaelt.format(datum));
				break;

			case "Datum mit Jahr und Uhrzeit":
				gewaelt = KURZ;
				datumsAnzeige.setText(gewaelt.format(datum));
				break;

			default:
				break;
			}
		}
		
	}

}
