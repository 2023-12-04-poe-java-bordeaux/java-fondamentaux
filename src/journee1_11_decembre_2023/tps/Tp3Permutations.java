package journee1_11_decembre_2023.tps;

import java.util.Scanner;

public class Tp3Permutations {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Entrez la première valeur (a) : ");
        var a = scanner.nextInt();

        System.out.print("Entrez la deuxième valeur (b) : ");
        var b = scanner.nextInt();

        System.out.print("Entrez la troisième valeur (c) : ");
        var c = scanner.nextInt();

        System.out.printf("Les valeurs entrées sont : a = %d, b = %d et c = %d\n", a, b, c);

        var temp = a;
        a = c;
        c = b;
        b = temp;

        System.out.println("Permutation: b <== a, c <== b, a <== c");
        System.out.printf("Les valeurs permutées sont : a = %d, b = %d et c = %d\n", a, b, c);
        scanner.close();
    }
}
