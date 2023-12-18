package journee6_18_decembre_2023.tps.Banque;

public class Main {
    public static void main(String[] args) {
        CompteEpargne ce = new CompteEpargne("12345E", 1000, 0.02);
        CompteCourant cc = new CompteCourant("12345C", 500, 200);

        ce.deposer(500);
        ce.retirer(200);
        ce.appliquerInteret();

        cc.deposer(300);
        cc.retirer(800); // Doit respecter la limite de découvert

        System.out.println("Solde Compte Épargne: " + ce.getSolde());
        System.out.println("Solde Compte Courant: " + cc.getSolde());
    }
}
