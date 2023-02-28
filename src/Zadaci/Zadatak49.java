package Zadaci;

public class Zadatak49 {
    public static void main(String[] args) {

        //Zadatak 49 - U main metodi kreirati vise nizova brojeva
        //Napraviti posebnu metodu koja ce da broji koliko niz ima parnih clanova
        //Napraviti posebnu metodu koja ce da broji koliko niz ima neparnih clanova

        int[] nizA = {1,23,45,7,12,434,2322};
        int[] nizB = {123,543,22,12,6,87,-23,14};
        int[] nizC = {12,123123,53245,574,123123,34,2};

        parniClanovi(nizA);
        neparniClanovi(nizB);

        System.out.println("Kraj programa!");
    }
    public static void parniClanovi (int niz[]) {
        int brojac = 0;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i]%2==0) {
                brojac++;
            }
        }
        System.out.println("Niz ima " + brojac + " parnih clanova");
    }

    public static void neparniClanovi (int niz[]) {
        int brojac = 0;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i]%2!=0) {
                brojac++;
            }
        }
        System.out.println("Niz ima " + brojac + " neparnih clanova");
    }
}

    /*---------------------------------------------------------------------------------------------------------------

    int[] niz1 = {2,3,55,67,32,56};
    int[] niz2 = {6,35,12,67,88,0,35,2};

        System.out.println(proveraParnih(niz1));
        System.out.println(proveraNeparnih(niz1));

        System.out.println(proveraParnih(niz2));
        System.out.println(proveraNeparnih(niz2));


}

    public static int proveraParnih(int[] niz) {
        int brojac = 0;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i]%2==0) {
                brojac++;
            }
        }
        return brojac;
    }

    public static int proveraNeparnih(int[] niz) {
        int brojac = 0;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i]%2!=0) {
                brojac++;
            }
        }
        return brojac;
    }
}*/
