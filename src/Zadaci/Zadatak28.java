package Zadaci;

public class Zadatak28 {
    public static void main(String[] args) {

        //Zadatak 28
        //Kreirati niz od 7 clanova
        //Odstampati citav niz
        //Zatim odstampati prvi i poslednji clan


        int niz1[];
        niz1 = new int[7];

        niz1[0] = 5;
        niz1[1] = 6;
        niz1[2] = 7;
        niz1[3] = 8;
        niz1[4] = 9;
        niz1[5] = 10;
        niz1[6] = 11;

        for (int i = 0; i < niz1.length; i++) {
            System.out.println(niz1[i]);
        }

        System.out.println(niz1[0] + " " + niz1[6]);

        System.out.println("Kraj programa!");

        /*--------------------------------------------------------------------------------------------------------------
        int niz[] = new int[7];

        niz[0] = 7;
        niz[1] = 2;
        niz[2] = 5;
        niz[3] = 2;
        niz[4] = 6;
        niz[5] = 8;
        niz[6] = 9;

        for (int i = 0; i < niz.length; i++) {
            System.out.println((i+1) + ". clan niza je " + niz[i]);
        }

        System.out.println("Prvi clan je " + niz[0]);
        System.out.println("Poslednji clan je " + niz[niz.length-1]);

        //-----------------------
        // Stampanje niza unazad

        for (int i = niz.length-1; i >= 0; i--) {
            System.out.println((i+1) + ". clan niza je " + niz[i]);
        }

        //niz.length-1 je uvek poslednji clan bilo kog niza
        //niz[0] je uvek prvi clan bilo kog niza*/
    }
}
