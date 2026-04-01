public class Lehrveranstaltung {
   
    private String titel;
    private Dozierender dozierender;
    private Studierender[] studierender = new Studierender[50];
    private Vorlesungsstunde[] vorlesungsstunden = new Vorlesungsstunde[15];
    private Praktikumsstunden[] praktikumsstunden = new Praktikumsstunden[3];
    
    public Lehrveranstaltung(String titel, Dozierender dozierender, Studierender[] studierender, Vorlesungsstunde[] vorlesungsstunden, Praktikumsstunden[] praktikumsstunden) {
        this.titel = titel;
        this.dozierender = dozierender;
        this.studierender = studierender;
        this.vorlesungsstunden = vorlesungsstunden;
        this.praktikumsstunden = praktikumsstunden;
    }

    public void addStudierender(Studierender studierender) {
        for (int i = 0; i < this.studierender.length; i++) {
            if (this.studierender[i] == null) {
                this.studierender[i] = studierender;
                return;
            }
        }
    }

    public void removeStudierender(Studierender studierender) {
        for (int i = 0; i < this.studierender.length; i++) {
            if (this.studierender[i] == studierender) {
                this.studierender[i] = null;
                return;
            }
        }
    }

    public void addVorlesung(Vorlesungsstunde vorlesungsstunden) {
        for (int i = 0; i < this.vorlesungsstunden.length; i++) {
            if (this.vorlesungsstunden[i] == null) {
                this.vorlesungsstunden[i] = vorlesungsstunden;
                return;
            }
        }
    }

    public void addPraktikum(Praktikumsstunden praktikumsstunden) {
        for (int i = 0; i < this.praktikumsstunden.length; i++) {
            if (this.praktikumsstunden[i] == null) {
                this.praktikumsstunden[i] = praktikumsstunden;
                return;
            }
        }
    }

    public void presentDetails() {
        System.out.println("Die Informationen zur Veranstaltung lauten: " + titel + ", " + dozierender + ", " + studierender.length + ", "+ vorlesungsstunden.length + ", "+ praktikumsstunden.length);
        System.out.println();
        System.out.println();
    }

}
