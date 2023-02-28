package Domaci.D_11_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Napraviti klasu Namirnica. Ona ima atribute za naziv i cenu. Dodati konstuktor i get metode za ovu klasu.
        //Zatim napraviti klasu Korpa. Unutar korpe imamo listu namirnica.
        //        Osim konstuktora definisati:
        // - metoda int suma(ArrayList<Namirnica> lista) - vraca ukupnu cenu svih namirnica iz korpe.
        //- metoda boolean nalaziSe(Namirnica n) - vraca true ukoliko se neka namirnica nalazi u korpi.
        //        - metoda stampaj() - istampace sve namirnice iz liste.
        //U glavnoj klasi napraviti listu namirnica koju cete proslediti konstruktoru klase Korpa.


        Namirnica brasno = new Namirnica("Brasno", 120);
        Namirnica mleko = new Namirnica("Mleko", 100);
        Namirnica so = new Namirnica("So", 90);
        Namirnica paradajz = new Namirnica("Paradajz", 140);
        Namirnica pivo = new Namirnica("Pivo", 200);

        Korpa korpa1 = new Korpa(new ArrayList<>());
            korpa1.dodavanjeUListu(brasno);
            korpa1.dodavanjeUListu(so);
            korpa1.dodavanjeUListu(mleko);

        korpa1.stampaj();
        System.out.println("Cena vase korpe je " + korpa1.cenaKorpe() + "din.");
        korpa1.provera();

        System.out.println("Kraj programa!");
    }
}
