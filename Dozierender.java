public class Dozierender {
    private String name;
    private String fakultaet;
    private String bueronummer;

    public Dozierender(String name, String fakultaet, String bueronummer) {
        this.name = name;
        this.fakultaet = fakultaet;
        this.bueronummer = bueronummer;
    }

    public String getName() {
        return name;
    }

    public String getFakultaet() {
        return fakultaet;
    }

    public String getBueronummer() {
        return bueronummer;
    }

    public void frageBeantworten(Studierender student, String antwort) {
        System.out.println("Dozierender " + name + " beantwortet die Frage von " + student.getName() + ": " + antwort);
    }
}
