package Zadaci;

import java.util.Scanner;

public class Zadatak22 {
    public static void main(String[] args) {

        //Zadatak 22
        //Koristeci WHILE petlju napraviti program koji racuna sumu unetih brojeva
        // sve dok korisnik ne unese 0

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj a");
        int a = s.nextInt();
        System.out.println("Unesite broj b");
        int b = s.nextInt();

        while (a!=0 && b!=0) {
                System.out.println("Suma unetih brojeva je " + (a+b));
                System.out.println("Unesite broj a");
                a = s.nextInt();
                System.out.println("Unesite broj b");
                b = s.nextInt();
            }

        System.out.println("Kraj programa!");






    }
}
