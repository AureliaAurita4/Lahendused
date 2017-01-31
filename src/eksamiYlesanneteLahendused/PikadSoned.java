package eksamiYlesanneteLahendused;

/**
 * Created by svetlana on 31.01.17.
 */
public class PikadSoned {
    public static void main(String[] args) {

        String[] naide = {"kaalikas", "joonas", "maakera", "homeros", "mandel"}; // vastus on 3

        int summa = 0;


        for (int i = 0; i < naide.length; i++) {
            summa += naide[i].length();

        }
        int keskmine = summa/naide.length;

        //System.out.println(keskmine);

        int count = 0;

        for (int i = 0; i < naide.length; i++) {
            if (naide[i].length() > keskmine) {
                count++;
            }
        }

        System.out.println(count);
    }

}
