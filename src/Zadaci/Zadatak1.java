package Zadaci;

public class Zadatak1 {
    public static void main(String[] args) {

        //Zadatak 1:
        //Kreirate vas profil
        //Program mora da sadrzi ime, prezime, godine i boolean vrednost da li ucite Javu
        //Promenljive odstampati u konzoli


        String ime = "Stefan";
        String prezime = "Marjanovic";
        int god = 25;
        boolean ucenje = true;
        char pol = 'M';

        if (ucenje = true) {
            System.out.println("Ja sam " + ime + " " + prezime + "("+ pol + ") " + "imam " + god + " godina" + " i ucim Javu :)");
        } else {
            System.out.println("Ja sam " + ime + " " + prezime + "("+ pol + ") " + "imam " + god + " godina" + " i ne ucim Javu :(");
        }

        System.out.println("Kraj programa!");

/*------------------------------------------------------------------------------------------------------------

                String ime;
        String prezime;
        int godine;
        boolean java;
        char pol;

        ime = "Dragoljub";
        prezime = "Boranijasevic";
        godine = 30;
        java = true;
        pol = 'm';

        System.out.println("Profil: ");
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("Godine: " + godine);
        System.out.println("Da li ucite javu? " + java);
        System.out.println("Pol: " + pol);*/

    }
}
