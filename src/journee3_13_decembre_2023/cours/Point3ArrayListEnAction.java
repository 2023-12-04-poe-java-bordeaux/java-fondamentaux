package journee3_13_decembre_2023.cours;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Point3ArrayListEnAction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> notesPhysique = new ArrayList<>();

        while (true) {
            System.out.print("Entrez un nombre:  ");
            if (input.hasNextDouble()) {
                double valeur=input.nextDouble();
                if(valeur>=0 && valeur<=20){
                    notesPhysique.add(valeur);
                }
            } else {
                String value = input.next();
                if (value.equalsIgnoreCase("stop")) {
                    break;
                }
                System.out.println("Entrée invalide. Veuillez saisir un nombre entier.");
                input.next();
            }
        }

        double somme = 0;
        for (double note:notesPhysique) {
                somme += note;
        }

        System.out.println(notesPhysique);

        double moyenne = somme / notesPhysique.size();
        System.out.printf("Somme : %.2f\n", somme);
        System.out.printf("Moyenne : %.2f\n", moyenne);

        input.close();
    }
}
