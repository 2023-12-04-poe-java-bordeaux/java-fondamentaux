package journee1_11_decembre_2023.cours;

import java.util.Scanner;

public class Point10ConditionAndBooleanType {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Votre age : ");

        final int AGE_MAJORITE=18;

        int age=input.nextInt();

        boolean isMajeur=age>=AGE_MAJORITE;

        if(isMajeur){
            System.out.println("Continuer....");
        }else {
            System.out.println("Au revoir.");
        }
    }
}
