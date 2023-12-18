package journee6_18_decembre_2023.tps.Algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tp6ArrayChunk {
    public static void main(String[] args) {
        printArray(maMethode(new int[]{1, 2, 3, 4}, 2));
        printArray(maMethode(new int[]{1, 2, 3, 4, 5}, 2));
        printArray(maMethode(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 3));
        printArray(maMethode(new int[]{1, 2, 3, 4, 5}, 4));
        printArray(maMethode(new int[]{1, 2, 3, 4, 5}, 10));
    }

    public static int[][] maMethode(int[] array, int taille) {
        List<int[]> result = new ArrayList<>();
        int start = 0;

        while (start < array.length) {
            int end = Math.min(array.length, start + taille);
            result.add(Arrays.copyOfRange(array, start, end));
            start += taille;
        }

        return result.toArray(new int[0][]);
    }

    public static void printArray(int[][] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(Arrays.toString(array[i]));
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
