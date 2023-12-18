package journee3_13_decembre_2023.tps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Tp4SupprimerLangages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> languages = new ArrayList<>();

        // Saisie des langages de programmation
        System.out.println("Entrez les langages de programmation (séparés par des espaces) : ");
        String[] inputLanguages = scanner.nextLine().split("\\s+");
        languages.addAll(Arrays.asList(inputLanguages));

        // Affichage de la liste initiale
        System.out.println("Liste initiale des langages : " + languages);

        // Demande des langages à retirer
        System.out.println("Entrez les langages à retirer (séparés par des espaces) : ");
        String[] languagesToRemove = scanner.nextLine().split("\\s+");

        // Retrait des langages spécifiés
        for (String lang : languagesToRemove) {
            languages.remove(lang);
        }

        // Affichage de la liste après suppression
        System.out.println("Liste des langages après suppression : " + languages);
    }
}
