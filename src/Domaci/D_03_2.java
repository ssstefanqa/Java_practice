package Domaci;

import java.util.Scanner;

public class D_03_2 {
    public static void main(String[] args) {

        //Napisati program gde unosimo zanr neke knjige (Romantika, Triler, Horor, Krimi) nakon toga, uneti neku godinu izdanja knjige,
        //ukoliko su Triler i Romantika starija od 30 godina, onda treba ispisati poruku da zanr knjige vise nije na lageru, takodje
        //ako je Horor stariji od 40 godina i ako je Krimi starije od 20 godina, ukoliko zanr nije stariji od ogranicenja,
        //ispisati poruku da je zanr knjige na lageru.


        Scanner s = new Scanner(System.in);

        System.out.println("Unesite zanr koji vas interesuje. Mozete izabrati: Romantiku, Triler, Horor, Krimi.");
        String zanr = s.next().toLowerCase();
        System.out.println("Unesite godinu izdanja knjige.");
        int starostKnjige = 2022 - s.nextInt();

        while (starostKnjige < 0 || starostKnjige > 2022) {
            System.out.println("Nevalidan unos! Probajte ponovo :)");
            starostKnjige = 2022 - s.nextInt();
        }

        switch (zanr) {

            case "romantika", "triler":
                if (starostKnjige>30) {
                    System.out.println("Zanr knjige trenutno nije na lageru");
                } else {
                    System.out.println("Zanr knjige je na lageru");
                } break;

            case "horor":
                if (starostKnjige>40) {
                    System.out.println("Zanr knjige trenutno nije na lageru");
                } else {
                    System.out.println("Zanr knjige je na lageru");
                } break;

            case "krimi":
                if (starostKnjige>20) {
                    System.out.println("Zanr knjige trenutno nije na lageru");
                } else {
                    System.out.println("Zanr knjige je na lageru");
                } break;

            default:
                System.out.println("Doslo je do greske prilikom unosa zanra.");
                break;

        }


        System.out.println("Kraj programa!");
    }
}
