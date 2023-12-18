package journee5_15_decembre_2023.tps.batiments;

public class Main {

    public static void main(String[] args) {
        Maison maison1 = new Maison("2 rue de la Maison", 4);
        Maison maison2 = new Maison("3 rue de la Maison", 3);

        System.out.println(maison1);
        System.out.println(maison2);

        System.out.println("Nombre de batiments : " + Batiment.getNombreBatiments());
        System.out.println("Moyenne nb pieces : " + Maison.moyenneNbPieces());
    }
}