package eksamiYlesanneteLahendused;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by svetlana on 4.03.17.
 */
public class Arvutused {

    public Arvutused (){

    }

    public double paljuAlles(double summa2, double summa) {

        double alles = summa2 - summa;

        return alles;
    }

    public String suurimSumma(HashMap<String, Double> koikSumma){

        Double[] k6ikSumma = koikSumma.values().toArray(new Double[koikSumma.size()]);
        Arrays.sort(k6ikSumma);
        System.out.println(Arrays.toString(k6ikSumma));

        double count;
        double count2 = 0;
        double greatestValue = 0;

        for (int i = 0; i < k6ikSumma.length; i++) {
            count = 0;

            for (int j = 0; j < k6ikSumma.length; j++) {
                if (k6ikSumma[i] > k6ikSumma[j]) {
                    count++;
                }
            }

            if (count > count2) {
                count2 = count;
                greatestValue = k6ikSumma[i];
            }
        }

        System.out.println(greatestValue);

        System.out.println(koikSumma.keySet());

        for (String key : koikSumma.keySet()) {
            if (greatestValue == koikSumma.get(key)) {
                System.out.println(key);
            }
        }

        return null;
    }
}
