package journee6_18_decembre_2023.jeu_video_v2;

public abstract class Personnage {
    private String nom;
    private int niveauDeVie;
    private static int nombrePersonnages=0;

    public final static int DUREE_DE_VIE_MAX=1000;

    public Personnage(String nom, int niveauDeVie) {
        this.nom = nom;
        this.niveauDeVie = niveauDeVie;
        nombrePersonnages++;
    }

    public static int getNombrePersonnages(){
        return nombrePersonnages;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public final int getNiveauDeVie() {
        return niveauDeVie;
    }

    public void setNiveauDeVie(int niveauDeVie) {
        this.niveauDeVie = niveauDeVie;
    }
}
