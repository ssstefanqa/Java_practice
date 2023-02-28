package Zadaci;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

    ////Zadatak 3
    ////Preko skenera uneti dva broja i odstampati aritmeticku sredinu dva uneta broja

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite prvi broj ");
        double prvibroj = s.nextDouble();
        System.out.println("Uneli ste broj");
        System.out.println("Unesite drugi broj");
        double drugibroj = s.nextDouble();
        double zbir = prvibroj + drugibroj;
        double aritsred2 = zbir / 2;
        System.out.println("Aritmeticka sredina vasa dva broja je: " + aritsred2);

        System.out.println("Kraj programa!");

        /*-------------------------------------------------------------------------------------------------------------

                Scanner sc = new Scanner(System.in);
        int x,y;

        System.out.println("Unesite prvi broj");
        x = sc.nextInt();

        System.out.println("Unesite drugi broj");
        y = sc.nextInt();

        double z = (x+y)/2.0;

        System.out.println("Aritmeticka sredina je " + z);*/
    }
}
