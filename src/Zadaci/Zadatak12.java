package Zadaci;

import java.util.Scanner;

public class Zadatak12 {
    public static void main(String[] args) {

        //Zadatak 12
        //Napisati program gde unosite ime grada (Beograd, Novi Sad, Nis, Zrenjanin, Subotica) i za svaki grad
        // ispisati njegov pozivni broj.
        //Takodje preko skenera upisati i broj telefona koji treba da se spoji sa pozivnim brojem
        //Primer ako korisnik unese Beograd i zatim 703703 onda treba da se ispise 011703703

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite grad");
        String grad = s.nextLine().toLowerCase();

        System.out.println("Unesite broj telefona");
        String broj = s.next();

        String beograd = "011";
        String noviSad = "021";
        String nis = "018";
        String zrenjanin = "023";
        String subotica = "024";

        switch (grad) {

            case "beograd":
                System.out.println("Pozivni broj za beograd je " + beograd + " i " + "vas broj je " + beograd + broj);
                break;

            case "novi sad":
                System.out.println("Pozivni broj za Novi Sad je " + noviSad + " i " + "vas broj je " + noviSad + broj);
                break;

            case "nis":
                System.out.println("Pozivni broj za Nis je " + nis + " i " + "vas broj je " + nis + broj);
                break;

            case "zrenjanin":
                System.out.println("Pozivni broj za Zrenjanin je " + zrenjanin + " i " + "vas broj je " + zrenjanin + broj);
                break;

            case "subotica":
                System.out.println("Pozivni broj za Suboticu je " + subotica + " i " + "vas broj je " + subotica + broj);
                break;

            default :
                System.out.println("Ne pronalazimo taj grad u nasoj bazi");
                break;
        }

        System.out.println("Kraj programa!");
    }
}
