package Zadaci;

public class Zadatak42 {
    public static void main(String[] args) {

        /*Zadatak 41: Napravite ovakav trougao
                *
               **
              ***
             ****
            *****
              */


        String zvezdica = "*";

        for (int i = 0; i < 5; i++) {
            for (int b = 4; b > i; b-- ) {
                System.out.print(" ");
            }
            System.out.println(zvezdica);
            zvezdica = "*" + zvezdica;
        }

        System.out.println("Kraj programa!");

        /*-----------------------------------------------------------------------------------------------------------

                String zvezdica = "*";
                String razmak = " ";

        System.out.println(razmak+razmak+razmak+razmak+zvezdica);
        System.out.println(razmak+razmak+razmak+zvezdica+zvezdica);
        System.out.println(razmak+razmak+zvezdica+zvezdica+zvezdica);
        System.out.println(razmak+zvezdica+zvezdica+zvezdica+zvezdica);
        System.out.println(zvezdica+zvezdica+zvezdica+zvezdica+zvezdica);

        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(razmak);
            }
            System.out.println(zvezdica);
            zvezdica = zvezdica + "*";
        }*/
    }
}
