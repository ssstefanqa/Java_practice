package Domaci.D_10_2;

import java.util.ArrayList;

public class Torta extends Jelo {

    public Torta(String naziv, ArrayList<String> listaSastojaka, boolean bezLaktoze) {
        super(naziv, listaSastojaka, bezLaktoze);

        listaSastojaka.add("slag");
        listaSastojaka.add("jaja");
        listaSastojaka.add("mleko");
        listaSastojaka.add("kakao");
        listaSastojaka.add("vanilin stapic");

    }
}
