package Domaci;

public class D_06_2 {
    public static void main(String[] args) {

        //Napraviti niz brojeva, gde cete svaki neparan broj povecati za 2.

        int niz1[] = {1,2,3,4,5,6,7,8,9,10,11};

        for (int i = 0; i < niz1.length; i++) {
            if (niz1[i]%2!=0) {
                niz1[i] = niz1[i] + 2;
            }
        }

        for (int i = 0; i < niz1.length; i++) {
            System.out.println(niz1[i]);
        }

        System.out.println("Kraj programa!");
    }
}
