package journee5_15_decembre_2023.tps.animaux2;

public class Chat extends Animal {
    public Chat(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void emettreSon() {
        super.emettreSon();  // Appelle la méthode de la classe parent
        System.out.println(getNom() + " miaule !");
    }
}
