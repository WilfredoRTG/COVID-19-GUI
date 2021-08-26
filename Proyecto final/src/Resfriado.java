import java.awt.*;
import java.io.File;
import java.io.*;

public class Resfriado extends Sintomas {
    public Resfriado() throws IOException {
        File file = new File ("res.txt");
        file.setReadOnly();
        Desktop.getDesktop().open(file);
    }
}
