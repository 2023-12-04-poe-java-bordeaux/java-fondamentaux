package journee3_13_decembre_2023.tps;

import java.util.Scanner;

public class Tp3SumArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisie des trois tableaux
        int[] t1 = readArray(scanner, "T1");
        int[] t2 = readArray(scanner, "T2");
        int[] t3 = readArray(scanner, "T3");

        // Affichage des tableaux
        System.out.println("T1 : " + arrayToString(t1));
        System.out.println("T2 : " + arrayToString(t2));
        System.out.println("T3 : " + arrayToString(t3));

        // Calcul et affichage de la somme
        int sum = sumOfMultiples(t1) + sumOfMultiples(t2) + sumOfMultiples(t3);
        System.out.println("S = " + sum);
    }

    private static int[] readArray(Scanner scanner, String arrayName) {
        System.out.print("Entrez la taille de " + arrayName + " : ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print(arrayName + "[" + i + "] : ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("[ ");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append(" ]");
        return sb.toString();
    }

    private static int sumOfMultiples(int[] array) {
        int sum = 0;
        for (int value : array) {
            if (value % 3 == 0) {
                sum += value;
            }
        }
        return sum;
    }
}
