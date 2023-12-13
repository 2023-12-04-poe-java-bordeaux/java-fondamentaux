package journee2_12_decembre_2023.tps;

import java.util.Scanner;

public class Tp5NotesPhysiqueV1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nombreNotes;
        while (true) {
            System.out.print("Combien de notes souhaitez-vous entrer? ");
            if (input.hasNextInt()) {
                nombreNotes = input.nextInt();
                if (nombreNotes > 0) {
                    break;
                } else {
                    System.out.println("Vous devez saisir une valeur positive.");
                }
            } else {
                System.out.println("Entrée invalide. Veuillez saisir un nombre entier.");
                input.next(); // Ignorer l'entrée non valide
            }
        }

        double[] notesPhysique = new double[nombreNotes];
        double somme = 0;

        for (int i = 0; i < notesPhysique.length; i++) {
            while (true) {
                System.out.printf("Note[%d] : ", i);
                if (input.hasNextDouble()) {
                    double note = input.nextDouble();
                    if (note >= 0 && note <= 20) {
                        notesPhysique[i] = note;
                        somme += note;
                        break;
                    } else {
                        System.out.println("La valeur doit être >= 0 et <= 20.");
                    }
                } else {
                    System.out.println("Entrée invalide. Veuillez saisir un nombre.");
                    input.next(); // Ignorer l'entrée non valide
                }
            }
        }

        for (int i = 0; i < notesPhysique.length; i++) {
            System.out.printf("Note[%d] : %.2f\n", i, notesPhysique[i]);
        }

        double moyenne = somme / notesPhysique.length;
        System.out.printf("Somme : %.2f\n", somme);
        System.out.printf("Moyenne : %.2f\n", moyenne);

        input.close();
    }
}
