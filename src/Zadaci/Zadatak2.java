package Zadaci;

public class Zadatak2 {
    public static void main(String[] args) {

    //Zadatak 2
    //Napisati program koji sabere cene dva broja i doda porez 20% na njih
    //Resenje odstampati u konzoli

        double hleb = 10;
        double mleko = 20;

        double c = hleb + mleko;
        double porez = c/100*20;
        double resenje1 = c + porez;

        //double resenje2 = hleb + mleko + ((hleb+mleko)/100*20);

        System.out.println("Cena hleba i mleka sa dodatim porezom je: " + resenje1);

        System.out.println("Kraj programa!");

        /*-----------------------------------------------------------------------------------------------------------

        double x = 10;
        double y = 10;
        double z = x + y;
        double porez = z/5;
        double resenje = z + porez;
        System.out.println("Cena sa porezom je: ");
        System.out.println(resenje);*/
    }
}
