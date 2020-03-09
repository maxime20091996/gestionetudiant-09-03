Installer TomcatServer 9.0

Utilisation de Java v.8.x

Creer une base MySql nommé ensup

Recupération du WAR

Au niveau du disque C, ouvrir un invité de commande et saisir :

mkdir C:\Ensup

cd C:\Ensup

mvn scm:checkout -DconnectionUrl=scm:git:https://github.com/maxime20091996/gestionetudiant-09-03

Aller dans target\checkout\Ensup

Saisir mvn install

Récupérer dans le dossier target le WAR généré

Deplacer le fichier Ensup.war dans le dossier webapps de Tomcat

Executer startup.bat situé dans le dossier bin de tomcat

Dans l'url du navigateur, entrer le lien suivant : http://localhost:8080/Ensup
