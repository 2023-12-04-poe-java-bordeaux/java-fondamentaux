package journee1_11_decembre_2023.tps;

import java.util.Scanner;

public class Tp6LanguagesWithEnum {

    enum Language{
        ENGLISH,
        FRENCH,
        GERMAN,
        SPANISH
    }
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.print("Votre langue : ");
        var langInput = input.next();

        Language language;
        try {
            language=Language.valueOf(langInput.toUpperCase());
        }catch (IllegalArgumentException e){
            System.out.println("Langue non supportée!!");
            input.close();
            return;
        }

        // Switch case : Lambdas
        switch (language) {
            case ENGLISH -> System.out.println("Hello!!");
            case FRENCH -> System.out.println("Salut!!");
            case SPANISH -> System.out.println("Hola!!");
            case GERMAN -> System.out.println("Guten tag");
            default -> System.out.println("Langue non supportée!!");
        }
        input.close();
    }
}
