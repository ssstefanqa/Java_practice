package OOP.Zad7;

public class QA extends Firma {

    boolean autoTest;
    int godineIskustva;

    public QA(String nazivPozicije, int pocetnaPlata, boolean autoTest, int godineIskustva) {
        super(nazivPozicije, pocetnaPlata);
        this.autoTest = autoTest;
        this.godineIskustva = godineIskustva;
    }

    public void stampa () {
        System.out.println("Pozicija je " + this.nazivPozicije + ", pocetna plata je " + this.pocetnaPlata);
        if (this.autoTest) {
            System.out.println("Radi automatsko testiranje i ima " + this.godineIskustva + " godina iskustva");
        } else {
            System.out.println("Ne radi automatsko testiranje i ima " + this.godineIskustva + " godina iskustva");
        }
    }

}
