package Zadaci;

public class Zadatak18 {
    public static void main(String[] args) {

        //Zadatak 18
        //Prikazati proizvod neparnih brojeva od 10 do 15 -bez broja 15
        //Prikazati sumu parnih brojeva od 1 do 10

            int proizvod = 1;

            for (int i = 10; i < 15; i++) {
                if (i%2!=0) {
                    proizvod = proizvod * i;
                    System.out.println(proizvod);
                }
            }

            int suma = 0;

            for (int b = 1; b <11; b++) {
                if (b%2==0){
                    suma = suma + b;
                    System.out.println(suma);
                }
            }

    }
}
