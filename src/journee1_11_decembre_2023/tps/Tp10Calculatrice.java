package journee1_11_decembre_2023.tps;

import java.util.Scanner;

public class Tp10Calculatrice {
    public static void main(String[] args) {
        var input=new Scanner(System.in);

        System.out.print("Premier nombre : ");
        var firstNumber=input.nextDouble();

        System.out.print("Deuxième nombre : ");
        var secondNumber=input.nextDouble();

        System.out.println("************************************");
        System.out.println("** Veuillez choisir une opération **");
        System.out.println("************************************");
        System.out.println("Addition (choisir 1 ou + )");
        System.out.println("Soustraction (choisir 2 ou - )");
        System.out.println("Multiplication (choisir 3 ou x )");
        System.out.println("Division(Choisir 4 ou / )");
        System.out.print("Votre choix : ");

        var choice=input.next();

        System.out.print(
                switch (choice){
                    case "1","+"->String.format("%.1f + %.1f = %.1f",firstNumber,secondNumber,(firstNumber+secondNumber));
                    case "2","-"->String.format("%.1f - %.1f = %.1f",firstNumber,secondNumber,(firstNumber-secondNumber));
                    case "3","x"->String.format("%.1f x %.1f = %.1f",firstNumber,secondNumber,(firstNumber*secondNumber));
                    case "4","/"->String.format("%.1f / %.1f = %.2f",firstNumber,secondNumber,(firstNumber/secondNumber));
                    default -> "Opération invalide";
                }
        );
    }
}
