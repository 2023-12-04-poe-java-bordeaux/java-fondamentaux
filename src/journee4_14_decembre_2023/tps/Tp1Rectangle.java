package journee4_14_decembre_2023.tps;

public class Tp1Rectangle {
    private double longueur;
    private double largeur;

    public Tp1Rectangle(double longueur, double largeur) {
        setLongueur(longueur);
        setLargeur(largeur);
    }

    public void setLongueur(double longueur) {
        if (longueur <= 0) {
            throw new IllegalArgumentException("La longueur doit être positive");
        }

        this.longueur = longueur;
    }

    public void setLargeur(double largeur) {
        if (largeur <= 0) {
            throw new IllegalArgumentException("La largeur doit être positive");
        }

        this.largeur = largeur;
    }

    @Override
    public String toString() {
        return "Tp1Rectangle{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                '}';
    }
}
