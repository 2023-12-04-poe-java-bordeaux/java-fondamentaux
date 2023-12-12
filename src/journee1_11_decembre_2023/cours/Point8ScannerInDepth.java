package journee1_11_decembre_2023.cours;

import java.util.Scanner;

public class Point8ScannerInDepth {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("Votre prenom : ");
//        String prenom=input.next();
//        String nom=input.next();
//        String postnom=input.next();
//        System.out.println("Prenom : "+prenom);
//        System.out.println("Nom : "+nom);
//        System.out.println("Postnom : "+postnom);

//        String name=input.next();
//        int age=input.nextInt();
//        System.out.println(name);
//        System.out.println(age);

        String fullName=input.nextLine();
        System.out.println(fullName);
    }
}
