package OOP.Zad12;

public class VideoPlayer {

    private int duzinaVidea;
    private int jacinaZvuka;
    private int trenutnoVremeV;
    private int kvalitetVidea;

    public VideoPlayer(int duzinaVidea, int jacinaZvuka, int trenutnoVremeV, int kvalitetVidea) {
        this.duzinaVidea = duzinaVidea;
        this.jacinaZvuka = jacinaZvuka;
        this.trenutnoVremeV = trenutnoVremeV;
        this.kvalitetVidea = kvalitetVidea;
    }

    public int getDuzinaVidea() {
        return duzinaVidea;
    }

    public void setDuzinaVidea(int duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public int getTrenutnoVremeV() {
        return trenutnoVremeV;
    }

    public void setTrenutnoVremeV(int trenutnoVremeV) {
        this.trenutnoVremeV = trenutnoVremeV;
    }

    public int getKvalitetVidea() {
        return kvalitetVidea;
    }

    public void setKvalitetVidea(int kvalitetVidea) {
        this.kvalitetVidea = kvalitetVidea;
    }
}
