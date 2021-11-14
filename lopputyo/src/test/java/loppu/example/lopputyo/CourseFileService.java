package loppu.example.lopputyo;

import java.io.File;
import java.io.FileWriter;

public class CourseFileService {
    public static void main(String[] args) throws Exception {

        final String PATH = "C:/Käyttäjät/joelh/OneDrive/Tiedostot/kouluhommat";
        File f = new File(PATH);
        f.mkdir();
        File doc = new File(PATH+"/courses.txt");
        doc.createNewFile();
        FileWriter fw = new FileWriter(doc, true);

        fw.write("HTML/CSS" + "Lasse Ope" + "oamk.fi" + System.lineSeparator());
        fw.write("Oikeinkirjoituksen perusteet" + "Tuula Ope" + "wsoy.fi" + System.lineSeparator());
        fw.write("Keittokurssi" + "Hans Välimäki" + "example.fi" + System.lineSeparator());

        fw.close();
    }
}