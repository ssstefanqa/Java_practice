package Domaci;

import java.util.ArrayList;

public class D_07_1 {
    public static void main(String[] args) {

        //Napraviti proizvoljan niz brojeva, podeliti ih u dve liste, jedna lista ce u sebi sadrzati sve parne brojeve
        //dok ce druga lista zadrzati sve neparne brojeve.


        int niz1[] = {1,2,3,4,5,6,7,8,9,10};
        ArrayList lista1 = new ArrayList<>();
        ArrayList lista2 = new ArrayList<>();

        for (int i = 0; i < niz1.length; i++) {
            if (niz1[i]%2==0) {
                lista1.add(i);
            } else {
                lista2.add(i);
            }
        }
        System.out.println("Neparni brojevi su : " + lista1);
        System.out.println("Parni brojevi su : " + lista2);
        System.out.println("Kraj programa!");
    }
}
