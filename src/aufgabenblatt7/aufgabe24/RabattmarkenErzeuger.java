package aufgabenblatt7.aufgabe24;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.Reader;

public class RabattmarkenErzeuger {
    public static void main(String[] args) {
        File file = new File("rabattmarken.dat");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }


        

        Reader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        int rabattMarkenNummer = 0;

        String c;

        System.out.println("Bitte geben Sie die Rabattmarken nach dem Muster 'name number discount' ein ");

        try {

            
            FileOutputStream w = new FileOutputStream(file);
            ObjectOutputStream ow = new ObjectOutputStream(w);

            while ((c = br.readLine()) != null) {
                String[] split = c.split(" ");
                Rabattmarke rabattmarke = new Rabattmarke(rabattMarkenNummer, split[0], Integer.parseInt(split[1]),
                        Integer.parseInt(split[2]));
                rabattMarkenNummer++;
                System.out.println(rabattmarke);
                ow.writeObject(rabattmarke);
            }

            ow.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
