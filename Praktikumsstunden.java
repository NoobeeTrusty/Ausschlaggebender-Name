public class Praktikumsstunden {
     
    private String thema;
    private int datum;
    private int uhrzeit;
    private int raum;
    private String aufgaben;

    public void detailsVorlesung(String thema, int datum, int uhrzeit, int raum, String aufgaben) {
        System.out.println("Details zur Vorlesung sind: " + thema + ", " + datum + ", "+ uhrzeit + ", " + raum + ", " + aufgaben);
    }
}
