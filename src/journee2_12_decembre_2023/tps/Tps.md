# TPs

## TP1


```java
import java.util.Scanner;
public class Point1Exo {
public static void main(String[] args) {
var input=new Scanner(System.in);
System.out.print("Entrez un nombre : ");
var nombre=input.nextInt();

        for(int c=1;c<=13;c++){
            var produit=nombre*c;
            System.out.printf("%d x %d = %d\n",nombre,c,produit);
        }
    }
}
```
        
A partir de l'exercice ci-dessus, l'utilisateur doit pouvoir entrer les 2 bornes. Par exemple au lieu de toujours avoir 1 à 13, il peut choisir d'autres valeurs.



## TP2
Écrivez un programme Tables.java affichant les tables de multiplication de 2 à 10.
Votre programme devra produire la sortie suivante à l'écran :

Tables de multiplication

```
Table de 2 :
1 * 2 = 2
...
10 * 2 = 20
...
Table de 5 :
1 * 5 = 5
2 * 5 = 10
... ...
Table de 10 :
1 * 10 = 10 …
...
```

## TP3
Écrivez un programme Java qui demande à l’utilisateur d’entrer un nombre et qui ensuite va calculer et afficher la factorielle de ce nombre:

Ex:
```
Nombre : 3

Factorielle de 3 : 3x2x1 = 6
```

Regle de calcul de factorielle : [FACTORIELLES](http://villemin.gerard.free.
fr/Denombre/Factorie.htm)


## TP4
Ecrivez un programme qui affiche en console les nombres de 1 à n:

pour les multiples de trois, il affiche "fizz" à la place du nombre
et pour les multiples de cinq de cinq, imprimez "buzz".
Pour les nombres qui sont des multiples multiples à la fois de trois et de cinq, imprimez "fizzbuzz".
Sinon, il affiche le nombre

Exemple:

```
Si n = 5
1
2
fizz
4
Buzz
```

##  TP5
Voici le code de départ:

```java
import java.util.Scanner;

public class journee2_12_decembre_2023.cours.Point5TableauxSuite {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // double : 0.0
        // int : 0
        // boolean : false
        // String : null
        double[] notesPhysique= new double[3];//  {0.0, 0.0, 0.0}

        for(int i=0;i<notesPhysique.length;i++){
            System.out.printf("Note[%d] : ",i);//Note[0]
            notesPhysique[i]=input.nextDouble();
        }

        for(int i=0;i<notesPhysique.length;i++){
            System.out.printf("Note[%d] : %f\n",i,notesPhysique[i]);
        }
    }
}
```
**Premiers requirements**
- Demander à l'utiliser combien de notes il souhaite insérer(la valeur doit toujours être positive, sinon il devra recommencer)
- Pour les notes, la valeur doit toujours être entre 0 et 20, sinon la saisie sera invalide.

**Deuxième requirement**
Au lieu de demander à l'utilisateur combien de notes, il souhaite entrer, il faut lui donner la possibilité d'entrer autant de note que possible, et quand il saisi stop, alors le programme continue et calcule la somme et la moyenne.

TP6.
A l'exercice ci-dessous:
```java
import java.util.Scanner;

public class journee2_12_decembre_2023.cours.Point2BoucleWhile {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("Veuillez entrer un code PIN : ");
        var codePin=input.nextInt();//1234

        var codePinATester=0;

       do{
            System.out.print("Veuillez entrer un code PIN pour débloquer l'appareil: ");
            codePinATester=input.nextInt();
           if(codePinATester!=codePin){
               System.out.println("Code Pin invalide, veuillez réessayer.");
           }
        } while (codePinATester!=codePin);// 1234 != 1234 => false

    }
}
```

- Limiter le nombre de tentatives à 5
- Au bout de 2 tentatives incorrectes, commencer à afficher le nombre de tentatives restantes. Ex : Il vous reste 3 tentatives
- Le code PIN doit toujours être composé de 4 chiffres(Les codes pin avec < 4 ou >4 chiffres sont rejetés, il l'utilisateur doit recommencer)
- Au bout de 5 tentatives incorrectes, bloquer l'appareil.
