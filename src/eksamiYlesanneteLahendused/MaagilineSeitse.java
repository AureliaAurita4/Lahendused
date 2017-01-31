package eksamiYlesanneteLahendused;

/**
 * Created by svetlana on 28.01.17.
 */
public class MaagilineSeitse {
    public static void main(String[] args) {

        int[] naide = {7, 4, 324, 65, 4, 78, 7, 45, 4};

        for (int i = 0; i < naide.length; i++) {
            if (naide[i] == 7) {
                int vaheTulemus = naide[i] * 2;
            }
        }

        int arvudeSumma = 0;

        for (int i = 0; i < naide.length; i++) {
            arvudeSumma += naide[i];
        }

        int arvudeKesk = arvudeSumma/naide.length;

        System.out.println(arvudeKesk);

    }
}
