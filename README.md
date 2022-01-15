# Projet-Devops-Ruiz-Louka

## But du projet

Le but de ce projet est de réaliser une infrastructure de staging pour une
application java .

- Clonez le repository git
   ```sh
   git clone https://github.com/Ruizlouka/Projet-Devops-Ruiz-Louka.git
   ```
   
   ## Docker

Dans chaque dossier il y a les éléments docker permetant d'installer et de lancer un des services qui sont jenkins terraform et ansible

- Pour créer et lancer le service docker 
   ```sh
  docker-compose up --build
  docker run
   ```
   Chaque docker permet de creer le service dédier à partir des fichier qu'on est passer
   
   
   ## Jenkins
   Dans chaque dossier on y trouve le dossier jenkins qui permet de teset et de compiler une application
   Pour chaque pipeline il faut ajouter les clés ssh privé et public qui sont générer
   
   Pour lancer une pipeline 
      ```sh
 ssh-keygen -f .:ssh/id-rsa
   ```
   Pour teeraform and ansible:
   il faut ensuite lancer
   docke
     ```sh
docker-compoose up -build
   ```
   
   Pour y accèder à partir de jenkins il faut les identifiants qui sont admin admin
   
    
   
   

