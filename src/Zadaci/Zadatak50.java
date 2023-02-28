package Zadaci;

import java.util.Scanner;

public class Zadatak50 {
    public static void main(String[] args) {

        //Zadatak 50 - Kreirati metodu "bazaPodataka" koja ce u sebi da sadrzi niz imena top 5 tenisera i top 5 teniserki
        //Kreirati posebnu metodu koja ce vrsiti proveru da li unos iz main metode preko skenera sadrzi tenisera/ku u svojoj bazi


        Scanner scn = new Scanner(System.in);
        System.out.println("Unesite ime koje zelite da proverite");
        String ime = scn.next();

        if (provera(ime, bazaPodataka())) {
            System.out.println("Imemo to ime");
        } else {
            System.out.println("Nemamo to ime");
        }
    }

    public static String[] bazaPodataka () {
        String[] lista = {"Marija", "Luka", "Nikola", "Aleksandra", "Filip", "Tamara", "Stefan", "Ljubica", "Radovan", "Olivera"};
        return lista;
    }

    public static boolean provera (String ime, String[] niz){
        boolean bool = false;
        for (int i = 0; i < niz.length; i++) {
            if (ime.equals(niz[i])) {
                bool = true;
            }
        }
        return bool;
    }
}

  /*-----------------------------------------------------------------------------------------------------------------

          Scanner sc = new Scanner(System.in);
          System.out.println("Unesi ime");
          String ime = sc.nextLine();

          System.out.println(provera(ime, bazaPodataka()));
          }

public static String[] bazaPodataka() {
        String niz[] = {"Novak Djokovic", "Rafael Nadal", "Carlos Alcaraz", "Casper Ruud", "Stefanos Tsitsipas",
        "Iga Swiatek", "Ons Jabeur", "Jessica Pegula", "Caroline Garcia", "Aryna Sabalenka"};
        return niz;
        }

public static boolean provera(String naziv, String[] niz) {
        boolean exist = false;
        for (int i = 0; i < niz.length; i++) {
        if (niz[i].equals(naziv)) {
        exist = true;
        break;
        }
        }
        return exist;
        }
        }*/