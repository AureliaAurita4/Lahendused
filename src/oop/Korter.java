package oop;

import java.util.ArrayList;

/**
 * Created by svetlana on 3.02.17.
 */
public class Korter {

    int maht;
    ArrayList kulalised = new ArrayList();

    public Korter (int mahutab) {

        maht = mahutab;
    }

    public void saabus(String nimi){


        if (kulalised.size() < maht) {
            kulalised.add(nimi);
        } else {
            System.out.println("Enam kohti ei ole! Minge klubisse!");
        }

    }

    public void lahkus(String nimi) {

        kulalised.remove(nimi);
    }

    public void prindiKylalisteArv() {

        System.out.println("Hetkel on " + kulalised.size() + " külalist.");
    }

    public void prindiPaljuVeelMahub() {

        int maht2 = maht - kulalised.size();
        System.out.println("Korterisse mahub veel " + maht2 + " inimest.");
    }
}
