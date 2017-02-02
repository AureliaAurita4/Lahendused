package oop;

import java.util.ArrayList;

/**
 * Created by svetlana on 1.02.17.
 */
public class Kassa {

    public String nimi;
    public ArrayList tooded = new ArrayList();

    //a constructor method, which is called first of all, when creating an object; the name has to be the same as the class name
    public Kassa (String kassapidaja) {

        nimi = kassapidaja;
    }

    public void lisaToode (String toode) {

        tooded.add(toode);
    }

    public void eemaldaToode (String toode) {

        tooded.remove(toode);
    }

    public void prindiOstutsekk() {

        System.out.println(tooded.toString());
    }

    public void prindiKassapidajaNimi() {
        System.out.println(nimi);
    }

}
