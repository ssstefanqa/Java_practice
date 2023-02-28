package OOP.Zad10;

public class PlatnaKartica {

    public double suma;
    public String brojKartice;
    public int mesec;
    public int godina;

    public PlatnaKartica(int suma, String brojKartice, int mesec, int godina) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.mesec = mesec;
        this.godina = godina;
    }

    public double getSuma() {
        return suma;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public int getMesec() {
        return mesec;
    }

    public int getGodina() {
        return godina;
    }

    public void dodavanjeSredstava(int x) {
        suma = suma + x;
    }

    public void stampa() {
        System.out.println(brojKartice + ", " + mesec + "/" + godina + ", $" + suma);
    }
}
