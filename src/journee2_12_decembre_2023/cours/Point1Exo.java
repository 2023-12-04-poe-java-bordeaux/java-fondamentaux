package journee2_12_decembre_2023.cours;

import java.util.Scanner;

public class Point1Exo {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        var nombre=input.nextInt();

        for(int c=1;c<=13;c++){
            var produit=nombre*c;
            System.out.printf("%d x %d = %d\n",nombre,c,produit);
        }
    }
}
