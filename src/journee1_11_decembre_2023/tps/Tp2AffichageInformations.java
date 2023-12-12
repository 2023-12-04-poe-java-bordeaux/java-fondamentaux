package journee1_11_decembre_2023.tps;

import java.util.Scanner;

public class Tp2AffichageInformations {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Votre nom : ");
        String nom=input.nextLine();

        System.out.print("Votre prenom : ");
        String prenom=input.nextLine();

        System.out.print("Votre age : ");
        int age=input.nextInt();

        System.out.printf("Vous vous appelez %s %s, et vous avez %d ans.",prenom,nom,age);

        input.close();
    }
}
