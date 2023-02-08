# java_poo
premiers exos avec java_poo

@since Mardi 7 Février 2023-Vendredi 10 Février 2023.

Exercice 1 : PooEx1Object [Ne passez pas à l’exo suivant avant d’avoir fini le précédent].

• Exercice 1.1 : Ajouter une première classe City censée représenter une ville avec pour
attributs nom de la ville, pays, nombre d’habitants, définir au moins 1 constructeur. Puis
ajouter une classe pour tester (TestCity) avec un main pour instancier plusieurs villes comme
par ex : City toulouse = new City("Toulouse","France",450000); répétez donc
l'instanciation de votre classe avec plusieurs villes puis afficher les attributs de chaque ville
dans la suite de votre programme principale. Changer l’attribut nbInhabitants de l’objet
toulouse en lui ajoutant 20000 habitants puis afficher toulouse à nouveau pour vérifier que
les modifications ont bien été prises en compte.

• Exercice 1.2 : Toujours dans votre classe City, mettez en place vos accesseurs (getter et
setter) et afficher à nouveau vos villes cette fois ci via les accesseurs. A priori, l'utilisateur ne
peut plus changer les attributs d’une ville sans votre approbation, dorénavant :
toulouse.nbInhabitants = -200 est impossible, cependant, il peut changer l’attribut via
l’accesseur aussi veiller à trouver une solution ici. Tester cette fonctionnalité à la suite de
votre programme principale (mettez entre commentaire les travaux précédents). Ajouter
cette protection dans votre constructeur. Prenez la peine d’afficher des messages à
l’utilisateur qui doit comprendre son erreur. Enfin, que faire si l’utilisateur veut réduire la
population passant par ex la ville de Toulouse de 470000 à 370000 ?

• Exercice 1.3 : Ajouter un nouveau constructeur qui accepte 2 paramètres le nom de la ville
et le nombre d’habitants puis tester le en affichant les 3 attributs. Ensuite, modifier l’attribut
inconnu en passant par les accesseurs, afficher la ville à nouveau, soigner l’affichage pour
obtenir ce résultat.

FMS-EA © El Babili - Tous droits réservés 1
Exercice 1 : PooEx1Object [Ne passez pas à l’exo suivant avant d’avoir fini le précédent]
• Exercice 1.1 : Ajouter une première classe City censée représenter une ville avec pour
attributs nom de la ville, pays, nombre d’habitants, définir au moins 1 constructeur. Puis
ajouter une classe pour tester (TestCity) avec un main pour instancier plusieurs villes comme
par ex : City toulouse = new City("Toulouse","France",450000); répétez donc
l'instanciation de votre classe avec plusieurs villes puis afficher les attributs de chaque ville
dans la suite de votre programme principale. Changer l’attribut nbInhabitants de l’objet
toulouse en lui ajoutant 20000 habitants puis afficher toulouse à nouveau pour vérifier que
les modifications ont bien été prises en compte.
• Exercice 1.2 : Toujours dans votre classe City, mettez en place vos accesseurs (getter et
setter) et afficher à nouveau vos villes cette fois ci via les accesseurs. A priori, l'utilisateur ne
peut plus changer les attributs d’une ville sans votre approbation, dorénavant :
toulouse.nbInhabitants = -200 est impossible, cependant, il peut changer l’attribut via
l’accesseur aussi veiller à trouver une solution ici. Tester cette fonctionnalité à la suite de
votre programme principale (mettez entre commentaire les travaux précédents). Ajouter
cette protection dans votre constructeur. Prenez la peine d’afficher des messages à
l’utilisateur qui doit comprendre son erreur. Enfin, que faire si l’utilisateur veut réduire la
population passant par ex la ville de Toulouse de 470000 à 370000 ?
• Exercice 1.3 : Ajouter un nouveau constructeur qui accepte 2 paramètres le nom de la ville
et le nombre d’habitants puis tester le en affichant les 3 attributs. Ensuite, modifier l’attribut
inconnu en passant par les accesseurs, afficher la ville à nouveau, soigner l’affichage pour obtenir ce résultat.

• Exercice 1.4 : crée une méthode pour afficher les attributs d'une ville tel que
toulouse.display(); aura pour résultat : « ville de Toulouse en France ayant 450000 »

• Exercice 1.5 : que se passe t-il ici ? System.out.println(toulouse); Pourquoi ?

• Exercice 1.6 : Ajouter une méthode toString() qui renvoi une chaîne de caractère constituée
des attributs d’un objet ville, afin d’obtenir le résultat suivant, par l’appel implicite de la
méthode toString de l’objet toulouse :
System.out.println(toulouse); : « ville de Toulouse en France ayant 450000 habitants »

• Exercice 1.7 : Trouver un moyen de compter le nombre d'instance de votre classe City, c’est
à dire le nombre d’objets/villes instanciés dans votre programme.
City paris = new City("Paris","France",2000000);
City nice = new City("Nice", "France", 340000);

• Exercice 1.8 : Crée la classe Person avec pour attributs nom, prénom, âge, adresse. Puis
tester la dans une classe TestPerson en créant plusieurs instances puis afficher les afin
d’obtenir le résultat suivant.

• Exercice 1.9 : Ajouter à votre classe Person un attribut « Ville de Naissance » qui est un
objet de type City de sorte d’obtenir ce qui suit.

• Exercice 2.0 : Voici une liste de personnalité dont nous souhaitons extraire toutes les
personnes nées en France ou habitant Paris.
Notez au passage que la population d’une ville n’est affichée que si elle a été remplie aussi apportez
les modifications nécessaires pour arriver au résultat suivant.
