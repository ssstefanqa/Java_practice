package Domaci;

import java.util.ArrayList;
import java.util.Scanner;

public class D_07_2 {
    public static void main(String[] args) {

        //Napraviti proizvoljnu listu imena, zatim uneti ime koje zelite da izbacite iz liste,
        // ispisati poruku u zavisnosti od toga da li je izbaceno ili ne, i da li se uopste nalazi u listi.

        ArrayList<String> listaImena = new ArrayList<>();

        listaImena.add(0, "Aleksandra");
        listaImena.add(1, "Nikola");
        listaImena.add(2, "Ljubica");
        listaImena.add(3,"Kosta");
        listaImena.add(4, "Petko");
        listaImena.add(5, "Nikola");

        System.out.println("U listi imena se nalaze:");
        for (int i = 0; i < listaImena.size(); i++) {
            System.out.println((i+1) + ". " + listaImena.get(i));
        }

        Scanner scn = new Scanner(System.in);

        System.out.println("Unesite ime koje zelite da izbacite iz liste");
        String ime = scn.next();

        int brojac = 0;

        for (int i = 0; i < listaImena.size(); i++) {
            if (ime.equals(listaImena.get(i))) {
                listaImena.remove(i);
                brojac++;
            }
        }

        if (brojac == 0) {
            System.out.println("U listi se ne nalazi to ime. Lista je nepromenjena.");
        } else {
            System.out.println("Ime je uklonjeno");
            System.out.println("Novi izgled liste");
            for (int b = 0; b < listaImena.size(); b++) {
                System.out.println((b + 1) + ". " + listaImena.get(b));
            }
        }

        System.out.println("Kraj programa!");
    }
}
