package journee3_13_decembre_2023.cours;

import java.util.ArrayList;
import java.util.Scanner;

public class Point2TableauxDynamiquesEnPratique {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Double> notesPhysique=new ArrayList<>();

        for(int i=0;i<3;i++){
            System.out.printf("Note[%d] : ",i);//Note[0]
            double valeur=input.nextDouble();
            notesPhysique.add(valeur);//Autoboxing -> conversion implicite
        }

        for(int i=0;i<notesPhysique.size();i++){
            System.out.printf("Note[%d] : %f\n",i,notesPhysique.get(i));
        }

        // [12,13,14] -> note=14
        for(double note:notesPhysique){
            System.out.println(note);
        }
    }
}
