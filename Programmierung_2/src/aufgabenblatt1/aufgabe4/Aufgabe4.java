package aufgabenblatt1.aufgabe4;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aufgabe4 extends JFrame {

    // set up ui components for a simple calculator
    private JTextField a, b, result;
    private JLabel firstOperand, equals;
    private JButton add, sub, mul, div, del;
    private Container c;

    public Aufgabe4() {
        c = getContentPane();
        c.setLayout(new GridLayout(2, 5));

        a = new JTextField(10);
        add(a);

        firstOperand = new JLabel("+");
        add(firstOperand);

        b = new JTextField(10);
        add(b);

        equals = new JLabel("=");
        add(equals);

        result = new JTextField();
        result.setEditable(false);
        add(result);

        add = new JButton("+");
        add.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                double aInt = Double.parseDouble(a.getText());
                double bInt = Double.parseDouble(b.getText());
                double resultInt = aInt + bInt;
                result.setText(""+resultInt);
            }
        });
        add(add);

        sub = new JButton("-");
        sub.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                double aInt = Double.parseDouble(a.getText());
                double bInt = Double.parseDouble(b.getText());
                double resultInt = aInt - bInt;
                result.setText(""+resultInt);
            }
            
        });
        add(sub);

        mul = new JButton("*");
        mul.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                double aInt = Double.parseDouble(a.getText());
                double bInt = Double.parseDouble(b.getText());
                double resultInt = aInt * bInt;
                result.setText(""+resultInt);
            }
            
        });
        add(mul);

        div = new JButton("/");
        div.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                double aInt = Double.parseDouble(a.getText());
                double bInt = Double.parseDouble(b.getText());
                double resultInt = aInt / bInt;
                result.setText(""+resultInt);
            }
            
        });
        add(div);

        del = new JButton("C");
        del.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                a.setText("");
                b.setText("");
                result.setText("");
            }
            
        });
        add(del);

    }

    public static void main(String[] args) {
        Aufgabe4 frame = new Aufgabe4();

        frame.setTitle("Aufgabe 4");
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
