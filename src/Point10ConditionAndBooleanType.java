import java.util.Scanner;

public class Point10ConditionAndBooleanType {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Votre age : ");

        int age=input.nextInt();

        boolean isMajeur=age>=18;
        if(isMajeur){
            System.out.println("Continuer....");
        }else {
            System.out.println("Au revoir.");
        }
    }
}
