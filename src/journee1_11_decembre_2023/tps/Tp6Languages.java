package journee1_11_decembre_2023.tps;

import java.util.Scanner;

public class Tp6Languages {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.print("Votre langue : ");
        var language = input.next();

        // Switch case : Lambdas
        switch (language.toLowerCase()) {
            case "english" -> System.out.println("Hello!!");
            case "french" -> System.out.println("Salut!!");
            case "spanish" -> System.out.println("Hola!!");
            case "german" -> System.out.println("Guten tag");
            default -> System.out.println("Langue non supportée!!");
        }
        input.close();
    }
}
