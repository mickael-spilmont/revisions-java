<link href="style.css" rel="stylesheet"></link>

# Révisions Java
### Polymorphisme :
Le polymorphisme est la capacité d'un objet à prendre plusieurs formes. Le cas le plus courant de polymorphisme en POO 
est quand on utilise la classe parent d'un objet pour faire référence à ce dernier. 

N'importe quel objet Java qui passe plus d'un test "is instance of" est considéré comme polymorphe. En Java tout les objets 
sont polymorphe, car ils passent tous le test "is instance of" pour leur propre type et pour le type Object.

Exemple :

```java
public interface Vegetarian{}
public class Animal{}
public class Deer extends Animal implements Vegetarian{}
```

* Deer est Animal
* A Deer est Vegetarian
* A Deer est Deer
* A Deer est Object

*Sources : [TutorialPoint](https://www.tutorialspoint.com/java/java_polymorphism.htm)*


### Classe abstraite et interface

**Une classe abstraite** est une classe dont toutes les méthodes n’ont pas été implé­men­tées. Elle n’est donc pas 
instanciable, mais sert avant tout à factoriser du code. Une classe qui hérite d’une classe abstraite doit obligatoirement 
implémenter les méthodes manquantes (qui ont été elles mêmes déclarées « abstraites » dans la classe parente).

**Une interface** est un peu comme une classe abstraite dans laquelle aucune méthode ne serait implémentée : les méthodes 
y sont seulement déclarées. Cela permet de définir un ensemble de services visibles depuis l’extérieur (l’API : Application 
Programming Interface), sans se préoccuper de la façon dont ces services seront réellement implémentés. Une classe qui 
implémente une interface doit obligatoirement implémenter chacune des méthodes déclarées dans l’interface, à  moins qu’elle 
ne soit elle même déclarée… abstraite !</br>
À noter que depuis Java 1.8 les interfaces peuvent contenir des méthodes statiques ainsi que des méthodes par défaut.

**Classes abtraites et interfaces** ont chacune une fonction bien distincte : les classes abstraites servent à factoriser 
du code, tandis que les interfaces servent à défi­nir des contrats de service.
Enfin n'est possible d'hériter que d'une classe abstraite alors que l'on peut implémenter plusieurs interfaces.

*Sources : [Blog clever age](https://blog.clever-age.com/fr/2006/03/23/quelle-difference-entre-une-classe-abstraite-et-une-interface/)*
