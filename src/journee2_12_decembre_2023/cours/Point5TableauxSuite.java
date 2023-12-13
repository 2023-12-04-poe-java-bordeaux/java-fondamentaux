package journee2_12_decembre_2023.cours;

import java.util.Scanner;

public class Point5TableauxSuite {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // double : 0.0
        // int : 0
        // boolean : false
        // String : null
        double[] notesPhysique= new double[3];//  {0.0, 0.0, 0.0}

        for(int i=0;i<notesPhysique.length;i++){
            System.out.printf("Note[%d] : ",i);//Note[0]
            notesPhysique[i]=input.nextDouble();
        }

        for(int i=0;i<notesPhysique.length;i++){
            System.out.printf("Note[%d] : %f\n",i,notesPhysique[i]);
        }
    }
}
