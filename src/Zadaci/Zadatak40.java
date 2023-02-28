package Zadaci;

public class Zadatak40 {
    public static void main(String[] args) {

        //Zadatak 40 - Nacrtati trougao


        // 1. nacin, ali moze da se uradi bez niza
        /*String[] zvezdice = {"*", "**", "***", "****", "*****" };

        for (int i = 0; i < zvezdice.length; i++){
            System.out.println(zvezdice[i]);
        }*/


        String zvezdica = "*";

        for (int i = 0; i < 6; i++) {
            for (int b = 0; b < i; b++){
                System.out.print(zvezdica);
            }
            System.out.println();
        }

        /*------------------------------------------------------------------------------------------------------------

                String zvezdica = "*";

        *//*System.out.println(zvezdica);
        System.out.println(zvezdica+zvezdica);
        System.out.println(zvezdica+zvezdica+zvezdica);
        System.out.println(zvezdica+zvezdica+zvezdica+zvezdica);
        System.out.println(zvezdica+zvezdica+zvezdica+zvezdica+zvezdica);*//*

        for (int i = 0; i < 5; i++) {
            System.out.println(zvezdica);
            zvezdica = zvezdica + "*";
        }*/
    }
}
