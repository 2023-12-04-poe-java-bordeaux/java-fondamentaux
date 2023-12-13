package journee2_12_decembre_2023.cours;

import java.util.Scanner;

public class Point3BoucleWhileFacto {
    public static void main(String[] args) {
        var input = new Scanner(System.in);


        var nombre=0;
        do{
            System.out.print("Nombre : ");
            nombre = input.nextInt();
            if(nombre<0){
                System.out.println("La factorielle n'est pas définie pour les nombres négatifs.Veuillez réessayer.");
            }
        }while (nombre<0);

            var factorielle = 1;
            StringBuilder operations = new StringBuilder();
            for (var i = 1; i <= nombre; i++) {
                factorielle *= i;
                operations.append(i);

                if (i < nombre) {
                    operations.append(" x ");
                }
            }

            System.out.println("Factorielle de " + nombre + " : " + operations + " = " + factorielle);

        input.close();
    }
}
