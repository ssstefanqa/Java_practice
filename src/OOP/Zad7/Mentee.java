package OOP.Zad7;

public class Mentee extends QA {

    String imeMentora;

    public Mentee(String nazivPozicije, int pocetnaPlata, boolean autoTest, int godineIskustva, String imeMentora) {
        super(nazivPozicije, pocetnaPlata, autoTest, godineIskustva);
        this.imeMentora = imeMentora;
    }
}
