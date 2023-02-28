package Domaci;

import java.util.Scanner;

public class D_04_1 {
    public static void main(String[] args) {

        //Napraviti program gde unosite neki broj i kao rezultat vracate njegov faktorijel.


        Scanner s = new Scanner(System.in);

        System.out.println("Unesite neki broj");
        int N = s.nextInt();
        int faktorijel = 1;

        for (int i = 1; i <= N; i++) {
            faktorijel = faktorijel * i;
        }

        System.out.println("Faktorijel od " + N + " je " + faktorijel);
        System.out.println("Kraj programa!");
    }
}