package Zadaci;

import java.util.Scanner;

public class Zadatak11 {
    public static void main(String[] args) {

    //Napraviti program koji prilikom unosa nekog meseca(String), vraca koliko taj mesec ima dana.


        Scanner s = new Scanner(System.in);

        System.out.println("Unesite neki mesec");
        String mesec = s.next().toLowerCase();

        switch (mesec) {

            case "januar", "mart", "maj", "jul", "avgust", "oktobar", "decembar":
                System.out.println("Mesec koji ste uneli ima 31 dan");
                break;

            case "april", "jun", "septembar", "novembar":
                System.out.println("Mesec koji ste uneli ima 30 dana");
                break;

            case "februar":
                System.out.println("Mesec koji ste uneli ima 29 dana");
                break;

            default:
                System.out.println("Nazalost taj mesec ne postoji");
                break;
        }

        System.out.println("Kraj programa!");
    }
}
