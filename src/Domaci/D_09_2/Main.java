package Domaci.D_09_2;

public class Main {
    public static void main(String[] args) {

        //Napraviti klasu Radnik koja ima ime, poziciju i platu. U glavnoj klasi napraviti dva radnika, proveriti
        //cija je plata veca, istampati informacije radnika cija je plata veca, uz 20% vecu platu.

        Radnik radnik1 = new Radnik();

        radnik1.ime = "Djordje Djordjevic";
        radnik1.pozicija = "Shift lead";
        radnik1.plata = 90000;

        Radnik radnik2 = new Radnik();

        radnik2.ime = "Nikola Nikolic";
        radnik2.pozicija = "Team lead";
        radnik2.plata = 130000;

        if (radnik1.plata > radnik2.plata) {
            System.out.println("Vecu platu ima Radnik1, uz povisicu iznosi " + radnik1.povisica(radnik1.plata));
        } else if (radnik1.plata == radnik2.plata) {
            System.out.println("Oba radnika imaju iste plate");
            System.out.println("Svi dobijaju povisice!!! " + "Radnik1 plata: " + radnik1.povisica(radnik1.plata) + " Radnik2 plata: " + radnik2.povisica(radnik2.plata));
        } else {
            System.out.println("Vecu platu ima Radnik2, uz povisicu iznosi " + radnik2.povisica(radnik2.plata));
        }
        System.out.println("Kraj programa!");
    }
}
