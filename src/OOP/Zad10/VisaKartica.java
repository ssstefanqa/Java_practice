package OOP.Zad10;

public class VisaKartica extends PlatnaKartica {

    String imeIprezime;

    public VisaKartica(int suma, String brojKartice, int mesec, int godina, String imeIprezime) {
        super(suma, brojKartice, mesec, godina);
        this.imeIprezime = imeIprezime;
    }

    public String getImeIprezime() {
        return imeIprezime;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public double izvrsiTransakciju(double x) {
        double proviz  = x/100*1.8;
        if (proviz < 4) {
            return this.suma = (suma - x) - 4;
        } else {
            return suma = (suma - x) - proviz;
        }
    }

    public void stampa() {
        System.out.print("Visa Kartica: ");
        super.stampa();

    }

}
