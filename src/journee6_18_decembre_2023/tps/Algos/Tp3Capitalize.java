package journee6_18_decembre_2023.tps.Algos;

import java.util.Scanner;

public class Tp3Capitalize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saisissez une chaîne de caractères : ");
        String chaine = scanner.nextLine();

        // Convertir la chaîne en tableau de mots
        String mots[] = chaine.split(" ");

        String resultat = "";

        for(String mot : mots) {
            // Prendre le premier caractère, le mettre en maj then add string
            resultat += Character.toUpperCase(mot.charAt(0)) + mot.substring(1) + " ";
        }

        // Enlever espace à la fin
        resultat = resultat.trim();

        System.out.println(resultat);

        scanner.close();
    }
}
