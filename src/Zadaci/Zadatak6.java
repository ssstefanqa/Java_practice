package Zadaci;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

        //Zadatak 6
        //Korisnik preko skenera unosi broj godina i pol
        //Ako je korisnik stariji od 18 i muskog pola treba da se ispise "Dobrodosli gospodine"
        //Ako je korisnik stariji od 18 i zenskog pola treba da se ispise "Dobrodosli gospodjo"
        //Na kraju programa ispisati "Kraj programa"

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj godina");
        int god = s.nextInt();
        System.out.println("Unesite vas pol- 'M' ili 'F'");
        String pol = s.next();

        do {
            if (pol.equals("M") || pol.equals("F")) {
                if (god >= 18 && pol.equals("F")) {
                    System.out.println("Dobrodosli gospodjo");
                    break;
                } else if (god >= 18 && pol.equals("M")) {
                    System.out.println("Dobrodosli gospodine");
                    break;
                } else if (god<18){
                    break;
                    }
            } else {
                System.out.println("Vas unos se ne poklapa sa ponudjenim, molim vas ponovite unos");
                System.out.println("Unesite Vas pol");
                pol = s.next();
            }
        } while (!pol.equals("M") || !pol.equals("F"));


        System.out.println("Kraj programa!");
    }
}
