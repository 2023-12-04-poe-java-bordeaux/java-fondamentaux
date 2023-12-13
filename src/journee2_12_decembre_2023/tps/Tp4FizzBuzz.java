package journee2_12_decembre_2023.tps;

import java.util.Scanner;

public class Tp4FizzBuzz {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("Entrez un nombre :");
        var nombre=input.nextInt();

        for(var i=1;i<=nombre;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
        input.close();
    }
}
