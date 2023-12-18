**TP1**

Écrire une méthode qui calcule l'aire d'un cercle basée sur son rayon.

**Description** :
- Créez une méthode `calculateCircleArea(double radius)` qui prend le rayon d'un cercle et retourne son aire.
- L'aire d'un cercle est calculée par la formule `π * rayon * rayon`. Vous pouvez utiliser `Math.PI` pour la valeur de π.
- Depuis la méthode `main`, demandez à l'utilisateur de saisir le rayon d'un cercle, puis appelez `calculateCircleArea` avec cette valeur et affichez le résultat.
- Assurez-vous de gérer les entrées utilisateur incorrectes, comme les valeurs négatives pour le rayon.


**TP2**

Écrire une méthode qui convertit la température de Celsius en Fahrenheit et une autre qui convertit de Fahrenheit en Celsius.

**Description** :
- Créez une méthode `celsiusToFahrenheit(double celsius)` qui prend une température en Celsius et la convertit en Fahrenheit.
- Créez une méthode `fahrenheitToCelsius(double fahrenheit)` qui prend une température en Fahrenheit et la convertit en Celsius.
- Les formules de conversion sont les suivantes :
    - Celsius en Fahrenheit : `(celsius * 9/5) + 32`
    - Fahrenheit en Celsius : `(fahrenheit - 32) * 5/9`
- Testez vos méthodes en les appelant depuis la méthode `main` avec différentes valeurs.

**TP3**

Écrire un programme Java qui permet à l’utilisateur de déclarer 3 tableaux d’entiers.

Ces tableaux ne doivent pas forcément avoir la même taille


**Description** :
Le programme doit ensuite fournir afficher les 3 tableaux en format [element1, element2,...,élémentS] et la somme de tous les éléments multiples 3 dans les 3 tableaux.

Exemple d’exécution :
```
T1 : [ 2, 6, 8, 15,39,11 ]
T2 : [ 21, 33, 12, 19,0 ]
T3 : [ 17, 18, 46 ]

S = 6+15+39+21+33+12+18 = 144
```


**TP4**

Écrire un programme Java demande à l’utilisateur de saisir  liste de langages de programmations à partir du clavier.

**Description** :
- Une fois le tableau rempli, l’utilisateur sera appelé à saisir les noms des langages qu’il souhaite retirer de liste.

- Le programme devra ensuite retirer ces langages et afficher l’état du tableau avant et après la suppression.