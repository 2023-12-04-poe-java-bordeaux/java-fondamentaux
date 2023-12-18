package journee4_14_decembre_2023.tps;

public class Tp3Tirelire {
    private double montant;

    public Tp3Tirelire() {
        this.montant = 0;
    }

    // Constructeur avec un montant initial
    public Tp3Tirelire(double montantInitial) {
        if (montantInitial > 0) {
            this.montant = montantInitial;
        } else {
            this.montant = 0;
        }
    }

    public double getMontant() {
        return montant;
    }

    public void afficher() {
        if (montant <= 0) {
            System.out.println("Vous êtes sans le sou.");
        } else {
            System.out.println("Vous avez : " + montant + " euros dans votre tirelire.");
        }
    }

    public void secouer() {
        if (montant > 0) {
            System.out.println("Bing bing");
        }
    }

    public void remplir(double montant) {
        if (montant > 0) {
            this.montant += montant;
        }
    }

    public void vider() {
        montant = 0;
    }

    public void puiser(double montant) {
        if (montant > 0) {
            this.montant = Math.max(this.montant - montant, 0);
        }
    }

    public double calculerSolde(double budget) {
        if (budget <= 0) {
            return montant;
        }
        return montant - budget;
    }
}
