import javax.security.auth.login.AccountNotFoundException;

public class App {
    public static void main (String[] args) {
        Dozierender Prof = new Dozierender("Nestler", "Informatik", 123);
        Studierender Lisa = new Studierender("Lisa", 1234, "UXD");
        Studierender Joshua = new Studierender("Joshua", 4321, "UXD");
        Studierender Linus = new Studierender("Linus", 2314, "UXD");
        Studierender[] Gruppe = {Lisa, Joshua, Linus};

        String[] aufgaben = {"1", "2", "3"};
        Praktikumsstunden H = new Praktikumsstunden("Objektorientierte Programmierung", "31.03.2026", "12:10 Uhr", 210, aufgaben);
        Praktikumsstunden[] Stunden = {H};

        Vorlesungsstunde Nestler = new Vorlesungsstunde("Github", "31.03.2026", "13:03 Uhr", 123);
        Vorlesungsstunde[] vorlesung = {Nestler};

        Lehrveranstaltung SWE = new Lehrveranstaltung("SWE2", Prof, Gruppe, vorlesung, Stunden);

        Lisa.frageStellen(Prof, "Wann findet die Vorlesung statt?");
        Prof.frageBeantworten(Lisa, "Einen Moment bitte.");
        Nestler.detailsVorlesung();
        System.out.println();
        
        Lisa.frageStellen(Prof, "Wann findet die Praktikumsstunde statt?");
        H.zeigeDetails();
        System.out.println();

        Lisa.sprechstundenanfrage(Prof, "Können Sie mir Feedback zu meiner Abgabe bitte geben?");
        Prof.feedbackErhalten(Lisa, "Sie haben Chatgpt verwendet!:/");
        Prof.zeigeFeedback();
        System.out.println();

        SWE.addStudierender(Joshua);
        SWE.addStudierender(Linus);
        SWE.removeStudierender(Linus);
        SWE.addVorlesung(Nestler);
        SWE.addPraktikum(H);
        System.out.println();

        Lisa.frageStellen(Prof, "Wann findet die Lehrveranstaltung statt?");
        SWE.presentDetails();
        System.out.println();
        
    }
}

