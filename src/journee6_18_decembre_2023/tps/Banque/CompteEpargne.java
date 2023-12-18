package journee6_18_decembre_2023.tps.Banque;

public class CompteEpargne extends CompteBancaire {
    private final double tauxInteret;

    public CompteEpargne(String numeroCompte, double soldeInitial, double tauxInteret) {
        super(numeroCompte, soldeInitial);
        this.tauxInteret = tauxInteret;
    }

    public void appliquerInteret() {
        solde += solde * tauxInteret;
    }

    @Override
    public boolean retirer(double montant) {
        if (montant <= 0 || solde < montant) {
            return false; // Ne peut pas retirer un montant négatif, nul ou supérieur au solde
        }
        solde -= montant;
        return true;
    }
}
