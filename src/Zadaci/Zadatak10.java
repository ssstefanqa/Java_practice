package Zadaci;

import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {

        //Zadatak 10
        //Korisnik preko skenera unosi naziv meseca
        //Zavisno koji mesec unese treba da se ispise poruka koji je to mesec po redu u godini
        //Ako ne unese naziv meseca program treba da napise poruku "Greska"


        Scanner s = new Scanner(System.in);

        System.out.println("Unesite mesec");
        String mesec = s.next().toLowerCase();

        switch (mesec) {

            case "januar":
                System.out.println("Januar je prvi mesec");
                break;

            case "februar":
                System.out.println("Februar je drugi mesec");
                break;

            case "mart":
                System.out.println("Mart je treci mesec");
                break;

            case "april":
                System.out.println("April je cetvrti mesec");
                break;

            case "maj":
                System.out.println("Maj je peti mesec");
                break;

            case "jun":
                System.out.println("Jun je sesti mesec");
                break;

            case "jul":
                System.out.println("Jul je sedmi mesec");
                break;

            case "avgust":
                System.out.println("Avgust je osmi mesec");
                break;

            case "septembar":
                System.out.println("Septembar je deveti mesec");
                break;

            case "oktobar":
                System.out.println("Oktobar je deseti mesec");
                break;

            case "novembar":
                System.out.println("Novembar je jedanaesti mesec");
                break;
            case "decembar":
                System.out.println("Decembar je dvanaesti mesec");
                break;

            default:
                System.out.println("Greska");
                break;
        }


        System.out.println("Kraj programa!");

    }
}
