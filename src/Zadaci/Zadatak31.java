package Zadaci;

import java.util.Scanner;

public class Zadatak31 {
    public static void main(String[] args) {

        //Zadatak 31
        //Preko skenera uneti velicinu niza, zatim preko skenera uneti sve clanove
        //Odstampati samo parne brojeve u nizu

        Scanner scn = new Scanner(System.in);

        System.out.println("Unesite velicinu niza");
        int velicinaNiza = scn.nextInt();

        int niz1[] = new int[velicinaNiza];

        for(int i = 0; i < velicinaNiza; i++) {
            System.out.println("Unesite clana");
            niz1[i] = scn.nextInt();
        }

        System.out.println("Parni brojevi su: ");
        for (int i = 0; i < velicinaNiza; i++) {
            if (niz1[i]%2==0) {
                System.out.println(niz1[i]);
            }
        }

        System.out.println("Kraj programa!");

        /*--------------------------------------------------------------------------------------------------------------

                Scanner sc = new Scanner(System.in);
        System.out.println("Unesite velicinu niza");
        int x = sc.nextInt();
        int niz[] = new int[x];
        //Drugi nacin bez x
        //int niz[] = new int[sc.nextInt()];

        for (int i = 0; i < niz.length; i++) {
            System.out.println("Unesite " + (i+1) + ". clan niza");
            niz[i] = sc.nextInt();
        }

        //-------------------

        *//*for (int i = 0; i < niz.length; i++) {
            if (niz[i]%2==0) {
                System.out.println("Paran broj: ");
                System.out.println(niz[i]);
            }
        }*//*

        //------------------

        *//*int i = 0;
        while (i < niz.length) {
            if (niz[i]%2==0) {
                System.out.println("Paran broj: ");
                System.out.println(niz[i]);
            }
            i++;
        }*//*

        //-----------------

        int a = 0;
        do {
            if (niz[a]%2==0) {
                System.out.println("Paran broj: ");
                System.out.println(niz[a]);
            }
            a++;
        } while (a < niz.length);*/
    }
}
