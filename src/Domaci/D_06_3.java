package Domaci;

import java.util.Scanner;

public class D_06_3 {
    public static void main(String[] args) {

        //Napraviti proizvoljan niz brojeva, zatim uneti preko Scanner-a neki broj, i u novom nizu smestiti sve brojeve
        //koji su veci od tog unetog broja (Obratiti paznju da nov niz nema prazna polja tj 0).


        Scanner scn = new Scanner(System.in);

        int niz1[] = {-10,-5,0,1,2,3,4,5,6,7,8,9,10};
        int niz2[] = new int[niz1.length];

        System.out.println("Unesite neki broj");
        int nekiBroj = scn.nextInt();
        int brojac = 0;

        for (int i = 0; i < niz1.length; i++) {
            if (nekiBroj < niz1[i]) {
                niz2[brojac] = niz1[i];
                brojac++;
            }
        }

        int niz3[] = new int[brojac];
        for (int i = 0; i < niz3.length; i++) {
            if (niz2[i]!=0) {
                niz3[i] = niz2[i];
            }
        }

        for (int i = 0; i < niz3.length; i++) {
            System.out.println(niz3[i]);
        }

        System.out.println("Kraj programa!");
    }
}
