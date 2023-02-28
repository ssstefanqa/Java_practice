package Zadaci;

import java.util.Scanner;

public class Zadatak24 {
    public static void main(String[] args) {

        //Zadatak 24
        //Koristeci DO WHILE petlju napisati program gde korisnik unosi svoj PIN
        //Korisnik moze neogranicno puta da unosi PIN


        Scanner s = new Scanner(System.in);

        System.out.println("Unesite pin");
        String pin = s.next();
        String tacanPin = "1234asdf";

        if ((!pin.equals(tacanPin))) {
            do {
                System.out.println("Uneli ste pogresan pin, unesite opet :)");
                pin = s.next();
            }
            while ((!pin.equals(tacanPin)));
        }

        System.out.println("Tacan pin!");

        /*--------------------------------------------------------------------------------------------------------------

                Scanner sc = new Scanner(System.in);
        int pin;
        do {
            System.out.println("Unesite PIN");
            pin = sc.nextInt();
        } while (pin!=1234);

        System.out.println("Kraj programa");*/
    }
}
