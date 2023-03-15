package masterGui;

import javax.swing.JButton;
import javax.swing.JFrame;

import aufgabenblatt1.aufgabe1.Aufgabe1;
import aufgabenblatt1.aufgabe2.Aufgabe2;
import aufgabenblatt1.aufgabe3.Ampel;
import aufgabenblatt1.aufgabe4.Aufgabe4;
import aufgabenblatt1.aufgabe5.Aufgabe5;
import aufgabenblatt3.aufgabe11.Aufgabe11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.FlowLayout;

public class MasterGui extends JFrame{

    JButton aufgabe1, aufgabe2, aufgabe3, aufgabe4, aufgabe5, aufgabe11;

    public MasterGui() {

        setLayout(new FlowLayout());

        aufgabe1 = new JButton("Aufgabe 1");
        aufgabe1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                JFrame f = new Aufgabe1();
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }});

        aufgabe2 = new JButton("Aufgabe 2");
        aufgabe2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                JFrame f = new Aufgabe2();
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }});

        aufgabe3 = new JButton("Aufgabe 3");
        aufgabe3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame f = new Ampel();
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });

        aufgabe4 = new JButton("Aufgabe 4");
        aufgabe4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame f = new Aufgabe4();
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });

        aufgabe5 = new JButton("Aufgabe 5");
        aufgabe5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame f = new Aufgabe5();
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });

        aufgabe11 = new JButton("Aufgabe 11");
        aufgabe11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame f = new Aufgabe11();
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });


        add(aufgabe1);
        add(aufgabe2);
        add(aufgabe3);
        add(aufgabe4);
        add(aufgabe5);
        add(aufgabe11);

        setTitle("MasterGui");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);


    }

    public static void main(String[] args) {
        new MasterGui();
    }
}
