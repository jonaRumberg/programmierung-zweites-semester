package aufgabenblatt7.aufgabe24;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class RabattmarkenLeser {
    public static void main(String[] args) {


        try (FileInputStream r = new FileInputStream(new File("rabattmarken.dat"))) {
            ObjectInputStream is = new ObjectInputStream(r);

            Rabattmarke c;
            while ((c = (Rabattmarke) is.readObject()) != null){
                System.out.println(c);
            }

        } catch (IOException | ClassNotFoundException e) {
            
        }
    }
}
