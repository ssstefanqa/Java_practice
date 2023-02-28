package Zadaci;

import java.util.Scanner;

public class Zadatak17 {
    public static void main(String[] args) {

        //Zadatak17
        //Korisnik najvise 5 puta moze da pogodi "bingo" broj
        //Ako unese 0 prikaze se poruka "Bingo!" i izlazi iz petlje


        Scanner s = new Scanner(System.in);

        System.out.println("Unesite vas broj");
        int broj = s.nextInt();

        for (int i = 0; i <= 4; i++) {
            if (broj==0) {
                System.out.println("Bingo!!!");
                break;
            } else {
                System.out.println("Niste pogodili bingo broj :( Pokusajte ponovo!");
                broj = s.nextInt();
            }
        }

        System.out.println("Kraj programa!");
    }
}
