package Zadaci;

public class Zadatak47 {
    public static void main(String[] args) {

        //Zadatak 47 - U main metodi pozvati metodu gde prosledjujete ime i godiste, a druga metoda stampa
        //ime korisnika i koliko ima godina

        prosledjivanje("Tamara", 1999);
        prosledjivanje("Pera Peric", 1957);

    }

    public static void prosledjivanje(String ime, int godiste) {
        int starost = 2023 - godiste;
        System.out.println("Korisnik se zove " + ime + " i ima " + starost + " godina.");
    }

}