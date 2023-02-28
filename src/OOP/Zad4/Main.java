package OOP.Zad4;

public class Main {
    public static void main(String[] args) {

        //OOP11 Kreirati klasu "Rucak" koja ce imati sve private atribute. Oni su nazivSastojka, cena i gramaza.
        // U istoj klasi kreirati metodu za stampanje, a u Main klasi kreirati objekte koji su potrebni za spremanje rucka.

        Rucak musaka1 = new Rucak("Krompir", 500, 1000);
        Rucak musaka2 = new Rucak("Meso", 1200, 1500);

        musaka1.stampanje();
        musaka2.stampanje();



    }
}
