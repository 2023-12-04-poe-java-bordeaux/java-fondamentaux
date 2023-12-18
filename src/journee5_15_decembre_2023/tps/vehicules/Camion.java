package journee5_15_decembre_2023.tps.vehicules;


class Camion extends Vehicule {
    public Camion(int anneeModele, double prix) {
        super(anneeModele, prix);
    }

    @Override
    public void demarrer() {
        System.out.println("Le camion démarre.");
    }

    @Override
    public void accelerer() {
        System.out.println("Le camion accélère.");
    }
}





