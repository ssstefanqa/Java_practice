package Domaci.D_10_2;

import java.util.ArrayList;

public class Jelo {

    String naziv;
    ArrayList <String> listaSastojaka = new ArrayList<>();
    boolean laktoza;

    public Jelo(String naziv, ArrayList<String> listaSastojaka, boolean bezLaktoze) {
        this.naziv = naziv;
        this.listaSastojaka = listaSastojaka;
        this.laktoza = bezLaktoze;
    }

    public static boolean provera(ArrayList<String> a) {

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).equals("mleko")) {
                return false;
            }
        }

        return true;
    }

    public void stampa() {

        System.out.println("Jelo se zove " + naziv + " i sastoji se od " + listaSastojaka);
        if (provera(this.listaSastojaka)) {
            System.out.println("Jelo je ne sadrzi laktozu.");
        } else {
            System.out.println("Jelo sadrzi laktozu.");
        }

    }
}
    /*public static boolean laktoza(ArrayList<String> sastojci) {
        int brojac = 0;
        for (int i = 0; i < sastojci.size(); i++) {
            if(sastojci.get(i).equals("mleko")) {
                brojac++;
            }
        }
        if (brojac > 0) {
            return true;
        } else {
            return false;
        }
    }*/