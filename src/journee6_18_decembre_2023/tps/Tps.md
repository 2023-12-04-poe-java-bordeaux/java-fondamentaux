### TP1 : Conception d'un Système de Gestion de Comptes Bancaires POEC JAVA

#### Objectif

Concevoir et implémenter un système en Java pour la gestion de différents types de comptes bancaires. Ce travail doit mettre en avant les compétences en programmation orientée objet, notamment l'héritage et les interfaces.

#### Problématique

Dans le secteur bancaire, il existe divers types de comptes avec des caractéristiques et des fonctionnalités distinctes. Votre tâche est de construire un système qui peut gérer au moins deux types de comptes bancaires : les comptes d'épargne et les comptes courants. Chaque type de compte a ses propres règles et comportements spécifiques en termes de gestion du solde, d'application d'intérêts, et de limites de découvert.

#### Consignes pour la Réflexion et la Conception

1. **Analyse des Besoins**

    - Déterminez les attributs communs et distincts des différents types de comptes bancaires.
    - Identifiez les opérations communes à tous les comptes bancaires.

2. **Conception de la Classe de Base**

    - Réfléchissez à la manière de structurer une classe de base `CompteBancaire` qui encapsule les propriétés et comportements communs à tous les types de comptes.

3. **Développement des Classes Dérivées**

    - Concevez des sous-classes pour les comptes d'épargne et les comptes courants. Pensez aux spécificités de chaque type de compte, notamment en ce qui concerne le calcul des intérêts et la gestion des découverts.

4. **Implémentation de l'Interface**

    - Réfléchissez à l'utilité d'une interface `Transactions` pour définir des opérations bancaires standard comme le dépôt et le retrait. Comment cette interface pourrait-elle être implémentée par les différentes classes de compte ?

5. **Discussion et Collaboration**
    - Travaillez en groupe pour discuter des différentes approches de conception. Chaque groupe doit justifier ses choix de conception et expliquer comment ils répondent aux exigences du système.

#### Livrables

- Diagrammes UML montrant la structure des classes et leurs relations.
- Code source en Java implémentant le système conçu.
- Un document explicatif décrivant votre approche, les décisions de conception prises, et les raisons de ces choix.

Pour cette POEC, ce dernier TP vise non seulement à développer les compétences techniques en Java, mais aussi à encourager la réflexion critique, la planification, et le travail d'équipe dans la conception de systèmes logiciels. Vous allez devoir collaborer pour créer une solution efficace et bien structurée répondant aux exigences du scénario bancaire proposé.

Intérêt (dans le contexte d'un Compte d'Épargne)
Qu'est-ce que c'est ? : L'intérêt est le montant payé par la banque au titulaire du compte pour l'argent déposé. Il s'agit essentiellement d'une récompense pour avoir laissé son argent dans la banque.
Comment ça fonctionne ? : Le taux d'intérêt est généralement un pourcentage annuel appliqué au solde du compte. Par exemple, si vous avez 1 000 € dans un compte d'épargne avec un taux d'intérêt de 2 % par an, vous gagnerez 20 € d'intérêt après un an.
Découvert (dans le contexte d'un Compte Courant)
Qu'est-ce que c'est ? : Un découvert est une facilité accordée par la banque qui permet au titulaire du compte de retirer plus d'argent qu'il n'en possède réellement dans le compte, jusqu'à une limite spécifiée.
Comment ça fonctionne ? : Par exemple, si votre compte courant a un découvert autorisé de 500 €, cela signifie que vous pouvez avoir un solde négatif allant jusqu'à -500 €. Cela peut être utile pour couvrir des dépenses temporaires, mais les découverts sont généralement accompagnés de frais ou d'intérêts sur le montant dépassé.

### TP 0

Vous devez faire quelques recherches sur le langage Java, avec un focus sur les points suivant:
Particularités du langage

- JVM
- Bytecode
- Que veut dire “Write one, runs everywhere”

### TP 2

**Objectif :** Écrire un programme Java qui déclare un tableau d’entiers et affiche le plus grand nombre avec sa position, ainsi que le plus petit nombre avec sa position.

**Affichage :**

- Le tableau doit être affiché au format `[element1, element2,...,elementN]`.
- Pour le plus grand nombre, ajouter `(PG)` à côté, et pour le plus petit `(PP)`.

**Exemple :**

```
Tb : [ 12, 3, 5, 6, -3 ]

Résultat:
Tb : [12(PG), 3, 5, 6, -3(PP)]
Plus grand : 12
Plus petit : -3
```

---

### TP 3

**Objectif :** Écrire un programme Java qui convertit en majuscules la première lettre de chaque mot dans une chaîne saisie par l'utilisateur.

**Exemple :**

```
Input : “je suis dans la joie”
Résultat : Je Suis Dans La Joie
```

---

### TP 4

**Objectif :** Écrire une méthode Java qui prend en paramètre un tableau 2D et un nombre, et retourne le nombre de fois que ce nombre apparaît dans le tableau ainsi que ses positions.

**Exemple :**

```
maMethode({
  {1, 4, 2, 1},
  {6, 3, 8, 9},
  {1, 5, 1, 0}
}, 1)

> 1 se retrouve 4 fois dans les emplacements suivants : (0,0), (0,3), (2,0), (2,2)
```

---

### TP 5

**Objectif :** Écrire une méthode Java qui prend en paramètre un tableau de caractères et retourne un nouveau tableau avec une alternance entre les lettres en majuscules et minuscules.

**Exemple :**

```
maMethode(['a', 'b', 'c', 'd', 'e'])
> ['a', 'B', 'c', 'D', 'e']
```

---

### TP 6

**Objectif :** Écrire une méthode qui prend en entrée un tableau et la taille du morceau, et divise le tableau en plusieurs sous-tableaux.

**Exigences :**

- Chaque sous-tableau doit avoir une longueur égale à la taille du morceau spécifiée.

**Exemples :**

```
maMethode([1, 2, 3, 4], 2) --> [ [ 1, 2], [3, 4] ]
maMethode([1, 2, 3, 4, 5], 2) --> [[ 1, 2], [3, 4], [5] ]
maMethode([1, 2, 3, 4, 5, 6, 7, 8], 3) --> [ [ 1, 2, 3], [4, 5, 6], [7, 8] ]
maMethode([1, 2, 3, 4, 5], 4) --> [ [ 1, 2, 3, 4], [5] ]
maMethode([1, 2, 3, 4, 5], 10) --> [ [ 1, 2, 3, 4, 5] ]
```

---

### TP 7

**Objectif :** Écrire une méthode qui prend en entrée un tableau de chaînes représentant des directions (haut, bas, gauche, droite) et retourne la position finale sous forme d'un tableau de deux entiers.

**Exigences :**

- Doit retourner un tableau de deux entiers.

**Exemple :**

```
maMethode(["haut", "haut", "bas", "gauche", "gauche", "droite", "haut"])
> [-1, 2]
```

---

### TP 8

**Objectif :** Écrire une méthode qui vérifie si une chaîne de caractères contient deux caractères identiques consécutifs.

**Exigences :**

- Doit retourner `true` ou `false`.
- Doit fonctionner avec les caractères spéciaux.

**Exemples :**

```
maMethode("terrific")
> true

maMethode("chats")
> false

maMethode("chats !!")
> true
```

---
