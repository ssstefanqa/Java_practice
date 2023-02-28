package Zadaci;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        //Zadatak 5
        //Korisnik unosi broj godina i stanje na racunu
        //Ako korisnik ima izmedju 20 i 30 godina treba mu dodati jos 5000 na racun

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj godina");
        int god = s.nextInt();
        System.out.println("Unesite stanje na Vasem racunu");
        int stanje = s.nextInt();
        int doplata = 5000;

        if (god>=20 && god<30){
            System.out.println("Stanje na Vasem racunu je " + (stanje + doplata));
            stanje = stanje + doplata;
            } else {
                System.out.println("Nemate osnova za doplatu sredstava");
            }

        System.out.println("Kraj programa");



    }
}
