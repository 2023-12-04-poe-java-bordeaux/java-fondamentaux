package journee5_15_decembre_2023.tps.animaux3;

public class Chien extends Animal {
    private String race;

    public Chien(String nom, int age, String race) {
        super(nom, age);
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void afficherRace() {
        System.out.println(getNom() + " est de race " + race + ".");
    }

    @Override
    public void emettreSon() {
        super.emettreSon();
        System.out.println(getNom() + " aboie !");
    }
}
