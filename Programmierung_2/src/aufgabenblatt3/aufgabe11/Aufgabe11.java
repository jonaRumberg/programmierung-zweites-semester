package aufgabenblatt3.aufgabe11;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

public class Aufgabe11 extends JFrame{

        private JLabel argumentLabel;
        private JTextField argumentTextField, resultTextField;
        private JCheckBox operationLogBox, operationSqrtBox;
        private JButton execButton;
        private ButtonGroup operationGroup;

    
        public Aufgabe11() {
            setLayout(new GridLayout(2,4));

            argumentLabel = new JLabel("Argument");
            add(argumentLabel);

            operationGroup = new ButtonGroup();

            operationLogBox = new JCheckBox("Logarithmus");
            operationLogBox.setSelected(true);
            operationGroup.add(operationLogBox);
            add(operationLogBox);
            
            execButton = new JButton("Execute");
            execButton.addActionListener(new ExecuteListener());
            add(execButton);

            argumentTextField = new JTextField();
            add(argumentTextField);

            operationSqrtBox = new JCheckBox("Wurzel");
            operationGroup.add(operationSqrtBox);
            add(operationSqrtBox);

            resultTextField = new JTextField();
            add(resultTextField);

            
            setTitle("Aufgabe 11");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(400, 300);
            setLocationRelativeTo(null);
            setVisible(true);

        }
    
        public static void main(String[] args) {
            new Aufgabe11();
        }

        class ExecuteListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                double res = argumentTextField.getText().isEmpty() ? 0 : Double.parseDouble(argumentTextField.getText());
                if(operationLogBox.isSelected()) {
                    res = Math.log(res);
                } else if(operationSqrtBox.isSelected()) {
                    res = Math.sqrt(res);
                } else {
                    res = 0;
                }
                resultTextField.setText(""+res);
            }
        }
}
