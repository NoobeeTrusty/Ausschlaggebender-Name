public class Praktikumsstunden {
    private String thema;
    private String datum;
    private String uhrzeit;
    private int raum;
    private String[] aufgaben;

    public Praktikumsstunden(String thema, String datum, String uhrzeit, int raum, String[] aufgaben) {
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
        this.aufgaben = aufgaben;
    }

    public void zeigeDetails() {
        System.out.println("Details der Praktikumsstunde: ");
        System.out.println("Thema: " + thema);
        System.out.println("Datum: " + datum);
        System.out.println("Uhrzeit: " + uhrzeit);
        System.out.println("Raum: " + raum);
        System.out.println("Aufgaben: ");
        for(String ag : aufgaben) {
            System.out.println(ag);
        }
    }
}
