package journee1_11_decembre_2023.cours;

import java.util.Scanner;

public class Point12AndLogicalOperator {
    public static void main(String[] args) {
        final int AGE_MAJORITE=18;

        var input=new Scanner(System.in);
        System.out.print("Votre pays : ");
        var country=input.nextLine();
        var isFrench=country.equals("france");

        System.out.print("Votre age :");
        var age=input.nextInt();
        var isMajor=age>=AGE_MAJORITE;

        if(isFrench && isMajor){
            System.out.println("You can vote.");
        }else{
            System.out.println("You can't vote.");
        }
    }
}
