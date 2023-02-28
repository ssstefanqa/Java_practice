package Zadaci;

public class Zadatak38 {
    public static void main(String[] args) {

        //Zadatak 38 - Napraviti jednocifreni niz (od 1 do 9), zatim potrebno je napraviti drugi niz
        //koji ce sadrzati prva tri parna broja prvog niza

        int niz1[] = {1,2,3,4,5,6,7,8,9};
        int niz2[] = new int[3];

        int brojac = 0;
        for (int i = 0; i < niz1.length; i++) {
            if (niz1[i]%2==0) {
                if (brojac < 3) {
                    niz2[brojac] = niz1[i];
                    brojac++;
                }
            }
        }

        for (int i = 0; i <niz2.length; i++) {
            System.out.println(niz2[i]);
        }

        /*-------------------------------------------------------------------------------------------------------------

        int niz[] = {1,2,2,5,6,8,9,3,1,2,5,6};
        int noviNiz[] = new int[3];

        int x = 0;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i]%2==0) {
                noviNiz[x] = niz[i];
                x++;
            }
            if (x>2) {
                break;
            }
        }

        System.out.println("Prvi niz:");
        for (int i = 0; i < niz.length; i++) {
            System.out.println(niz[i]);
        }
        System.out.println("Drugi niz:");
        for (int i = 0; i < noviNiz.length; i++) {
            System.out.println(noviNiz[i]);
        }*/
    }
}
