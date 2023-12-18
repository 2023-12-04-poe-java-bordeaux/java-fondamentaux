package journee6_18_decembre_2023.tps.Algos;

import java.util.Scanner;

public class Tp2PlusGrandPlusPetit {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau : ");
        var taille = scanner.nextInt();

        var tab = new int[taille];

        System.out.print("Entrez les éléments du tableau : ");
        for(var i=0; i < taille; i++) {
            tab[i] = scanner.nextInt();
        }

        var plusGrand = tab[0];
        var indicePlusGrand = 0;

        var plusPetit = tab[0];
        var indicePlusPetit = 0;

        for(var i=1; i < taille; i++) {
            if(tab[i] > plusGrand) {
                plusGrand = tab[i];
                indicePlusGrand = i;
            }
            if(tab[i] < plusPetit) {
                plusPetit = tab[i];
                indicePlusPetit = i;
            }
        }

        var sb = new StringBuilder("[");
        for(var i=0; i < taille; i++) {
            sb.append(tab[i]);
            if(i == indicePlusGrand) {
                sb.append("(PG)");
            }
            if(i == indicePlusPetit) {
                sb.append("(PP)");
            }
            if(i < taille-1) {
                sb.append(", ");
            }
        }
        sb.append("]");

        System.out.println("Tableau : " + sb);
        System.out.println("Plus grand : " + plusGrand);
        System.out.println("Plus petit : " + plusPetit);

        scanner.close();

    }
}
