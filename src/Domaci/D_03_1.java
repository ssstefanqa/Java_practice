package Domaci;

import java.util.Scanner;

public class D_03_1 {
    public static void main(String[] args) {

        //Napisati program gde cete uneti velicinu majice: 24( Ispise: S velicina), 30cm(Ispise: M Velicina),
        //36cm (ispise: L velicina), 42cm(ispise: XL velicina) u suprotnom izbaciti gresku o nepostojecoj velicini.


        Scanner s = new Scanner(System.in);

        System.out.println("Unesite velicinu majice");
        int velicina = s.nextInt();

        if (velicina >0) {
            switch (velicina) {

                case 24:
                    System.out.println("S velicina");
                    break;

                case 30:
                    System.out.println("M velicina");
                    break;

                case 36:
                    System.out.println("L velicina");
                    break;

                case 42:
                    System.out.println("XL velicina");
                    break;

                default:
                    System.out.println("Unos ne odgovara nijednoj velicini!");
            }
        }   else {
            System.out.println("Takve majice ne postoje :)");
            }

        System.out.println("Kraj programa!");
    }
}
