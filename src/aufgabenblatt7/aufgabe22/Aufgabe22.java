package aufgabenblatt7.aufgabe22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;

/**
 * Aufgabe22
 */
public class Aufgabe22 {

    public static void main(String[] args) {
        
        System.out.println("Geben sie einen Dateinamen ein: ");

        try (Reader in = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(in)) {

            File f = new File(br.readLine());
            Reader r = new FileReader(f);
            BufferedReader bfr = new BufferedReader(r);
            

            File hf = new File("helpfile.txt");
            Writer hw = new FileWriter(hf);
            Reader hr = new FileReader(hf);
            BufferedReader bfh = new BufferedReader(hr);

            
            System.out.println("Geben sie eine Zahl ein: ");
            int zahl = Integer.parseInt(br.readLine());

            String c;
            int i = 1;
            while ( i < zahl && (c = bfr.readLine()) != null) {
                hw.write(c + "\n");
                i++;
            }

            System.out.println("Geben sie einen Text ein: ");
            String text = br.readLine() + "\n";
            hw.write(text);
            
            while ((c = bfr.readLine()) != null) {
                hw.write(c + "\n");
            }

            r.close();
            hw.flush();
            hw.close();

            Writer w = new FileWriter(f);
            
            while ( (c = bfh.readLine()) != null) {
                w.write(c + "\n");
            }

            hr.close();

            w.flush();
            w.close();

            

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}