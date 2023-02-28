package OOP.Zad7;

public class Developer extends Firma {

    int trenutnaPlata;
    String programskiJezik;

    public Developer(String nazivPozicije, int pocetnaPlata, int trenutnaPlata, String programskiJezik) {
        super(nazivPozicije, pocetnaPlata);
        this.trenutnaPlata = trenutnaPlata;
        this.programskiJezik = programskiJezik;
    }
}
