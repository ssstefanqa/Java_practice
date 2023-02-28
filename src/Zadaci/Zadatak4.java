package Zadaci;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        //Zadatak 4
        //Preko skenera uneti broj godina korisnika
        //Ako je korisnik punoletan ispisati "Mozete koristiti aplikaciju"

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj godina");
        int g = s.nextInt();

        if (g>=18) {
            System.out.println("Mozete koristiti aplikaciju :)");
        }

        System.out.println("Kraj programa");

    }
}
