package journee1_11_decembre_2023.tps;

import java.util.Scanner;

public class Tp8Equation2ndDegre {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("a : ");
        var a=input.nextDouble();//1

        System.out.print("b : ");
        var b=input.nextDouble();//4;

        System.out.print("c : ");
        var c=input.nextDouble();//1;
        var x1=0.0;
        var x2=0.0;
        var delta=Math.pow(b,2)-4*a*c;

        if(a==0){
            System.err.println("Le coefficient de x² vaut 0. Ce n'est donc pas une" +
                    " équation du 2nd degré");
            System.exit(1);// 0
        }

        System.out.printf("Equation de la forme %.1fx² + %.1fx + %.1f = 0 \n\n",a,b
                ,c);

        if(delta>=0){
            x1=(-b-Math.sqrt(delta))/(2*a);
            x2=(-b+Math.sqrt(delta))/(2*a);
            if(delta==0){
                System.out.println("L'équation admet une seule racine où x1 = x2");
            }
            System.out.printf("x1 = %.2f , x2 = %.2f",x1,x2);
        }else{
            System.out.println("L'équation n'admet aucune racine réelle.");
        }
        input.close();
    }
}
