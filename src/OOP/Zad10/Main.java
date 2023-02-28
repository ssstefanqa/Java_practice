package OOP.Zad10;

public class Main {
    public static void main(String[] args) {

        /* OOP19
    Napravi klasu Platna kartica koja ce imati atribute
    suma, broj kartice, mesec i godina
    Metodu dodajSredstva koja ce dodavati sredstva za unetu vrednost
    Metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna
    Metodu koja stampa podatke o kartici u formatu:
    7105-1579-5191-6184, 11/2024, $212
    Za klasu Platna kartica napraviti samo getere

    Napraviti klasu Visa kartica koja nasledjuje klasu Platna kartica
    Napraviti atribut ime i prezime za klasu
    Geter i seter za atribut
    Implementirati metodu tako da na prosledjenu transakciju dodeljuje se provizija od 1.8%
    Najmanja provizija je 4$
    Implementirati metodu koja stampa karticu u formatu:
    Visa card: 7105-1579-5191-6184, 11/2024, $212 Ime i Prezime

    Napraviti klasu Master kartica koja nasledjuje klasu Platna kartica
    Implementirati metodu tako da na prosledjenu transakciju dodeljuje se provizija od 1.5%
    Napraviti metodu odrzavanja racuna koja je 2$
    Implementirati metodu koja stampa karticu u formatu:
    Master card: 7105-1579-5191-6184, 11/2024, $212 */


        VisaKartica k1 = new VisaKartica(1000,"7105-1579-5191-6184", 3, 2026, "asdasd");

        k1.stampa();
        k1.izvrsiTransakciju(500);
        k1.stampa();

    }
}
