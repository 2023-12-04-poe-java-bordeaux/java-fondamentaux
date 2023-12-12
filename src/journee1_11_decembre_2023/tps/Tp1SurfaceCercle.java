package journee1_11_decembre_2023.tps;

import java.util.Scanner;

public class Tp1SurfaceCercle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Veuillez saisir la valeur du diamètre :");
        double diameter = input.nextDouble();

        double radius = diameter / 2;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.printf("Surface : %.2f", area);
        input.close();
    }
}
