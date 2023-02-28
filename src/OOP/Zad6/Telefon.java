package OOP.Zad6;

public class Telefon extends Proizvod {

    String marka;
    String model;
    int cena;

    public Telefon(String nazivKategorije, int idKategorije, String marka, String model, int cena) {
        super(nazivKategorije, idKategorije);
        this.marka = marka;
        this.model = model;
        this.cena = cena;
    }

    public void stampa() {
        System.out.println("Vrsta je " + this.nazivKategorije + " a, ID je " + this.idKategorije);
        System.out.println(this.nazivKategorije + " telefon " + "Marke " + this.marka + this.model + " kosta " + this.cena + "e.");
    }
}
