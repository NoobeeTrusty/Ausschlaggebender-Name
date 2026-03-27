public class Vorlesungsstunde {
    
    private String thema;
    private int datum;
    private int uhrzeit;
    private int raum;

    public void detailsVorlesung(String thema, int datum, int uhrzeit, int raum) {
        System.out.println("Details zur Vorlesung sind: " + thema + ", " + datum + ", "+ uhrzeit + ", " + raum);
    }
}
