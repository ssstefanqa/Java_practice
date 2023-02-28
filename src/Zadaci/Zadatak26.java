package Zadaci;

import java.util.Scanner;

public class Zadatak26 {
    public static void main(String[] args) {

        //Zadatak 26
        // Unositi brojeve sve dok se ne unesu dva ista broja za redom

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite neki broj");
        int nekiBroj = s.nextInt();
        System.out.println("Unesite jos neki broj");
        int stariBroj = s.nextInt();

        while (nekiBroj != stariBroj) {
            System.out.println("Unesite jos neki broj");
            stariBroj = nekiBroj;
            nekiBroj = s.nextInt();
        }

        System.out.println("Uneli ste dva ista broja zaredom");

        System.out.println("Kraj programa!");

        /*-------------------------------------------------------------------------------------------------------------

                Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj");
        int x = sc.nextInt();
        int y;
        do {
            y = x;
            x = sc.nextInt();
        } while (x!=y);*/
    }
}
