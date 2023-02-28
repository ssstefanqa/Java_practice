package Domaci;

import java.util.ArrayList;
import java.util.Scanner;

public class D_08_2 {
    public static void main(String[] args) {

        //Napraviti neku listu brojeva pomocu skenera, sve dok se ne unese 0. Zatim cete uneti neki broj, pomocu metode
        //napraviti novu listu koja ce u sebi sadrzati sve brojeve vece od unetog broja. Novu listu pozvati pomocu metode
        //za stampanje elemenata liste.

        Scanner scn = new Scanner(System.in);
        ArrayList listaA = new ArrayList<Integer>();
        ArrayList listaB = new ArrayList<Integer>();

        System.out.println("Unesite clan listeA");
        int unos = scn.nextInt();

        while (unos!=0) {
            listaA.add(unos);
            System.out.println("Unesite jos neki clan");
            unos = scn.nextInt();
        }

        System.out.println("Unesite neki broj");
        int nekiBroj = scn.nextInt();

        novaLista(listaA, listaB, nekiBroj);
        System.out.println("ListaB sadrzi sledece clanove");
        stampanje(listaB);

    }

    public static void novaLista (ArrayList<Integer> lista, ArrayList<Integer> lista2, int broj) {

        for (int i = 0; i < lista.size(); i++) {
            if (broj < lista.get(i)) {
                lista2.add(lista.get(i));
            }
        }
    }

    public static void stampanje (ArrayList lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
