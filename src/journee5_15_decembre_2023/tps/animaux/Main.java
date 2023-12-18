package journee5_15_decembre_2023.tps.animaux;

public class Main {
    public static void main(String[] args) {
        Chien chien = new Chien("Rex", 5);
        Chat chat = new Chat("Misty", 3);

        chien.emettreSon(); // Devrait afficher: "Rex aboie !"
        chat.emettreSon();  // Devrait afficher: "Misty miaule !"
    }
}
