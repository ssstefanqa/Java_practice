package OOP.Zad3;

public class Serija {

    String naziv;
    int brojSezona;
    int trajanjeEpizode;

    public Serija(String naziv, int brojSezona, int trajanjeEpizode) {
        this.naziv = naziv;
        this.brojSezona = brojSezona;
        this.trajanjeEpizode = trajanjeEpizode;
    }

    public void stampanje() {
        System.out.println("Naziv serije je " + naziv + ". Ima " + brojSezona + " sezona i trajanje epizode je " + trajanjeEpizode);
    }
}
