package journee2_12_decembre_2023.tps;

import java.util.Scanner;

public class Tp3FactorielleBonus {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.print("Nombre : ");
        var nombre = input.nextInt();

        if (nombre < 0) {
            System.out.println("La factorielle n'est pas définie pour les nombres négatifs.");
        } else {
            var factorielle = 1;
            StringBuilder operations = new StringBuilder();
//            String operation = ""; Mauvaise pratique, car cette approche va à chaque fos créer une nouvelle chaine

            for (var i = 1; i <= nombre; i++) {
                factorielle *= i;
                operations.append(i);
//                operation +=i; Mauvaise pratique

                if (i < nombre) {
                    operations.append(" x ");
//                    operation +="x"; Mauvaise pratique
                }
            }

            System.out.println("Factorielle de " + nombre + " : " + operations + " = " + factorielle);
        }
        input.close();
    }
}
