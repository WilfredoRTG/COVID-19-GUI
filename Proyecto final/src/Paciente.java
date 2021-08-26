
public class Paciente extends Covid {
    public Paciente(String n, int e, String es) {
        nomb = n;
        eda = e;
        est = es;
    }

    public String toString() {
        return nomb + "\t" + eda + "\t" + est;
    }
}


