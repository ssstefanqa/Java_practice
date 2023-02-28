package Domaci.D_09_2;

public class Radnik {

    String ime;
    String pozicija;
    int plata;

    public Radnik() {

    }

    public int povisica (int plata) {
        int povisica = this.plata/100*20;
        int plataSaPovisicom = this.plata + povisica;
        return plataSaPovisicom;
    }
}
