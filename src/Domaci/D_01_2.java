package Domaci;

import java.util.Scanner;

public class D_01_2 {
    public static void main(String[] args) {

        //Napraviti program gde cete uneti svoju godinu rodjenja,
        // trenutnu godinu i u konzoli istampati svoj broj godina.


        Scanner s = new Scanner(System.in);

        System.out.println("Unesite svoju godinu rodjenja");
        int godinaRodjenja = s.nextInt();
        System.out.println("Unesite trenutnu godinu");
        int trenutnaGodina = s.nextInt();

        int brojGodina = trenutnaGodina - godinaRodjenja;

        System.out.println("Trenutno imate " + brojGodina + " godina. :)");

        System.out.println("Kraj programa!");
    }
}
