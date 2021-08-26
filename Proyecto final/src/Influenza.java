import java.awt.*;
import java.io.File;
import java.io.*;

public class Influenza extends Sintomas {
    public Influenza() throws IOException {
        File file = new File ("influ.txt");
        file.setReadOnly();
        Desktop.getDesktop().open(file);
    }
}
///Users/wilfredotg/IdeaProjects/Proyecto final


