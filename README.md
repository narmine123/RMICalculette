# RMICalculette
Objectif de l’exercice : L'exercice consiste à réaliser un code pour un client et un code  pour un Serveur en utilisant la technologie RMI permettant d'effectuer une calculette RMI, telque le client se connecte au serveur pour récupérer l'objet RMI de calcul puis il demande à l'utilisateur de saisir le code de l'opération et les opérandes et  selon ce code il va invoquer la méthode appropriée dans l'objet RMI du serveur et récupère le résultat.
Ensuite,il va demander à l'utilisateur s'il veut arrêter l'exécution. Si c'est pas le cas, on reprend à l'étape 1.

## Côté serveur RMI:
1. Création d'une instance du serveur de calculatrice.
2. Enregistrement du serveur dans le registry RMI sous le nom "Calculatrice"

3. Affichage d'un message de confirmation du démarrage du serveur.
4. Gestion des exceptions : Capture de toute exception survenue lors du démarrage du serveur et affichage de celle-ci.

## Côté Client RMI:
1. Création d'un scanner pour la saisie utilisateur.
2. Recherche de l'objet distant "CalculatriceRmi".
3. Demande de l'opération à l'utilisateur.
4. Demande du premier nombre à l'utilisateur.
5. Demande du deuxième nombre à l'utilisateur.
6. Affichage du résultat.
7. Demande pour quitter le programme.
8. Gestion des exceptions :  Capture et affichage des exceptions.

