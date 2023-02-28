package Domaci.D_10_1;

public class Main {
    public static void main(String[] args) {

        //Napraviti klasu Radnik koja ima atribute id, naziv radnika, godine iskustva i plata. Klase Fizikalac,
        //SefSmene i Investitor nasledjuju klasu Radnik. Investitor ce imati dodatno polje za broj zgrada koje je do
        //sada digao. Istampati njihove podatke sa tim da racunamo 20% vecu platu sefu smene i fizikalcu ako imaju vise
        //od 5 godina iskustva i 30% vecu platu investitoru ako je digao bar 5 zgrada.


        Fizikalac fizikalac1 = new Fizikalac(12345, "Petar Petrovic", 3, 100000);
        Fizikalac fizikalac2 = new Fizikalac(54321,"Rajko Rajkovic",7, 100000);
        SefSmene sefSmene1 = new SefSmene(678910,"Ostoja Ostojic",4,100000);
        SefSmene sefSmene2 = new SefSmene(109876, "Ilija Ilijic", 10, 100000);
        Investitor investitor1 = new Investitor(5410938, "Milos Milosevic",5,100000,1);
        Investitor investitor2 = new Investitor(1267389, "Radisa Radisevic", 10, 100000, 10);

        fizikalac1.stampaRadnik();
        fizikalac2.stampaRadnik();
        sefSmene1.stampaRadnik();
        sefSmene2.stampaRadnik();
        investitor1.stampaInvest();
        investitor2.stampaInvest();

    }
}
