package Domaci.D_10_1;

public class Investitor extends Radnik {

    public int brojZgrada;

    public Investitor(int ID, String nazivRadnika, int godineIskustva, int plata, int brojZgrada) {
        super(ID, nazivRadnika, godineIskustva, plata);
        this.brojZgrada = brojZgrada;
    }

    public static double povisicaInvest(int plata, int brojZgrada) {
        int povisica;
        if (brojZgrada > 5) {
            return povisica = plata/100*30;
        } else {
            return povisica = 0;
        }
    }

    public void stampaInvest() {
        super.stampa();
        System.out.println("Izos plate: " + (plata+povisicaInvest(plata,brojZgrada)));
    }
}
