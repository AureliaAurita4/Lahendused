package oop;

/**
 * Created by svetlana on 2.02.17.
 */
public class Pastakas {

    public int tint;

    public Pastakas (int tindiKogus) {

        tint = tindiKogus;
        System.out.println(tint);
    }

    public void kirjuta(String sone) {

        if (sone.length() < tint) {
            tint -= sone.length();
            System.out.println(tint);
        } else {
            System.out.println("Tindi enam pole. Mine poodi!");
        }
    }

    public void prindiPaljuTintiAlles() {

        System.out.println("Tinti on jäänud, et kirjutada " + tint + " tähemärki.");
    }
}
