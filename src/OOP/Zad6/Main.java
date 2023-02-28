package OOP.Zad6;

public class Main {
    public static void main(String[] args) {

        //OOP14 - Kreirati klasu Proizvod koja ce imati atribute naziv kategorije i ID kategorije
        //Kreirati klasu Telefon koja ce naslediti klasu Proizvod i imati atribut marka, model i cenu
        //Kreirati klasu Televizor koja ce naslediti klasu Proizvod i imati atribut dijagonala i rezolucija


        Telefon telefon1 = new Telefon ("Mobilni", 12345, "Motorola", "X202", 650);
        telefon1.stampa();

        Televizor tv1 = new Televizor("MnogoDobarTV", 54321, 150, "4000 x 1202");
        tv1.stampa();


    }
}
