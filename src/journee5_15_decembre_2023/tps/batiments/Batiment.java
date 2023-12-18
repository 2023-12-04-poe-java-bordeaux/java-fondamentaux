package journee5_15_decembre_2023.tps.batiments;

public abstract class Batiment {

    private static int compteurBatiments;
    private String adresse;

    public Batiment() {
        compteurBatiments++;
    }

    public static int getNombreBatiments(){
        return compteurBatiments;
    }

    public Batiment(String adresse) {
        compteurBatiments++;
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return String.format("{adresse='%s'}", adresse);
    }

}