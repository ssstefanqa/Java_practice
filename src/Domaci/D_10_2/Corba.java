package Domaci.D_10_2;

import java.util.ArrayList;

public class Corba extends Jelo {

    public Corba(String naziv, ArrayList<String> listaSastojaka, boolean bezLaktoze) {
        super(naziv, listaSastojaka, bezLaktoze);

        listaSastojaka.add("voda");
        listaSastojaka.add("sargarepa");
        listaSastojaka.add("meso");
        listaSastojaka.add("krompir");
        listaSastojaka.add("persun");
        listaSastojaka.add("korijander");
    }



}
