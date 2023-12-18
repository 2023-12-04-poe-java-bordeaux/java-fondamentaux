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

        for (String noteString : notesString) {//[1,2,3,4,5] => noteString=12
            Scanner noteScanner = new Scanner(noteString);
            if (noteScanner.hasNextDouble()) {//true
                double note = noteScanner.nextDouble();// 12.0
                if (note >= 0 && note <= 20) {
                    somme += note;
                    nombreDeNotesValides++;// 5
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
