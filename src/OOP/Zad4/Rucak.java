package OOP.Zad4;

public class Rucak {

    private String nazivSastojka;
    private int cena;
    private int gramaza;


    public Rucak(String nazivSastojka, int cena, int gramaza) {
        this.nazivSastojka = nazivSastojka;
        this.cena = cena;
        this.gramaza = gramaza;
    }

    public String getNazivSastojka() {
        return nazivSastojka;
    }

    public int getCena() {
        return cena;
    }

    public int getGramaza() {
        return gramaza;
    }

    public void stampanje() {
        System.out.println("Za rucak je potrebno : " + getGramaza() + " grama " + getNazivSastojka() + " i kosta " + getCena());
    }
}
