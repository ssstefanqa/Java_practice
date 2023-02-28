package Zadaci;

import java.util.Scanner;

public class Zadatak41 {
    public static void main(String[] args) {

        //Zadatak 41 - Preko skenera uneti koliko redova da ima ispis
        //Preko skenera uneti i sta ce da se stampa (zvezdica ili neki drugi simbol)

        Scanner scn = new Scanner(System.in);

        System.out.println("Unesite znak");
        String znak = scn.next();
        System.out.println("Unesite broj redova");
        int brojRedova = scn.nextInt();

        String noviZnak = znak;
        for (int i = 0; i < brojRedova; i++) {
            System.out.println(noviZnak);
            noviZnak = noviZnak + znak;
        }


        System.out.println("Kraj programa!");

        /*-----------------------------------------------------------------------------------------------------------

                Scanner sc = new Scanner(System.in);
        System.out.println("Koliko redova zelite?");
        int x = sc.nextInt();
        System.out.println("Sta stampamo?");
        String stampa = sc.next();
        String jedinica = stampa;
        for (int i = 1; i < x; i++) {
            System.out.println(stampa);
            stampa = stampa + jedinica;
        }*/
    }
}
