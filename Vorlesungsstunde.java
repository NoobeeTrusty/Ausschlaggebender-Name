public class Vorlesungsstunde {
    
    private String thema;
    private int datum;
    private int uhrzeit;
    private int raum;

    public Vorlesungsstunde(String thema, int datum, int uhrzeit, int raum){
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
    }

    public void detailsVorlesung() {
        System.out.println("Details zur Vorlesung sind: " + thema + ", " + datum + ", "+ uhrzeit + ", " + raum);
    }
}
