package journee4_14_decembre_2023.tps;

public class Tp2Patient {
    private double poids; // Poids en kilogrammes
    private double taille; // Taille en mètres

    public Tp2Patient(double poids, double taille) {
        setPoids(poids);
        setTaille(taille);
    }

    public void setPoids(double poids) {
        if (poids > 0) {
            this.poids = poids;
        } else {
            throw new IllegalArgumentException("Le poids doit être positif");
        }
    }

    public void setTaille(double taille) {
        if (taille > 0) {
            this.taille = taille;
        } else {
            throw new IllegalArgumentException("La taille doit être positive");
        }
    }

    public double getPoids() {
        return poids;
    }

    public double getTaille() {
        return taille;
    }

    public double calculerIMC() {
        return poids / (taille * taille);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "poids=" + poids +
                ", taille=" + taille +
                ", IMC=" + calculerIMC() +
                '}';
    }
}
