package journee6_18_decembre_2023.tps.Banque;

public abstract class CompteBancaire implements Transactions {
    protected String numeroCompte;
    protected double solde;

    public CompteBancaire(String numeroCompte, double soldeInitial) {
        this.numeroCompte = numeroCompte;
        this.solde = soldeInitial;
    }

    @Override
    public boolean deposer(double montant) {
        if (montant <= 0) {
            return false; // Ne peut pas déposer un montant négatif ou nul
        }
        solde += montant;
        return true;
    }

    @Override
    public abstract boolean retirer(double montant);

    public double getSolde() {
        return solde;
    }
}