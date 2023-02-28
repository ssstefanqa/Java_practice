package Zadaci;

import java.util.Scanner;

public class Zadatak27 {
    public static void main(String[] args) {

        //Zadatak 27
        //Napraviti program gde korisnik unosi brojeve sve dok ne unese 0
        //Na kraju ispisati koji je najveci, a koji najmanji broj od prethodno unetih


        Scanner s = new Scanner(System.in);

        System.out.println("Unesite neki broj");
        int broj = s.nextInt();
        int min = 9999;
        int max = 0;

        while (broj != 0) {
            System.out.println("Unesite jos neki broj");
            broj = s.nextInt();
            if (broj < min && broj != 0) {
                min = broj;
            } else if (broj > max) {
                max = broj;
            }
        }

        System.out.println("Najmanji broj je " + min + " a najveci je " + max);

        System.out.println("Kraj programa!");

        /*-------------------------------------------------------------------------------------------------------------

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi broj");
        int x = sc.nextInt();
        int max, min;
        if (x!=0) {
            max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;
        } else {
            max = 0;
            min = 0;
        }

        while (x!=0) {
            if (x > max) {
                max = x;
            }
            if (x < min) {
                min = x;
            }
            x = sc.nextInt();
        }

        System.out.println("Najmanji broj je " + min);
        System.out.println("Najveci broj je " + max);*/
    }
}
