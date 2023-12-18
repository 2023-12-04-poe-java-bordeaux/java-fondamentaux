package journee5_15_decembre_2023.tps.animaux;

public class Chien extends Animal {
    public Chien(String nom, int age) {
        super(nom, age);
    }

    public void emettreSon() {
        System.out.println(getNom() + " aboie !");
    }
}
