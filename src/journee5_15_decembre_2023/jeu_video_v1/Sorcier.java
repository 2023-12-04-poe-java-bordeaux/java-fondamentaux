package journee5_15_decembre_2023.jeu_video_v1;

public class Sorcier {
    private String nom;
    private int pointsDeVie;
    private int niveauMagie;
    private int nombrePotions;

    public Sorcier(String nom, int pointsDeVie, int niveauMagie, int nombrePotions) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.niveauMagie = niveauMagie;
        this.nombrePotions = nombrePotions;
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
        System.out.println(nom + " lance un sort de sorcier avec une potion !");
    }

    public void seDefendre() {
        System.out.println(nom + " se défend !");
    }

    public void lancerSort(String sort) {
        System.out.println(nom + " lance un sort de sorcier " + sort + " avec un niveau de magie de " + niveauMagie + " et utilise une potion !");
    }

    public void creerPotion() {
        nombrePotions++;
        System.out.println(nom + " crée une potion magique. Nombre total de potions: " + nombrePotions);
    }
}