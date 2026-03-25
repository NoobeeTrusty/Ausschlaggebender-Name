public class Studierender {

    private String name;
    private int matrikelnummer;
    private String studiengang;

    public Studierender(String name, int matrikelnummer, String studiengang) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang; 
    }

    public String getName() {
        return name;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public void frageStellen(Dozierender dozierender, String frage) {
        System.out.println("Studierender " + name + " stellt dem Dozierenden " + dozierender.getName() + " die Frage: " + frage);
    }

    public void sprechstundenanfrage(Dozierender dozierender, String anfrage) {
        System.out.println("Studierender " + name + " sendet eine Sprechstundenanfrage an den Dozierenden " + dozierender.getName() + "  der Fakultät " + dozierender.getFakultaet() + " mit der Büronummer " + dozierender.getBueronummer() + ".");
    }

}

