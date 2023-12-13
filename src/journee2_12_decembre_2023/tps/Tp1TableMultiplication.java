package journee2_12_decembre_2023.tps;

import java.util.Scanner;

public class Tp1TableMultiplication {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        var nombre=input.nextInt();

        System.out.print("Borne inférieure: ");
        var start=input.nextInt();

        System.out.print("Borne supérieur: ");
        var end=input.nextInt();

        if(start>end){
            var temp=end;
            end=start;
            start=temp;
        }

        for(int c=start;c<=end;c++){
            var produit=nombre*c;
            System.out.printf("%d x %d = %d\n",nombre,c,produit);
        }
    }
}
