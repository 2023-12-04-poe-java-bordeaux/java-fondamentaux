package journee2_12_decembre_2023.cours;

public class Point4Tableaux {
    public static void main(String[] args) {
        double[] notesPhysique={5,12,17,8,15};//5


        for(int i=0;i<=notesPhysique.length-1;i++){
            System.out.println(notesPhysique[i]);
        }


        double somme=0;
        for(int i=0;i<notesPhysique.length;i++){
            // i=0; somme = 0; somme=somme+notesPhysique[0] => somme = 0+5 = 5
            // i=1; somme = 5; somme=somme+notesPhysique[1] => somme = 5+12 = 17
            // i=2; somme = 17; somme=somme+notesPhysique[2] => somme = 17+17 = 34
            // i=3; somme = 34; somme=somme+notesPhysique[3] => somme = 34+8 = 42
            // i=4; somme = 42; somme=somme+notesPhysique[4] => somme = 42+15 = 57
            somme +=notesPhysique[i]; // ou  somme = somme+notesPhysique[i];
        }

        double moyenne=somme/notesPhysique.length;

        System.out.printf("Somme : %.1f\nMoyenne %.3f\n",somme,moyenne);
    }
}
