import java.util.Scanner;

public class Point9Conditions {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Votre age : ");

        int age=input.nextInt();

        if(age>=18){
            System.out.println("Continuer....");
        }else {
            System.out.println("Au revoir.");
        }

//        if(age>18 || age==18){
//            System.out.println("Vous pouvez voter.");
//        }else {
//            System.out.println("Vous ne pouvez pas voter.");
//        }
    }
}
