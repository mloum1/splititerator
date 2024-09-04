# splititerator
Test interface splititerator


## Analyse de fichiers de Logs

Développer une fonctionnalité qui doit analyser de grands fichier de logs(les logs d'un serveur web) pour extraire des informations spécifiques, comme les adresses IP des utilisateurs qui ont accédé à une certaine ressource.

## solution :
Implémente un programme Java qui lit un grand fichier de logs.
Utilise un Spliterator pour diviser la liste des lignes du fichier en sous-parties, et traite-les en parallèle pour extraire les adresses IP.
Compte le nombre d'occurrences de chaque adresse IP.
