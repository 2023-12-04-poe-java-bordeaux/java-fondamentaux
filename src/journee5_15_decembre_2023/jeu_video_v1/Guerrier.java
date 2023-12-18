package journee5_15_decembre_2023.jeu_video_v1;

public class Guerrier {
    private String nom;
    private int pointsDeVie;
    private int force;

    public Guerrier(String nom, int pointsDeVie, int force) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.force = force;
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
        System.out.println(nom + " attaque avec son épée et une force de " + force + " !");
    }

    public void seDefendre() {
        System.out.println(nom + " se défend !");
    }

    public void attaquePuissante() {
        System.out.println(nom + " lance une attaque puissante !");
    }
}