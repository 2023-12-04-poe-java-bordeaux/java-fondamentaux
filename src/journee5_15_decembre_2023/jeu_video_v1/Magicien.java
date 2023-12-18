package journee5_15_decembre_2023.jeu_video_v1;

public class Magicien {
    private String nom;
    private int pointsDeVie;
    private int niveauMagie;

    public Magicien(String nom, int pointsDeVie, int niveauMagie) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.niveauMagie = niveauMagie;
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
        System.out.println(nom + " lance un sort magique !");
    }

    public void seDefendre() {
        System.out.println(nom + " se défend !");
    }

    public void lancerSort(String sort) {
        System.out.println(nom + " lance le sort " + sort + " avec un niveau de magie de " + niveauMagie + ".");
    }
}