package journee5_15_decembre_2023.tps.animaux2;

public class Animal {
    private String nom;
    private int age;

    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void emettreSon() {
        System.out.println("L'animal fait un son.");
    }
}
