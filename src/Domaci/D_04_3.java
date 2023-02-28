package Domaci;

import java.util.Scanner;

public class D_04_3 {
    public static void main(String[] args) {

        //Napraviti program gde unosite 5 brojeva i uz poruku ispisati koji je bio najveci od svih njih.


        Scanner s = new Scanner(System.in);
        System.out.println("U danasnjoj aplikaciji radimo poredjenje brojeva, ako vas zanima koji od unesenih je najveci, nastavite dalje");
        int najveciBroj = -9999;

        for (int i = 0; i < 5; i++) {
            System.out.println("Unesite neki broj");
            int noviBroj = s.nextInt();
                if (noviBroj > najveciBroj) {
                    najveciBroj = noviBroj;
                }
        }

        System.out.println("Uneli ste maksimalan broj brojeva");
        System.out.println("Najveci broj je " + najveciBroj);
        System.out.println("Kraj programa!");
    }
}
