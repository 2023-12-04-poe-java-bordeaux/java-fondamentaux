package journee5_15_decembre_2023.jeu_video_v2;

public class Guerrier extends Personnage{
    private int force;

    public Guerrier(String nom, int niveauDeVie, int force) {// "chris",100,200
        super(nom,niveauDeVie);// "chris",100
        this.force = force;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    @Override
    public void attaquer() {
        System.out.println(getNom() + " attaque avec son épée et une force de " + force + " !");
    }

    @Override
    public void seDefendre() {
        System.out.println(getNom() + " se défend !");
    }
}