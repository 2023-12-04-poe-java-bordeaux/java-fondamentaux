import java.util.Scanner;

public class Tp3Factorielle {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.print("Nombre : ");
        var nombre = input.nextInt();

        if (nombre < 0) {
            System.out.println("La factorielle n'est pas définie pour les nombres négatifs.");
        } else {
            var factorielle = 1;
            for (var i = 1; i <= nombre; i++) {
                factorielle *= i;
            }

            System.out.println("Factorielle de " + nombre + " : " + factorielle);
        }
        input.close();
    }
}
