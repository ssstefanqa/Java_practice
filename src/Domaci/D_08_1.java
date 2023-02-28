package Domaci;

import java.util.Scanner;

public class D_08_1 {
    public static void main(String[] args) {

        //Napraviti proizvoljan niz imena, zatim napraviti metod koji ce kao parametre primati niz imena i String koji
        //zelimo da proverimo, ispisati poruku ukoliko se ime nalazi u nizu, obavestiti ako nije tu. (Ime za proveru vi unosite)


        Scanner scn = new Scanner(System.in);
        String[] spisak = {"andreja", "petar", "marko", "ljubica", "andreja", "olivera", "nikola"};

        System.out.println("Unesite ime koje zelite da proverite");
        String ime = scn.next().toLowerCase();

        int brojac = 0;
        for (int i = 0; i < spisak.length; i++) {
            if (provera(spisak[i], ime)) {
                brojac++;
            }
        }

        if (brojac > 0) {
            System.out.println("Ime se nalazi u nizu. Broj pojavljivanja : " + brojac);
        } else {
            System.out.println("U nizu se ne nalazi to ime.");
        }

    }
    public static boolean provera (String a, String b) {
        if (a.equals(b)) {
            return true;
        } else {
            return false;
        }
    }
}
