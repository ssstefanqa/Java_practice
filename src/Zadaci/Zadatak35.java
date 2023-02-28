package Zadaci;

import java.util.ArrayList;

public class Zadatak35 {
    public static void main(String[] args) {

        //Zadatak 35
        //Kreirati string listu sa imenima ljudi koji ce vam doci na rodjendan
        //Listu odstampati celu pa zatim svaki clan pojedinacno

        ArrayList<String> listaImena = new ArrayList<>();

        listaImena.add("Branko");
        listaImena.add("Milos");
        listaImena.add("Nikola");
        listaImena.add("Tamara");
        listaImena.add("Nikoleta");
        listaImena.add("Milica");

        System.out.println(listaImena);

        for (int i = 0; i < listaImena.size(); i++) {
            System.out.println(listaImena.get(i));
        }

        System.out.println("Kraj programa!");

        /*--------------------------------------------------------------------------------------------------------------

                ArrayList<String> lista = new ArrayList<>();

        lista.add("Milan");
        lista.add("Marija");
        lista.add("Aleksa");
        lista.add("Dunja");

        System.out.println(lista);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }*/

    }
}
