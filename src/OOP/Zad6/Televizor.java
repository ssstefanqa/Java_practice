package OOP.Zad6;

public class Televizor extends Proizvod {

    int dijagonala;
    String rezolucija;

    public Televizor(String nazivKategorije, int idKategorije, int dijagonala, String rezolucija) {
        super(nazivKategorije, idKategorije);
        this.dijagonala = dijagonala;
        this.rezolucija = rezolucija;
    }

    public void stampa() {
        System.out.println("Vrsta je " + this.nazivKategorije + " a, ID je " + this.idKategorije);
        System.out.println("Televizor ima dijagonalu " + this.dijagonala + " i rezoluciju " + this.rezolucija);
    }
}
