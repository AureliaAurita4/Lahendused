package eksamiYlesanneteLahendused;

import java.util.Arrays;

/**
 * Created by svetlana on 20.01.17.
 */
public class KuulusNumber {

    public static void main(String[] args) {

        int[] naide = {1, 5, 3, 3, 6, 3, 7, 7}; // vastus on 7

        Arrays.sort(naide);

        System.out.println(Arrays.toString(naide));

        int count;
        int count2 = 0;
        int greatestValue = 0;

        for (int i = 0; i < naide.length; i++) {
            count = 0;

            for (int j = 0; j < naide.length; j++) {
                if (naide[i] == naide[j] && naide[i] != 3) {
                    count++;
                }
            }

            if (count > count2) {
                count2 = count;
                greatestValue = naide[i];
            }
        }

        System.out.println(greatestValue);
    }
}
