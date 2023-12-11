import java.util.Scanner;

public class Point5KeyboardInput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Votre age : ");

        int age=input.nextInt();
        System.out.printf("Vous avez %d ans.",age);
    }
}
