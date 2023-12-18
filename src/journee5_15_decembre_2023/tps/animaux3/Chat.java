package journee5_15_decembre_2023.tps.animaux3;

public class Chat extends Animal {
    private boolean estIndoor;

    public Chat(String nom, int age, boolean estIndoor) {
        super(nom, age);
        this.estIndoor = estIndoor;
    }

    public boolean isEstIndoor() {
        return estIndoor;
    }

    public void setEstIndoor(boolean estIndoor) {
        this.estIndoor = estIndoor;
    }

    public void afficherType() {
        if(estIndoor) {
            System.out.println(getNom() + " est un chat d'intérieur.");
        } else {
            System.out.println(getNom() + " est un chat d'extérieur.");
        }
    }

    @Override
    public void emettreSon() {
        super.emettreSon();
        System.out.println(getNom() + " miaule !");
    }
}
