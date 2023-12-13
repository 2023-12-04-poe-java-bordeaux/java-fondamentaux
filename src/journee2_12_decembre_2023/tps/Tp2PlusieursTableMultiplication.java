package journee2_12_decembre_2023.tps;

import java.util.Scanner;

public class Tp2PlusieursTableMultiplication {
    public static void main(String[] args) {
        var input=new Scanner(System.in);

        System.out.print("Borne inférieure: ");
        var start=input.nextInt();

        System.out.print("Borne supérieur: ");
        var end=input.nextInt();

        if(start>end){
            var temp=end;
            end=start;
            start=temp;
        }
        for(var i=2;i<=10;i++){
            System.out.println("***************");
            System.out.printf("* Table de %d. *\n",i);
            System.out.println("***************\n");
            for(var j=start;j<=end;j++){
                System.out.printf("%d x %d = %d\n",i,j,(i*j));
            }
            System.out.print("\n\n");
        }
    }
}
