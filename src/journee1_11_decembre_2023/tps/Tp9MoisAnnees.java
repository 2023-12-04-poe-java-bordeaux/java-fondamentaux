package journee1_11_decembre_2023.tps;

import java.util.Scanner;

public class Tp9MoisAnnees {
    public static void main(String[] args) {
        var input=new Scanner(System.in);

        System.out.print("Entrez un nombre correspondant à un mois(1-12) : ");
        var mois=input.nextInt();

        System.out.println(
                switch (mois){
                    case 1->"Janvier";
                    case 2->"Février";
                    case 3->"Mars";
                    case 4 -> "Avril";
                    case 5 -> "Mai";
                    case 6 -> "Juin";
                    case 7 -> "Juillet";
                    case 8 -> "Août";
                    case 9 -> "Septembre";
                    case 10 -> "Octobre";
                    case 11 -> "Novembre";
                    case 12 -> "Décembre";
                    default -> "Mois invalide";
                }
        );
        input.close();
    }
}
