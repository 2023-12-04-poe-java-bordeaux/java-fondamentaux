# Recap des points clés du moule Java et POO

### Encapsulation :

**Définition :** Regroupement des données et des méthodes qui opèrent sur ces données au sein d'une même unité (classe), en cachant les détails aux autres objets. Fournit un contrôle sur l'accès et une flexibilité de mise en œuvre.

Voici les points importants à retenir:
- Regroupement de données et de méthodes associées dans une classe.
- Les variables de données sont cachées de l'extérieur avec un accès privé.
- Les getters et setters fournissent un accès contrôlé aux données.

L'encapsulation traite donc de la mise en œuvre - cachant les données et fournissant une API pour l'accès.

**Mise en œuvre :** La classe `Personnage` encapsule les champs `nom` et `niveauDeVie` en les déclarant privés. Cela empêche l'accès direct à ces derniers depuis d'autres classes. Les accesseurs (getters) et mutateurs (setters) publics permettent un accès contrôlé tout en cachant le détail de mise en œuvre que ce sont des champs. Les sous-classes encapsulent également leurs propres champs comme `force` et `niveauMagie`.

### Abstraction :

**Définition :** Ignorer ou cacher les détails qui n'ont pas d'importance, en exposant uniquement les fonctionnalités et caractéristiques pertinentes à l'objectif de l'objet. Aide à gérer la complexité.

**Mise en œuvre :** La classe `Personnage` sert d'abstraction. Elle expose uniquement les attributs (`nom`, `niveauDeVie`) et comportements (`attaquer()`, `seDefendre()`) qui sont fondamentaux pour un personnage dans le jeu. Les détails sur la manière dont différents personnages attaquent et se défendent sont cachés. Les sous-classes étendent cette abstraction en spécialisant les attaques/défenses pour chaque type de personnage.

D'autre part, l'abstraction se concentre sur la simplification des interfaces pour gérer la complexité. Aspects clés :

Voici les points importants à retenir:
- Cacher les détails inutiles des objets extérieurs.
- Exposer uniquement les fonctionnalités et caractéristiques essentielles.
- Réduire la complexité de l'interface en incluant uniquement ce qui est nécessaire.

L'abstraction est donc une question de simplification - exposer uniquement des méthodes publiques de haut niveau dans l'interface de la classe qui fournissent une certaine fonctionnalité utile. Cacher les fonctionnements internes et les détails dans des méthodes privées.

### Héritage :

**Définition :** Création de relations hiérarchiques entre les classes où une sous-classe hérite de l'état et des comportements de sa classe parente. Permet la réutilisation et l'extension de la logique commune.

**Mise en œuvre :** La hiérarchie avec la superclasse `Personnage` et les sous-classes `Guerrier`, `Magicien`, etc., illustre l'héritage. Les sous-classes héritent de l'état `nom` et `niveauDeVie` ainsi que des implémentations de base des méthodes comme `attaquer()`, `seDefendre()`, etc. Cela évite de réécrire le même code plusieurs fois.

### Polymorphisme :

**Définition :** Traitement d'objets de différentes sous-classes de la même manière, en s'appuyant sur le fait que la sous-classe remplace la fonctionnalité de la classe parente selon les besoins.

**Mise en œuvre :** La méthode `attaquer()` se comporte différemment selon qu'elle est appelée sur une instance de `Guerrier` ou de `Magicien`, même si la référence est de la classe parente `Personnage`. Chaque sous-classe remplace la méthode et fournit une logique d'attaque spécifique à chaque type de personnage.




## JVM et mémoire

**La JVM (Java Virtual Machine)** :
- La JVM est une machine virtuelle qui exécute le code bytecode Java.
- Elle abstrait les détails matériels de la machine pour permettre au bytecode Java de fonctionner indifféremment sur différentes plateformes (Windows, Linux, Mac etc.).
- La JVM s'occupe entre autres de l'allocation et de la désallocation mémoire, sous le contrôle du garbage collector.

**Le garbage collector** :
- Le garbage collector libère périodiquement la mémoire des objets Java non utilisés pendant l'exécution du programme.
- Par exemple, si un objet est créé puis que toutes les références à cet objet sont perdues quand sa valeur n'est plus nécessaire, le garbage collector peut identifier qu'il n'est plus accessible et libérer la mémoire.

**Memory leaks** :
- Un memory leak se produit quand des objets ne sont plus utiles mais occupent toujours de la mémoire parce que le garbage collector n'arrive pas à les identifier comme non utilisés.
- Cela peut se produire si un objet inutilisé demeure référencé. Par exemple, en conservant par mégarde des références vers des objets dans des collections globales.



## Une question importante : Pourquoi systématiquement utiliser `input.close()` s'il existe un `garbage collector` en `Java` pour nettoyer la mémoire allouée aux objets non référencés ?

La raison est que le garbage collector gère uniquement la mémoire allouée aux `objets Java`. Mais il y a d'autres types de mémoire alloués en dehors, comme :

- fichiers
- sockets réseaux
- bases de données, etc.


Ces types de ressources ne sont PAS gérées par le `garbage collector Java`.

Donc, si on oublie de fermer correctement un Scanner par exemple, la ressource native associée au flux (fichier, socket...) va rester allouée même si l'objet Scanner est garbage collecté.

On se retrouve alors avec une fuite sur une ressource native, mais pas forcément sur la mémoire Java !

C'est pourquoi il est quand même essentiel de bien fermer les ressources en Java, pour éviter d'épuiser les ressources natives permises pour l'application.



## Visibilités

Le prochain formateur reviendra sur les notions suivantes :
- `Package` en Java
- `protected`

Cependant, voici un petit tableau qui va vous permettre de mieux comprendre.

| Niveau d'accès | Classe | Package | Sous-classe (même pkg/dossier) | Sous-classe (pkg diff) | Monde |
|----------------|--------|---------|--------------------------------|------------------------|-------|
| public         | O      | O       | O                              | O                      | O     |
| protected      | O      | O       | O                              | O*                     | N     |
| sans modif.    | O      | O       | O                              | N                      | N     |
| private        | O      | N       | N                              | N                      | N     |

- O: Accessible
- N: Non accessible
- *: Accessible uniquement si hérité

**Remarques :**
- **Classe** : Visibilité dans la classe où elle est déclarée.
- **Package** : Visibilité dans d'autres classes du même package.
- **Sous-classe (même pkg)** : Visibilité dans les sous-classes situées dans le même package.
- **Sous-classe (pkg diff)** : Visibilité dans les sous-classes situées dans des packages différents.
- **Monde** : Visibilité partout, dans n'importe quelle classe en dehors du package.

**Détails supplémentaires :**
- `public` : Accessible depuis n'importe quelle autre classe.
- `protected` : Accessible au sein du même package et dans les sous-classes.
- `sans modificateur` (par défaut, privé au package) : Accessible uniquement au sein du même package.
- `private` : Accessible uniquement à l'intérieur de la classe où il est déclaré.
