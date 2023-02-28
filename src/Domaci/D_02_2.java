package Domaci;

import java.util.Scanner;

public class D_02_2 {
    public static void main(String[] args) {

        //Napraviti program gde cete uneti svoju radnu poziciju, mozete uneti "fizikalac", "inzenjer" i "masinovodja"
        //i uneti svoju platu. Ispisati u konzoli poziciju koju radis i platu. Ako ste na poziciji fizikalca, povecati
        //platu za 15%. Ako ste na poziciji inzenjera, povecati platu za 20%.
        //Ako ste na poziciji masinovodje, povecati platu za 30%.
        //Ako je uneta pogresna informacija, potrebno je prijaviti to putem poruke.


        Scanner s = new Scanner(System.in);

        System.out.println("Koja je vasa radna pozicija? Fizikalac, masinovodja ili inzinjer?");
        System.out.println();
        String pozicija = s.next();

        if (!pozicija.equalsIgnoreCase("masinovodja") &&
                !pozicija.equalsIgnoreCase("fizikalac") &&
                !pozicija.equalsIgnoreCase("inzinjer")) {
            do {
                System.out.println("U nasoj kompaniji nema te pozicije. Proverite svoj unos i pokusajte ponovo.");
                pozicija = s.next();
            }
            while (!pozicija.equalsIgnoreCase("masinovodja") &&
                    !pozicija.equalsIgnoreCase("fizikalac") &&
                    !pozicija.equalsIgnoreCase("inzinjer"));
        }

        System.out.println("Unesite iznos vase plate");
        double plata = s.nextInt();

        if (plata <= 0) {
            do {
                System.out.println("Uneli ste nevalidan iznos. Proverite svoj unos i pokusajte ponovo.");
                plata = s.nextInt();
            }
            while (plata <= 0);
        }

        double fizikalac = plata + (plata/100*15);
        double inzinjer = plata + (plata/100*20);
        double masinovodja = plata + (plata/100*30);

            if (pozicija.equalsIgnoreCase("fizikalac")) {
                System.out.println("Vasa pozicija je fizikalac i iznos vase plate je " + fizikalac);
            } else if (pozicija.equalsIgnoreCase("inzinjer")) {
                System.out.println("Vasa pozicija je inzinjer i iznos vase plate je " + inzinjer);
            } else if (pozicija.equalsIgnoreCase("masinovodja")) {
                System.out.println("Vasa pozicija je masinovodja i iznos vase plate je " + masinovodja);
            }

        System.out.println("Kraj programa!");
    }
}
