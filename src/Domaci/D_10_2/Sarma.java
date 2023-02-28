package Domaci.D_10_2;

import java.util.ArrayList;

public class Sarma extends Jelo {

    public Sarma(String naziv, ArrayList<String> listaSastojaka, boolean bezLaktoze) {
        super(naziv, listaSastojaka, bezLaktoze);

        listaSastojaka.add("kupus");
        listaSastojaka.add("meso");
        listaSastojaka.add("luk");
        listaSastojaka.add("pirinac");
    }
}
