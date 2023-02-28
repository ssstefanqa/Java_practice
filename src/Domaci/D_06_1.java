package Domaci;

import java.util.Scanner;

public class D_06_1 {
    public static void main(String[] args) {

        //Unesite velicinu niza, zatim uneti brojeve koji ce se nalaziti u nizu,
        // na kraju treba ispisati najveci broj od onih koje smo uneli.

        Scanner scn = new Scanner(System.in);

        System.out.println("Unesite velicinu niza");
        int niz1[] = new int[scn.nextInt()];

        int najveciBroj = 0;
        for (int i = 0; i < niz1.length; i++) {
            System.out.println("Unesite clan niza");
            niz1[i] = scn.nextInt();

            if (niz1[i] > najveciBroj){
                najveciBroj = niz1[i];
            }
        }

        System.out.println("Najveci broj je " + najveciBroj);
        System.out.println("Kraj programa!");
    }
}
