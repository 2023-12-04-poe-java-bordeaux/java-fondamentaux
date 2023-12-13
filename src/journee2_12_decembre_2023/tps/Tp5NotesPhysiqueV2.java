package journee2_12_decembre_2023.tps;

import java.util.Scanner;

public class Tp5NotesPhysiqueV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entrez les notes séparées par des espaces (tapez 'stop' pour terminer) : ");
        StringBuilder notesSaisies = new StringBuilder();

        while (true) {
            String saisie = input.next();
            if ("stop".equalsIgnoreCase(saisie)) {
                break;
            }
            notesSaisies.append(saisie).append(" ");
        }

        String[] notesString = notesSaisies.toString().trim().split(" ");
        double somme = 0;
        int nombreDeNotesValides = 0;

        for (String noteString : notesString) {
            Scanner noteScanner = new Scanner(noteString);
            if (noteScanner.hasNextDouble()) {
                double note = noteScanner.nextDouble();
                if (note >= 0 && note <= 20) {
                    somme += note;
                    nombreDeNotesValides++;
                } else {
                    System.out.println("Note invalide (doit être entre 0 et 20) : " + note);
                }
            } else {
                System.out.println("Entrée non numérique détectée et ignorée : " + noteString);
            }
            noteScanner.close();
        }

        double moyenne = nombreDeNotesValides > 0 ? somme / nombreDeNotesValides : 0;
        System.out.printf("Somme : %.2f\n", somme);
        System.out.printf("Moyenne : %.2f\n", moyenne);

        input.close();
    }
}
