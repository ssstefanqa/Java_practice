package Zadaci;

import java.util.ArrayList;

public class Zadatak36 {
    public static void main(String[] args) {

        //Zadatak 36
        //Kreirati opstu listu "recenica"
        //Dodati clanove po iducem redosledu: "voli", 3, "Milovana", "Ana", true
        //Modifikovati listu tako da kada se odstampa da pise "Ana voli Milovana"


        ArrayList lista = new ArrayList<>();

        lista.add("voli");
        lista.add(3);
        lista.add("Milovana");
        lista.add("Ana");
        lista.add(true);
        lista.add(null);
        //System.out.println(lista);

                lista.set(5, "voli");
                lista.set(0, "Ana");
                lista.set(3, 3);
                lista.set(1, "voli");
                lista.set(5, "Milovana");

        lista.remove(5);

        System.out.println(lista.get(0) + " " + (lista.get(1)) + " " + lista.get(2));
        System.out.println("Kraj programa!");


        /*--------------------------------------------------------------------------------------------------------------

        ArrayList recenica = new ArrayList<>();
        recenica.add("voli");
        recenica.add(3);
        recenica.add("Milovana");
        recenica.add("Ana");
        recenica.add(true);

        System.out.println(recenica);
        *//*recenica.remove(1);
        recenica.remove(recenica.size()-1);*//*

        for (int i = recenica.size()-1; i >=0 ; i--) {
            if (!(recenica.get(i).equals("Ana") || recenica.get(i).equals("voli") || recenica.get(i).equals("Milovana"))) {
                recenica.remove(i);
            }
        }

        //voli, Milovana, Ana
        //  0      1       2

        Object rezerva = recenica.get(0);
        recenica.set(0, recenica.get(2));
        recenica.set(2, recenica.get(1));
        recenica.set(1, rezerva);

        for (int i = 0; i < recenica.size(); i++) {
            System.out.print(recenica.get(i) + " ");
        }*/

    }
}
