package Zadaci;

import java.util.Scanner;

public class Zadatak13 {
    public static void main(String[] args) {

    //Zadatak 13
    //Preko skenera unosite tri broja
    //Prvi broj komanduje koja akcija ce se raditi u switchu (1 - sabiranje, 2 - oduzimanje, 3 - mnozenje)
    //Zavisno koja komanda se izabere ta akcija treba da se izvrsi nad druga dva unos
    //Napomena: Ako se radi oduzimanje treba oduzeti veci broj od manjeg


        Scanner s = new Scanner(System.in);

        System.out.println("Unesite prvi broj");
        double broj1 = Double.parseDouble(s.next());
        System.out.println("Unesite drugi broj");
        double broj2 = Double.parseDouble(s.next());
        System.out.println("Izaberite akciju: 1 - Sabiranje, 2 - Oduzimanje, 3 - Mnozenje");
        int akcija = s.nextInt();

        // Program nije zeleo da primi double u "double broj = s.nextDouble();
        // resenje je mozda
        // Scanner s = new Scanner(System.in);
        // s.useLocale(Locale.US);
        // zato sto je intelliJ bio podesen na britaniju i za double je ocekivao zarez, a ne tacku

        if (broj1>0 && broj2>0 && akcija>0) {
            switch (akcija) {

                case 1:
                    System.out.println("Izabrali ste akciju sabiranja! Zbir unetih brojeva je " + (broj1 + broj2));
                    break;

                case 2:
                    if (broj1 < broj2) {
                        System.out.println("Izabrali ste akciju oduzimanja! Rezultat je " + (broj2 - broj1));
                    } else {
                        System.out.println("Izabrali ste akciju oduzimanja! Rezultat je " + (broj1 - broj2));
                    }
                    break;
                    // u ovom case-u fali ako su uneti brojevi jednaki

                case 3:
                    System.out.println("Izabrali ste akciju mnozenja! Rezultat je " + (broj1 * broj2));
                    break;

                default:
                    break;

            }
        } else {
            System.out.println("Zao mi je! Nema nule! :)");
        }

        System.out.println("Kraj programa!");
    }
}
