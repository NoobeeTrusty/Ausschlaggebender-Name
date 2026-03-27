public class Dozierender {
    private String name;
    private String fakultaet;
    private int bueronummer;
    private String[] feedback = new String[20];

    public Dozierender(String name, String fakultaet, int bueronummer) {
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

    public int getBueronummer() {
        return bueronummer;
    }

    public void zeigeFeedback() {
        for (int i = 0; i < this.feedback.length; i++) {
            System.out.println("Feedback " + (i+1) + ": " + this.feedback[i]);
        }
    }

    public void frageBeantworten(Studierender student, String antwort) {
        System.out.println("Dozierender " + name + " beantwortet die Frage von " + student.getName() + ": " + antwort);
    }

    public void feedbackErhalten(Studierender student, String feedback) {
        if (this.feedback.length < 20) {
            for(int i = 0; i < this.feedback.length; i++) {
                if (this.feedback[i] == null) {
                    this.feedback[i] = feedback;
                    System.out.println("Dozierender " + name + " erhält Feedback von " + student.getName() + ": " + feedback);
                    return;
                }
            }
        } else {
            System.out.println("Feedback-Speicher ist voll. Kein weiteres Feedback möglich.");
        }
    }

}
