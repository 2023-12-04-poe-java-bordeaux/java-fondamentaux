package journee6_18_decembre_2023.tps.Algos;

import java.util.Arrays;

public class Tp5Alternate {
    public static char[] maMethode(char[] tab) {

        for (int i = 0; i < tab.length; i++) {
            if (i % 2 == 0) {
                tab[i] = Character.toUpperCase(tab[i]);
            } else {
                tab[i] = Character.toLowerCase(tab[i]);
            }
        }

        return tab;
    }

    public static void main(String[] args) {
        char[] tab = {'a', 'b', 'c', 'd', 'e'};
        char[] resultat = maMethode(tab);

        System.out.println(Arrays.toString(resultat));
        // Affiche : ['a', 'B', 'c', 'D', 'e']
    }
}
