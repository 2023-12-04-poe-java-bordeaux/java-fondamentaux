public class Point3Affichage {
    public static void main(String[] args) {
        String firstName="Christian";
        String lastName="Lisangola";
        int age=17;
        double weight=35.45;
        // Je m'appelle Christian Lisangola, j'ai 17 ans, et je pèse 35.4 Kg.
        System.out.println("Je m'appelle "+firstName+" "+lastName+", j'ai "+age+" ans, et je pèse "+weight+"Kg.");
        System.out.printf("Je m'appelle %s %s, j'ai %d ans, et je pèse %f Kg.\n",firstName,lastName,age,weight);
        System.out.printf("Je m'appelle %s %s, j'ai %d ans, et je pèse %.1f Kg.",firstName,lastName,age,weight);
    }
}
