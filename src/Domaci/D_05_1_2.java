package Domaci;

import java.util.Scanner;

public class D_05_1_2 {
    public static void main(String[] args) {

        //Napraviti program gde cete uneti neki broj i kao rezultat vratiti zbir svih njegovih prethodnih brojeva.
        // (napraviti sa for i while primere)


        Scanner s = new Scanner(System.in);
        System.out.println("Unesite neki pozitivan broj");
        int N = s.nextInt();
        int zbir = 0;
        int i = 0;

        if (N > 0) {
            while (i != N) {
                zbir = zbir + i;
                i++;
            }
        } else {
            System.out.println("Niste uneli pozitivan broj");
        }

        System.out.println("Zbir brojeva koji prethode vasem unosu je " + zbir);
        System.out.println("Kraj programa!");
    }
}
