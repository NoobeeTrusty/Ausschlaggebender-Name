public class Vorlesungsstunde {
    
    private String thema;
    private String datum;
    private String uhrzeit;
    private int raum;

    public Vorlesungsstunde(String thema, String datum, String uhrzeit, int raum){
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
    }

    public void detailsVorlesung() {
        System.out.println("Details zur Vorlesung sind: " + thema + ", " + datum + ", "+ uhrzeit + ", " + raum);
    }
}
