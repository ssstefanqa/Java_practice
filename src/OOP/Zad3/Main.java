package OOP.Zad3;

public class Main {
    public static void main(String[] args) {

        //OOP8 - Kreirati klasu Serija koja ce imati naziv, broj sezona i trajanje svake epizode
        //U main metodi kreirati tri objekta koristeci pun konstruktor
        //U klasi Serija napraviti i metodu za stampanje


        Serija serija1 = new Serija("Srecni Ljudi", 5, 60);
        Serija serija2 = new Serija("Porodicno Blago", 4, 55);
        Serija serija3 = new Serija("Otvorena Vrata", 3, 45);

        serija1.stampanje();
        serija2.stampanje();
        serija3.stampanje();

    }
}
