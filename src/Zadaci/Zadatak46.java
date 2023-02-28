package Zadaci;

import java.util.Scanner;

public class Zadatak46 {
    public static void main(String[] args) {

        //Zadatak 46 - Napraviti main metodu i dve metode tipa int.
        // U jednoj metodi staviti fiksan return 10, a u drugoj uvesti skener i uneti neki broj.
        // U main metodi treba pomnoziti ove dve metode


        int s = prva() * druga();
        System.out.println(s);
        System.out.println("Kraj programa!");
    }

    public static int prva() {

        //int x = 10;
        return 10;
    }

    public static int druga() {

        Scanner scn = new Scanner(System.in);
        System.out.println("Unesite neki broj");
        //int p = scn.nextInt();
        return scn.nextInt();
    }

    /*---------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        int mnozenje = broj1() * broj2();
        System.out.println(mnozenje);

    }

    public static int broj1() {
        return 10;
    }

    public static int broj2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite neki broj");
        int x = sc.nextInt();
        return x;
    }*/

}
