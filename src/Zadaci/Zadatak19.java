package Zadaci;

import java.util.Scanner;

public class Zadatak19 {
    public static void main(String[] args) {

        //Zadatak 19
        //Prikazati sumu brojeva do broja N koji unosite preko skenera

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite neki broj");
        int brojN = s.nextInt();

        int suma = 0;

        for (int i = 0; i <= brojN; i++) {
            suma = suma + i;
            System.out.println(suma);
        }

        System.out.println("Kraj programa!");
    }
}
