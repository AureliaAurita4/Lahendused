package eksamiYlesanneteLahendused;
/**
 * Loo 9*9 suurune maatriks, millele tekib loode suunaline nurkade muster, nagu näites.
 * Tundub raske? Sul tuleb lihtsalt veeru ja rea indeksi seos leida.
 *
 * Näide
 * 1 1 1 1 1 1 1 1 1
 * 1 2 2 2 2 2 2 2 2
 * 1 2 3 3 3 3 3 3 3
 * 1 2 3 4 4 4 4 4 4
 * 1 2 3 4 5 5 5 5 5
 * 1 2 3 4 5 6 6 6 6
 * 1 2 3 4 5 6 7 7 7
 * 1 2 3 4 5 6 7 8 8
 * 1 2 3 4 5 6 7 8 9
 *
 * Tundub raske? Leia seoseid rea ja veeru indeksi numbritega.
 */

public class LoodeNurk {
    public static void main(String[] args) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i <= j) {
                    System.out.print((i + 1) + " ");
                    //System.out.print("(i:" + i + " j:" + j + ") ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i > j) {
                    System.out.print((i + 1) + " ");
                    //System.out.print("(i:" + i + " j:" + j + ") ");
                }
            }
            System.out.println();
        }
    }
}
