# TPs

## TP1
Modifier le code suivant pour utiliser le `swtich-case` et rendre les tests 
`case-insentitive`

```java
import java.util.Scanner;

public class Point11AlternativesMultiples {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("Votre langue :");
        var language=input.next();// french

        if(language.equals("english")){
            System.out.println("Hello!!");
        }else if(language.equals("french")){
            System.out.println("Salut!!");
        }else if(language.equals("spanish")){
            System.out.println("Hola!!");
        }else if(language.equals("german")){
            System.out.println("Guten tag!!");
        }else {
            System.out.println("Language not supported.");
        }
    }
}
```

## TP2
Écrire un programme Java qui demande à l’utilisateur de saisir la valeur du diamètre, et qui ensuite va effectuer le calcul de la surface.

```
Surface = Rayon x Rayon x PI;
Rayon = Diamètre / 2
```


## TP3
Écrire un programme Java qui demande à l’utilisateur de saisir son nom, prenom et age,
et qui ensuite va afficher le message : `Vous vous appelez <prenom> <nom>, et vous avez <age> ans`

## TP4
Ecrire un programme Java qui déclare 3 variables, a,b,c et qui va ensuite effectuer une permutation de ces valeurs :
Exemple :
```
Entrez la première valeur(a) : 51
Entrez la deuxième valeur(b) : 876
Entrez la troisième valeur(c) : 235
Les valeurs entrées sont : a = 51, b = 876 et c = 235
Permutation: b <== a, c <== b, a <== c
Les valeurs permutées sont : a = 235, b = 51 et c = 876
```

## TP5
Ecrivez un programme Age.java qui :
demande son âge à l'utilisateur ;
lit la réponse de l'utilisateur et l'enregistre dans une variable age de type entier ;
Effectue le calcul de l'année de naissance de l'utilisateur et l'enregistre dans la variable annee de type entier ;
affiche l'année de naissance ainsi calculée.

Exemple d'exécution du programme:
```
Donnez votre âge : 29
Votre année de naissance est : 1992
```


## TP6
Écrivez un petit programme Java, Degre3.java, vous permettant d'évaluer un polynôme du
3ème degré de la forme:
`((a+b)/2)x3 + (a+b)2x2 + a + b + c`

Exemple d'exécution :
```Entrez a (int) : 1
Entrez b (int) : 2
Entrez c (int) : 3
Entrez x (double) : 3.5
La valeur du polynôme est : 180.5625
```

## TP7
Ecrivez un programme Java qui lit un nombre et indique s'il est positif, négatif ou s'il vaut zéro et s'il est pair ou impair.
Exemple d'exécution :

```
Entrez un nombre entier: 5
Le nombre est positif et impair
Entrez un nombre entier: -4
Le nombre est négatif et pair
Entrez un nombre entier: 0
Le nombre est zéro (et il est pair)
```

## TP8
Écrivez un programme Java qui permet de résoudre une équation du 2nd degré de la forme ax2+bx+c = 0.
L’utilisateur devra fournir a,b,c à partir du clavier, ensuite le programme lui donnera la solution
Principe du fonctionnement d’une équation du 2nd degré:

[SECOND DEGRE](https://www.maths-et-tiques.fr/telech/Secondegre2ESL.pdf)

## TP9
Écrire un programme qui permet à l’utilisateur de saisir un entier entre 1 et 12 et qui affiche le nom du mois correspondant.

Ex:
```
Mois : 4
Résult : Avril
```

## TP10
Écrire un programme Java qui demande à l’utilisateur d'entrer 2 nombres à partir du clavier, et qui ensuite va lui proposer un menu avec les opérations disponibles à choisir. Enfin le programme va exécuter le calcul selon le choix de l’utilisateur.

Exemple d’exécution

```
Entrez le premier nombre : 4
Entrez le 2ème nombre : 7

Addition (choisir 1 ou +)
Soustraction (choisir 2 ou -)
Multiplication (choisir 3 ou x)
Division(Choisir 4 ou /)
Votre choix : +

4 + 7 = 11
```
