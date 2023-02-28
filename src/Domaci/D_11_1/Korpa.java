package Domaci.D_11_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Korpa {

    ArrayList<Namirnica> listaNamirnica = new ArrayList<>();

    public Korpa(ArrayList<Namirnica> listaNamirnica) {
        this.listaNamirnica = listaNamirnica;
    }

    public void dodavanjeUListu(Namirnica Namirnica) {
        this.listaNamirnica.add(Namirnica);
    }

    public void stampaj() {
        System.out.println("U Vasoj korpi se nalaze namirnice: ");
        for (int i = 0; i < listaNamirnica.size(); i++) {
            System.out.print(listaNamirnica.get(i).getNaziv());
            System.out.println(" (Cena: " + listaNamirnica.get(i).getCena() + " din)");
        }
    }

    public int cenaKorpe () {
        int suma = 0;
        for (int i = 0; i < listaNamirnica.size(); i++) {
            suma = suma + listaNamirnica.get(i).getCena();
        }
        return suma;
    }

    public void provera() {
        System.out.println("Aktivirali ste funkciju provere liste namirnica!");
        System.out.println("Unesite namirnicu koju zelite da proverite: ");
        Scanner scn = new Scanner(System.in);
        String unos = scn.next();
        boolean bool = false;
        for (int i = 0; i < listaNamirnica.size(); i++) {
            if (listaNamirnica.get(i).getNaziv().equals(unos)) {
                bool = true;
                break;
            }
        }
        if (bool) {
            System.out.println("Ta namirnica se nalazi u korpi");
        } else {
            System.out.println("Ta namirnica se ne nalazi u korpi");
        }
    }
}
