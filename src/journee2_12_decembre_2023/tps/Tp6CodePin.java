package journee2_12_decembre_2023.tps;

import java.util.Scanner;

public class Tp6CodePin {
    public static void main(String[] args) {
//        Limiter le nombre de tentatives à 5
//        Au bout de 2 tentatives incorrectes, commencer à afficher le nombre de tentatives restantes
//        Le code Pin doit toujours être composé de 4 chiffres
//        Au bout de 2 tentatives incorrectes, bloquer l'appareil
        final var CODE_PIN_LENGTH = 4;
        final var MAX_ATTEMPTS = 5;
        var input = new Scanner(System.in);

        var codePin = 0;

        do  {
            System.out.print("Veuillez définir un code PIN de " + CODE_PIN_LENGTH + " chiffres : ");
            if (input.hasNextInt()) {
                codePin = input.nextInt();
                if (Integer.toString(codePin).length() == CODE_PIN_LENGTH) {
                    break;
                }
            } else {
                input.next();
            }
            System.out.println("Erreur. Le code PIN doit être composé de " + CODE_PIN_LENGTH + " chiffres.");
        }while (true);

        var attempts = 0;
        var isUnlocked = false;
        do {
            System.out.print("Veuillez entrer un code PIN pour débloquer l'appareil : ");
            if (input.hasNextInt()) {
                var enteredPin = input.nextInt();
                attempts++;
                if (enteredPin == codePin) {
                    isUnlocked = true;
                    System.out.println("Appareil débloqué");
                    break;
                } else {
                    System.out.println("Code PIN incorrect. Veuillez ressayer.");
                }
            } else {
                input.next();
            }

            if (attempts >= MAX_ATTEMPTS) {
                System.out.printf("Vous avez saisi %d fois de mauvais code PIN, votre compte est bloqué.\n", attempts);
                break;
            } else if (attempts >= 2) {
                System.out.printf("Il vous reste %d tentative(s).\n", MAX_ATTEMPTS - attempts);
            }
        } while (true);

        if (!isUnlocked) {
            System.out.println("Appareil bloqué.");
        }
    }
}
