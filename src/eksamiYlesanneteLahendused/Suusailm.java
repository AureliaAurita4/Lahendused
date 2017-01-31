package eksamiYlesanneteLahendused;


/**
 * Created by svetlana on 31.01.17.
 */
public class Suusailm {

    public static void main(String[] args) {
        
        

        int[] kraadid1 = {11, 10, 5, 1, 3, -2, -6, 2, -13, -24, -9, 0};
        int[] kraadid2 = {-23, -25, -22, -18, -15, -19, -13};

        leiaSuhe(kraadid1);
        leiaSuhe(kraadid2);

    }

    private static void leiaSuhe(int[] temperatuur) {

        int posTemp = 0;
        int negTemp = 0;

        for (int i = 0; i < temperatuur.length; i++) {
            if (temperatuur[i] > 0) {
                posTemp++;
            } else {
                negTemp++;
            }
        }

        int suhe = posTemp - negTemp;

        if (suhe >= 0) {
            System.out.println(suhe);
        } else {
            System.out.println("Negatiivseid on rohkem");
        }
    }
}
