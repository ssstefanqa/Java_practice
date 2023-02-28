package Domaci;

public class D_01_1 {
    public static void main(String[] args) {

        // Napraviti program gde cete uneti informacije o nekom vocu tako sto cete kreirati String za naziv
        // nekog voca i double vrednost za njegovu cenu. Uneti 4 naziva i 4 cene za odredjeno voce, i u svakom
        // redu posebno stampati naziv vocke i njenu cenu za 30% snizenu.


        String banana = "Banana";
        String jabuka = "Jabuka";
        String visnja = "Visnja";
        String jagoda = "Jagoda";

        double bananaCena = 100;
        double jabukaCena = 97.55;
        double visnjaCena = 274.99;
        double jagodaCena = 259.99;

        double bananaSnizenje = bananaCena - (bananaCena/100*30);
        double jabukaSnizenje = jabukaCena - (jabukaCena/100*30);
        double visnjaSnizenje = visnjaCena - (visnjaCena/100*30);
        double jagodaSnizenje = jagodaCena - (jagodaCena/100*30);

        double dveDecimaleBanana = Math.round(bananaSnizenje*100)/100.00;
        double dveDecimaleJabuka = Math.round(jabukaSnizenje/100)*100.00;
        double dveDecimaleVisnja = Math.round(visnjaSnizenje*100)/100.00;
        double dveDecimaleJagoda = Math.round(jagodaSnizenje*100)/100.00;

        System.out.println("Cena banana sa snizenjem je " + dveDecimaleBanana + " dinara. :)");
        System.out.println("Cena jabuka sa snizenjem je " + dveDecimaleJabuka + " dinara. :)");
        System.out.println("Cena visnji sa snizenjem je " + dveDecimaleVisnja + " dinara. :)");
        System.out.println("Cena jagoda sa snizenjem je " + dveDecimaleJagoda + " dinara. :)");

        System.out.println("Kraj programa!");
    }
}
