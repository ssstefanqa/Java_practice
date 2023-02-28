package Domaci.D_10_1;

public class Fizikalac extends Radnik {

    public Fizikalac(int ID, String nazivRadnika, int godineIskustva, int plata) {
        super(ID, nazivRadnika, godineIskustva, plata);
    }

    public void stampaRadnik() {
        super.stampa();
        System.out.println("Izos plate: " + (plata+povisica(plata,godineIskustva)));
    }
}
