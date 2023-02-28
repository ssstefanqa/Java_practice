package OOP.Zad7;

public class Main {
    public static void main(String[] args) {

        //OOP15 - Kreirati klasu Firma koja ce imati atribute naziv pozicije i pocetna plata
        //Kreirati klasu developer koja ce naslediti klasu Firma i imati atribute trenutna plata i programski jezik
        //Kreirati klasu QA koja ce naslediti klasu Firma i imati atribute boolean automatsko testiranje i godine iskustva
        //Kreirati klasu Mentee koja ce naslediti klasu QA i imati atribute boolean automatsko testiranje i godine iskustva
        ////Kreirati klasu Mentee koja ce naslediti klasu QA i imati atribute ime mentora

        Firma qa = new Firma("QA covek", 999999);
        Firma dev = new Firma("Developer", 54321);

        QA qa1 = new QA(qa.nazivPozicije, qa.pocetnaPlata, true,5);
        QA qa2 = new QA(qa.nazivPozicije, qa.pocetnaPlata, false,2);

        qa1.stampa();
        qa2.stampa();



    }
}
