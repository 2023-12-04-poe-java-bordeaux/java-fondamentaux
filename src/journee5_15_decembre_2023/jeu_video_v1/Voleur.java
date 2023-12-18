package journee5_15_decembre_2023.jeu_video_v1;

public class Voleur {
    private String nom;
    private int pointsDeVie;
    private int agilite;

    public Voleur(String nom, int pointsDeVie, int agilite) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.agilite = agilite;
    }

    public String getNom() {
        return nom;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public void attaquer() {
        System.out.println(nom + " attaque furtivement avec une agilité de " + agilite + " !");
    }

    public void seDefendre() {
        System.out.println(nom + " se défend !");
    }

    public void deplacementFurtif() {
        System.out.println(nom + " se déplace furtivement grâce à son agilité de " + agilite + ".");
    }
}