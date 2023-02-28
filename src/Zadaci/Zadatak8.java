package Zadaci;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {

        //Napisati program gde unosite godinu koje ste krenuli da radite(npr 1998, 2001,..), zatim izracunavate godine radnog iskustva,
        //ako imate manje od 4 ili 4 godine radnog iskustva,onda ste Junior programer(Napraviti ispis "Ti si Junior programer"),
        //ako imate vise od 4 godine do 8 godina iskustva, onda ste senior programer("Ti si Senior programer"), ako imate vise od 8 godina
        //onda ste direktor firme("Vi ste direktor firme").

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite trenutnu godinu");
        int trenutnaGodina = s.nextInt();
        System.out.println("Unesite godinu kada ste poceli da radite");
        int pocetakRada = s.nextInt();
        int radnoIskustvo = trenutnaGodina - pocetakRada;

        if (pocetakRada>0 && trenutnaGodina>0) {
            if (radnoIskustvo <= 4) {
                System.out.println("Ti si Junior programer");
            } else if (radnoIskustvo >= 5 && radnoIskustvo <= 8) {
                System.out.println("Ti si Senior programer");
            } else if (radnoIskustvo > 8) {
                System.out.println("Vi ste direktor firme");
            }
        } else {
            System.out.println("Sigurno niste poceli tada da radite :)");
        }

        System.out.println("Kraj programa");

    }
}
