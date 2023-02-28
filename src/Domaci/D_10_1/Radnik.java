package Domaci.D_10_1;

public class Radnik {

    public int ID;
    public String nazivRadnika;
    public int godineIskustva;
    public int plata;

    public Radnik(int ID, String nazivRadnika, int godineIskustva, int plata) {
        this.ID = ID;
        this.nazivRadnika = nazivRadnika;
        this.godineIskustva = godineIskustva;
        this.plata = plata;
    }

    public void stampa() {
        System.out.println("ID: " + ID + " | Ime: " + nazivRadnika + " | Godine iskustva: " + godineIskustva);
    }

    public static double povisica(int plata, int godineIskustva) {
        int povisica;
        if (godineIskustva > 5) {
            return povisica = plata/100*20;
        } else {
            return povisica = 0;
        }
    }
}
