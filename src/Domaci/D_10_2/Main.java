package Domaci.D_10_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Napraviti klasu Jelo, koje ce imati atribute za naziv, listu sastojaka i boolean vrednost bezLaktoze.
        //Klase Corba, Torta i Sarma nasledjuju klasu Jelo. Ukoliko je jedan od sastojaka mleko, podesicemo boolean
        //vrednost za laktozu na false, u suprotnom na true.
        //U main klasi kreirati i istampati bar tri jela (njihov naziv, sastojke i da li lactose-free).


        Jelo corba = new Jelo("corba", new ArrayList<String>(), Jelo.provera(new ArrayList<String>()));

        Jelo sarma = new Jelo("sarma", new ArrayList<String>(), Jelo.provera(new ArrayList<String>()));

        Jelo torta = new Jelo("torta", new ArrayList<String>(), Jelo.provera(new ArrayList<String>()));

        Corba c1 = new Corba(corba.naziv, corba.listaSastojaka, corba.laktoza);
        c1.stampa();

        Sarma s1 = new Sarma(sarma.naziv, sarma.listaSastojaka, sarma.laktoza);
        s1.stampa();

        Torta t1 = new Torta(torta.naziv, torta.listaSastojaka, torta.laktoza);
        t1.stampa();
    }
}
