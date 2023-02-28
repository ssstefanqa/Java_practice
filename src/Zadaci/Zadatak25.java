package Zadaci;

import java.util.Scanner;

public class Zadatak25 {
    public static void main(String[] args) {

        //Zadatak 25
        //Koristeci WHILE petlju napraviti program gde korisnik unosi dvocifrene brojeve
        //sve dok ne unese 'nedvocifren' broj
        //na kraju programa ispisati prvu i drugu cifru dvocifrenog broja
        //napomena: ako je dvocifren broj deljiv sa 5 onda prekinuti program


        Scanner s = new Scanner(System.in);

        System.out.println("Unesite dvocifren broj");
        int dvocifrenBroj = s.nextInt();

        if (dvocifrenBroj > 9 && dvocifrenBroj < 100) {
            while (dvocifrenBroj % 5 != 0) {
                System.out.println("Uspesno ste uneli dvocifren broj, unesite jos jedan");
                dvocifrenBroj = s.nextInt();
            }
        } else {
            System.out.println("Niste uneli dvocifren broj");
        }

        /*int value = dvocifrenBroj, digit;
        while (value != 0) {
            digit = value % 10;
            System.out.println(digit);
            value = value / 10;*/

        System.out.println("Kraj programa!");

        /*-------------------------------------------------------------------------------------------------------------

                Scanner sc = new Scanner(System.in);
        System.out.println("Unesite dvocifren broj");
        int x = sc.nextInt();
        int y = x;
        while (x>9&&x<100) {
            y = x;
            x = sc.nextInt();
            if (x%5==0) {
                y = x;
                break;
            }
        }

        System.out.println("Prva cifra je " + (y/10));
        System.out.println("Druga cifra je " + (y%10));*/

    }
}
