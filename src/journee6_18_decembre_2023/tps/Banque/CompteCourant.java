package journee6_18_decembre_2023.tps.Banque;

public class CompteCourant extends CompteBancaire {
    private final double limiteDecouvert;

    public CompteCourant(String numeroCompte, double soldeInitial, double limiteDecouvert) {
        super(numeroCompte, soldeInitial);
        this.limiteDecouvert = limiteDecouvert;
    }

    @Override
    public boolean retirer(double montant) {
        if (montant <= 0 || solde - montant < -limiteDecouvert) {
            return false; // Ne peut pas retirer si cela dépasse la limite de découvert
        }
        solde -= montant;
        return true;
    }
}

