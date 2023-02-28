package Domaci;

import java.util.Scanner;

public class D_05_2 {
    public static void main(String[] args) {

        //Napraviti program gde cete uneti broj nekih knjiga na lageru, zatim svaki put kada unesete '.' on ce skinuti po jednu knjigu sa lagera,
        //tek nakon sto unesete neki drugi string ili ponestaje knjiga na lageru, izaci ce iz petlje i ispisati poruku, ukoliko je ponestajalo knjiga
        //ispisati poruku da nema vise knjiga na lageru, ukoliko je unet neki drugi String, onda samo ispisati stanje knjiga na lageru.


        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj knjiga na lageru");
        int brojNaLageru = s.nextInt();
        System.out.println("Broj knjiga na lageru je " + brojNaLageru);
        System.out.println("unesite '.' za smanjenje knjiga na lageru");
        String unos = s.next();

        while ((unos.equals("."))) {
            if (brojNaLageru == 0) {
                System.out.println("Nestalo je knjiga na lageru");
                break;
            } else {
                brojNaLageru = brojNaLageru - 1;
                System.out.println("Unesite novi unos");
                unos = s.next();
            }
        }

        System.out.println("Broj knjiga na lageru je " + brojNaLageru);
        System.out.println("Kraj programa!");
    }
}
