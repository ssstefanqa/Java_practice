package Zadaci;

public class Zadatak30 {
    public static void main(String[] args) {

        //Zadatak 30
        //Kreirati niz od x clanova (birate sami koliko)
        //Dodeliti im vrednosti
        //Ispisati da li je prvi clan veci od poslednjeg clana

        int niz1[] = new int[3];

        niz1[0] = 1;
        niz1[1] = 2;
        niz1[2] = 3;

        if (niz1[0] > niz1.length - 1) {
            System.out.println("Prvi clan " + niz1[0] + " je veci od drugog clana " + niz1[2]);
        } else {
            System.out.println("Prvi clan " + niz1[0] + " nije veci od poslednjeg clana " + niz1[2]);
        }

        /*--------------------------------------------------------------------------------------------------------------

        int niz[] = new int[2];

        niz[0] = 1;
        niz[1] = 9;

        if (niz[0] > niz[niz.length-1]) {
            System.out.println("Prvi clan ima vecu vrednost");
        } else {
            System.out.println("Prvi clan ima manju ili istu vrednost");
        }*/
    }
}
