package journee5_15_decembre_2023.tps.batiments;

public class Maison extends Batiment {

    private int nbPieces;
    private static double sommeNbPieces;

    public Maison() {
        super();
    }

    public Maison(String adresse, int nbPieces) {
        super(adresse);
        this.nbPieces = nbPieces;
        sommeNbPieces += nbPieces;
    }

    public int getNbPieces() {
        return nbPieces;
    }

    public void setNbPieces(int nbPieces) {
        this.nbPieces = nbPieces;
    }

    @Override
    public String toString() {
        return String.format("{nbPieces=%d, adresse='%s'}",
                nbPieces, super.toString());
    }

    public static double moyenneNbPieces() {
        return sommeNbPieces / Batiment.getNombreBatiments();
    }

}





