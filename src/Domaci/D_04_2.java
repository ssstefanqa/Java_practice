package Domaci;

import java.util.Scanner;

public class D_04_2 {
    public static void main(String[] args) {

        //Napraviti program gde unosite svoju godinu rodjenja i
        // ispisati broj prestupnih godina od vaseg rodjenja do tekuce godine.


        Scanner s = new Scanner(System.in);

        System.out.println("Unesite godinu vaseg rodjenja");
        int godRodj = s.nextInt();
        int trenutnaGod = 2022;
        int brojPrestupnih = 0;

        for (int i = godRodj; i <= trenutnaGod; i++ ) {
            if (i > 0) {
                if (i%4==0) {
                    if (i%100==0) {
                        if (i%400==0) {
                            brojPrestupnih = brojPrestupnih + 1;
                        }
                    } else {
                        brojPrestupnih = brojPrestupnih + 1;
                    }
                }
            }
        }

        System.out.println("Broj prestupnih godina je " + brojPrestupnih);
        System.out.println("Kraj programa!");
    }
}
