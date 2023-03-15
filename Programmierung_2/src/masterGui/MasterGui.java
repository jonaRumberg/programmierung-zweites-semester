package masterGui;

import javax.swing.JFrame;
import aufgabenblatt1.*;
import aufgabenblatt3.*;

public class MasterGui extends JFrame{
    public MasterGui() {
        setTitle("MasterGui");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        MasterGui frame = new MasterGui();
    }
}
