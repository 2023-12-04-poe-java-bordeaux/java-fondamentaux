package journee5_15_decembre_2023.tps.animaux3;

public class Main {
    public static void main(String[] args) {
        Chien chien = new Chien("Rex", 5, "Labrador");
        Chat chat = new Chat("Misty", 3, true);

        chien.emettreSon();
        chien.afficherRace(); // Affiche la race du chien

        chat.emettreSon();
        chat.afficherType(); // Indique si le chat est d'intérieur ou d'extérieur
    }
}
