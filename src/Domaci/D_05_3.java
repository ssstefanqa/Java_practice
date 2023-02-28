package Domaci;

import java.util.Scanner;

public class D_05_3 {
    public static void main(String[] args) {

        //Napraviti program za korpu voca, izracunati sumu cena, ako znamo da jabuke kostaju 50 din, kruske 100 din
        //i banane 140 din, tako da se suma racuna sve dok unosimo "jabuka" "banana" ili "kruska"(u zavisnosti koji
        //string unesemo), toliko dodajemo na sumu, kada se unese ".", program izlazi iz petlje i pise ukupnu cenu navedenog voca.


        Scanner s = new Scanner(System.in);
        System.out.println("Unesite voce koje zelite da dodate u korpu");
        String unos = s.next().toLowerCase();
        int suma = 0;

        while ((!unos.equals("."))) {
            if (unos.equals("jabuka")) {
                suma = suma + 50;
                System.out.println("Izabrano voce je dodato u korpu! Dodajte jos jedno :)");
                unos = s.next().toLowerCase();
            }   else if (unos.equals("kruska")) {
                    suma = suma + 100;
                    System.out.println("Izabrano voce je dodato u korpu! Dodajte jos jedno :)");
                    unos = s.next().toLowerCase();
                    } else if (unos.equals("banana")) {
                        suma = suma + 140;
                        System.out.println("Izabrano voce je dodato u korpu! Dodajte jos jedno :)");
                        unos = s.next().toLowerCase();
            } else {
                System.out.println("Vas unos ne odgovara nijednom vocu. Pokusajte ponovo!");
                unos = s.next().toLowerCase();
            }
        }

        System.out.println("Cena vase korpe je " + suma + "din");
        System.out.println("Kraj programa!");
    }
}
