package Zadaci;

import java.util.Scanner;

public class Zadatak39 {
    public static void main(String[] args) {
        //Ne radi u potpunosti tacno!

        //Zadatak 39 - Napisati niz koji ce se sabirati clanove do 100 (suma), kada predje 100 treba ispisati za koliko je presao
        //Na primer ako imamo niz 80, 10, 9, 3, 5, 7, 22, 90, 8
        //Treba da nam ispise 80, 10, 9, 3 i onda poruka "Presli ste granicu za 2"

        Scanner scn = new Scanner(System.in);

        System.out.println("Unesite velicinu niza A");
        int nizA[] = new int[scn.nextInt()];

        System.out.println("Unesite clanove niza A");
        for (int i = 0; i < nizA.length; i++) {
            System.out.println("Unesite " + (i + 1) + ". clan");
            nizA[i] = scn.nextInt();
        }

        int nizB[] = new int[nizA.length];

        int suma = 0;
        int brojac = 0;

        do {
            suma = suma + nizA[brojac];
            //System.out.println(brojac);
            nizB[brojac] = nizA[brojac];
            brojac++;
        }
        while (suma < 101);

        for (int i = 0; i < nizB.length; i++) {
            System.out.println(nizB[i]);
        }

        System.out.println("Prekoracili ste granicu za " + (suma-100));
        System.out.println("Kraj Programa!");

        /*-----------------------------------------------------------------------------------------------------------

        int niz[] = {80, 10, 9, 3, 5, 7, 22, 90, 8};
        int suma = 0;

        *//*for (int i = 0; i < niz.length; i++) {
            suma = suma + niz[i];
            if (suma>100) {
                System.out.println("Presli ste za " + (suma-100));
                break;
            }
        }*//*

        int i = 0;
        while (suma<100) {
            System.out.println("Broj za dodavanje: " + niz[i]);
            suma = suma + niz[i];
            i++;
        }
        System.out.println("Presli ste za " + (suma-100));*/
    }
}
