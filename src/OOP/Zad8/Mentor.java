package OOP.Zad8;

import java.util.ArrayList;

public class Mentor extends QA {

    int kolikoMentoruje;

    public Mentor(int pocetnaPlata, int godineUFirmi, ArrayList progJezik, int kolikoMentoruje) {
        super(pocetnaPlata, godineUFirmi, progJezik);
        this.kolikoMentoruje = kolikoMentoruje;
    }
}
