package OOP.Zad9;

public class Radnik {

    public long jmbg;
    public String imeIprezime;
    public int brojDece;
    public int strucnaSprema;
    public int radniStaz;

    public Radnik(long jmbg, String imeIprezime, int brojDece, int strucnaSprema, int radniStaz) {
        this.jmbg = jmbg;
        this.imeIprezime = imeIprezime;
        this.brojDece = brojDece;
        this.strucnaSprema = strucnaSprema;
        this.radniStaz = radniStaz;
    }

    public static double minuliRad(int radniStaz) {
        double minuliRad = 0;
        if (radniStaz > 0 && radniStaz < 10) {
         minuliRad = 0.05;
        } else if (radniStaz < 20) {
            minuliRad = 0.75;
        } else {
            minuliRad = 1.0;
        }
        return minuliRad;
    }

    public static double koeficijent (int strucnaSprema) {
        double koeficijent = 0;
        switch (strucnaSprema) {
            case 1:
                koeficijent = 1.03;
                break;
            case 2:
                koeficijent = 2.00;
                break;
            case 3:
                koeficijent = 2.88;
                break;
            case 4:
                koeficijent = 3.44;
                break;
            default:
                break;
        }
        return koeficijent;
    }

    public static double plata (double koeficijent, double minuliRad) {
        double plata = ((koeficijent+minuliRad)*10000)+2500;
        int plataint = (int)Math.round(plata);
        if (minuliRad > 0) {
            return plataint;
        } else {
            return minuliRad;
        }
    }

    public static boolean kredit (double plata) {
        boolean kreditnost = true;
        if (plata < 40000) {
         kreditnost = false;
        }
        return kreditnost;
    }

    public static int godisnjiOdmor (int brojDece) {
        int brojDana = (brojDece*2)+22;
        return brojDana;
    }

    public void stampanje() {
        if (this.radniStaz > 0) {
            System.out.println("Radnik " + this.imeIprezime + " ima " + this.strucnaSprema + ". nivo strucne spreme");
            System.out.println("JMBG: " + this.jmbg);
            System.out.println("Broj dece: " + this.brojDece);
            System.out.println("Radni staz: " + this.radniStaz);
            System.out.println("Plata: " + this.plata(this.koeficijent(this.strucnaSprema), this.minuliRad(this.radniStaz)) + " din.");
            if (this.kredit(this.plata(this.koeficijent(this.strucnaSprema), this.minuliRad(this.radniStaz)))) {
                System.out.println("Radnik je sposoban za kredit");
            } else {
                System.out.println("Radnik nije sposoban za kredit");
            }
            System.out.println("Godisnji odmor: " + this.godisnjiOdmor(this.brojDece) + " dana");
        } else {
            System.out.println(this.imeIprezime +  " nije zaposlen ovde");
        }
    }
}
