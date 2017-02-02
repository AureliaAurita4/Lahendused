package oop;

import java.util.ArrayList;

/**
 * Created by svetlana on 2.02.17.
 */
public class Sonaraamat {

    public String keel;
    public ArrayList sonad = new ArrayList();


    public Sonaraamat (String raamatuKeel) {

        keel = raamatuKeel;
    }

    public void sisestaSona (String sona) {

        sonad.add(sona);
    }

    public void eemaldaSona (String sona) {

        sonad.remove(sona);
    }

    public String[] otsiEsimeseTaheJargi (String taht){

        char esimeneTaht = taht.charAt(0);
        ArrayList otsitavadSonad = new ArrayList();

        for (int i = 0; i < sonad.size(); i++) {

            String esimeneTahtSonas = sonad.get(i).toString();
            char esimeneSonas = esimeneTahtSonas.charAt(0);


            if (esimeneTaht == esimeneSonas) {
                String otsitav = sonad.get(i).toString();
                otsitavadSonad.add(otsitav);
            }
        }

        String[] otsitavadSonadMassiivis = new String[otsitavadSonad.size()];

        for (int i = 0; i < otsitavadSonad.size(); i++) {
            otsitavadSonadMassiivis[i] = otsitavadSonad.get(i).toString();
        }


        return otsitavadSonadMassiivis;
    }

    public void misKeelesRaamatOn() {

        System.out.println(keel);
    }

}
