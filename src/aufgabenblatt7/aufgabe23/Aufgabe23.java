package aufgabenblatt7.aufgabe23;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.io.Writer;

public class Aufgabe23 {
    public static void main(String[] args) {
        File ft = new File("token.txt");
        File fz = new File("zahl.txt");
        File fr = new File("rest.txt");

        try (Reader r = new FileReader(ft);
                Writer zahlWriter = new FileWriter(fz);
                Writer restWriter = new FileWriter(fr);) {
            StreamTokenizer st = new StreamTokenizer(r);
            st.eolIsSignificant(true);

            int c;
            String currentLineZahl = ""; //nach aufgabenstellung sollte man das streng genommen ohne buffer lösen
            String currentLineRest = "";

            while ((c = st.nextToken()) != StreamTokenizer.TT_EOF) {
                if (c == StreamTokenizer.TT_NUMBER) 
                {
                    currentLineZahl += Math.abs(st.nval) + " ";

                } else if (c == StreamTokenizer.TT_EOL) 
                {
                    System.out.println(currentLineZahl);
                    System.out.println(currentLineRest);
                    System.out.println("/");

                    zahlWriter.write(currentLineZahl + "\n");
                    restWriter.write(currentLineRest + "\n");

                    currentLineZahl = "";
                    currentLineRest = "";

                } else 
                {
                    currentLineRest += st.sval + " ";

                }
            }

            zahlWriter.close();
            restWriter.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
