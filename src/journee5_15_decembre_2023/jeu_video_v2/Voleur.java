package journee5_15_decembre_2023.jeu_video_v2;

public class Voleur extends Personnage{

    private int agilite;


    public Voleur(String nom, int niveauDeVie,int agilite) {
        super(nom, niveauDeVie);
        this.agilite = agilite;
    }

    public int getAgilite() {
        return agilite;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    @Override
    public void attaquer() {
        System.out.println(getNom() + " attaque furtivement avec une agilité de " + agilite + " !");
    }

    @Override
    public void seDefendre() {
        System.out.println(getNom() + " se défend !");
    }
}