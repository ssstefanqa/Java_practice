package Zadaci;

public class Zadatak29 {
    public static void main(String[] args) {

        //Zadatak 29
        //Kreirati niz od 100 clanova
        //Koji ce sadrzati brojeve od 1 do 100
        //Odstampati citav niz

        int[] niz1 = new int[100];

        for (int i = 0; i < niz1.length; i++) {
            niz1[i] = i+1;
            System.out.println(niz1[i]);
        }

        System.out.println("Kraj programa!");


        /*--------------------------------------------------------------------------------------------------------------

        int niz[] = new int[100];

        for (int i = 0; i < niz.length; i++) {
            niz[i] = i+1;
            System.out.println(niz[i]);
        }*/

    }
}
