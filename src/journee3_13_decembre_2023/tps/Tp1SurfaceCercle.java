package journee3_13_decembre_2023.tps;

import java.util.Scanner;

public class Tp1SurfaceCercle {
    public static void main(String[] args) {
        double radius = getUserInput("Entrez le rayon du cercle : ");
        if (radius < 0) {
            System.out.println("Le rayon ne peut pas être négatif.");
        } else {
            double area = calculateCircleArea(radius);
            System.out.println("L'aire du cercle est : " + area);
        }
    }

    private static double getUserInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Entrée invalide. Veuillez entrer un nombre.");
            System.out.print(prompt);
            scanner.next(); // Ignore l'entrée incorrecte
        }
        double input = scanner.nextDouble();
        scanner.close();
        return input;
    }

    private static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
