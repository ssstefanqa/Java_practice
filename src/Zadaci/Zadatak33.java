package Zadaci;

public class Zadatak33 {
    public static void main(String[] args) {

        //Zadatak 33
        //Kreirati dva niza
        //Proveriti koji niz ima vise clanova
        //Proveriti koji niz ima vecu sumu clanova
        //Proveriti koji niz ima vise parnih clanova i koliko
        //Proveriti koji niz ima vise brojeva deljivih sa 5 i koliko


        int niz1[] = {5,10,15,3,2,12,535,66};
        int niz2[] = {5,10,3,2,7,11};

        //----------------------------------------------------------------------------------------------------------
        if (niz1.length < niz2.length) {
            System.out.println("Drugi niz ima vise clanova");
        } else {
            System.out.println("Prvi niz ima vise clanova");
        }

        //----------------------------------------------------------------------------------------------------------
        int niz1suma = 0;
        for (int i = 0; i < niz1.length; i++) {
            niz1suma = niz1suma + niz1[i];
        }
        //System.out.println("Suma prvog niza je " + niz1suma);

        int niz2suma = 0;
        for (int i = 0; i < niz2.length; i++) {
            niz2suma = niz2suma + niz2[i];
        }
        //System.out.println("Suma drugog niza je " + niz2suma);

        if (niz1suma > niz2suma) {
            System.out.println("Prvi niz ima vecu sumu od drugog");
        } else {
            System.out.println("Drugi niz ima vecu sumu od prvog");
        }

        //----------------------------------------------------------------------------------------------------------
        int niz1Parni = 0;
        for (int i = 0; i < niz1.length; i++) {
            if (niz1[i]%2==0) {
                niz1Parni = niz1Parni+1;
            }
        }

        int niz2Parni = 0;
        for (int i = 0; i < niz2.length; i++) {
            if (niz2[i]%2==0) {
                niz2Parni = niz2Parni+1;
            }
        }

        if (niz2Parni > niz1Parni) {
            System.out.println("Drugi niz ima vise parnih brojeva (" + niz2Parni + ")");
        } else {
            System.out.println("Prvi niz ima vise parnih brojeva (" + niz1Parni + ")");
        }

        //----------------------------------------------------------------------------------------------------------
        int niz1Pet = 0;
        for (int i = 0; i < niz1.length; i++) {
            if (niz1[i]%5==0) {
                niz1Pet = niz1Pet+1;
            }
        }

        int niz2Pet = 0;
        for (int i = 0; i < niz2.length; i++) {
            if (niz2[i]%5==0) {
                niz2Pet = niz2Pet+1;
            }
        }

        if (niz2Pet > niz1Pet) {
            System.out.println("Drugi niz ima vise brojeva deljivih sa 5(" + niz2Pet + ")");
        } else {
            System.out.println("Prvi niz ima vise brojeva deljivih sa 5 (" + niz1Pet + ")");
        }
        //----------------------------------------------------------------------------------------------------------

        System.out.println("Kraj programa!");

        /*------------------------------------------------------------------------------------------------------------

        int niz1[] = {1,3,2,4};
        int niz2[] = {2,11,14,5};

        //----------------------------

        if (niz1.length > niz2.length) {
            System.out.println("Prvi niz ima vise clanova");
        } else if (niz2.length > niz1.length) {
            System.out.println("Drugi niz ima vise clanova");
        } else {
            System.out.println("Oba niza imaju isti broj clanova");
        }

        //-----------------------------

        int suma1 = 0;
        int suma2 = 0;

        for (int i = 0; i < niz1.length; i++) {
            suma1 = suma1 + niz1[i];
        }

        for (int i = 0; i < niz2.length; i++) {
            suma2 = suma2 + niz2[i];
        }

        System.out.println("Suma prvog niza je " + suma1);
        System.out.println("Suma drugog niza je " + suma2);

        if (suma1 > suma2) {
            System.out.println("Prvi niz ima vecu sumu");
        } else if (suma2 > suma1) {
            System.out.println("Drugi niz ima vecu sumu");
        } else {
            System.out.println("Oba niza imaju istu sumu");
        }

        //---------------------

        int brojac1 = 0;
        int brojac2 = 0;

        for (int i = 0; i < niz1.length; i++) {
            if (niz1[i]%2==0) {
                brojac1++;
            }
        }

        for (int i = 0; i < niz2.length; i++) {
            if (niz2[i]%2==0) {
                brojac2++;
            }
        }

        System.out.println("Prvi niz ima " + brojac1 + " parnih brojeva");
        System.out.println("Drugi niz ima " + brojac2 + " parnih brojeva");

        if (brojac1 > brojac2) {
            System.out.println("Prvi niz ima vise parnih brojeva za " + (brojac1-brojac2));
        } else if (brojac2 > brojac1) {
            System.out.println("Drugi niz ima vise parnih brojeva za " + (brojac2-brojac1));
        } else {
            System.out.println("Oba niza imaju isti broj parnih brojeva");
        }

        //--------------------

        int deljivost1 = 0;
        int deljivost2 = 0;

        for (int i = 0; i < niz1.length; i++) {
            if (niz1[i]%5==0) {
                deljivost1++;
            }
        }

        for (int i = 0; i < niz2.length; i++) {
            if (niz2[i]%5==0) {
                deljivost2++;
            }
        }

        System.out.println("Prvi niz ima " + deljivost1 + " brojeva deljivih sa 5");
        System.out.println("Drugi niz ima " + deljivost2 + " brojeva deljivih sa 5");

        if (deljivost1 > deljivost2) {
            System.out.println("Prvi niz ima vise brojeva deljivih sa 5 za " + (deljivost1-deljivost2));
        } else if (deljivost2 > deljivost1) {
            System.out.println("Drugi niz ima vise brojeva deljivih sa 5 za " + (deljivost2-deljivost1));
        } else {
            System.out.println("Oba niza imaju isti broj deljivih sa 5");
        }*/
    }
}
