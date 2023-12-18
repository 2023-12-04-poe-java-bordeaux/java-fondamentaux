package journee5_15_decembre_2023.tps.animaux;

public class Chat extends Animal {
    public Chat(String nom, int age) {
        super(nom, age);
    }

    public void emettreSon() {
        System.out.println(getNom() + " miaule !");
    }
}
