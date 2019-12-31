TP Spring :https://github.com/lilian-vallee/TP-Spring.git

Partie 1:
  Etape 5:

      Web : The spring-web dependency contains common web specific utilities for both Servlet and Portlet environments
      JPA : Spring Data module for JPA repositories.
      H2 & Hibernate : H2 database A very fast and open source Java SQL database based on the JDBC API
      DevTools : The aim of this module is to try and improve the development-time experience when working on Spring Boot applications.
      Thymeleaf : Starter for building MVC web applications using Thymeleaf views

  Etape 13:
  
      1.  Avec quelle partie du code avons-nous param ́etr ́e l’url d’appel /greeting ?
              @RequestParam(name="nameGET", required=false, defaultValue="World")

      2.  Avec quelle partie du code avons-nous choisi le fichier HTML `a afficher ?
              @GetMapping("/greeting")

      3.  Comment envoyons-nous le nom `a qui nous disons bonjour avec le second lien ?
               model.addAttribute("nomTemplate", nameGET);

  Etape 17:

      Avez vous remarquez une différence?

      Il y a une table de créer avec les atributs deéclarés dans la classe Address.

  Etape 18:

      Hibernate creer des table a partir d'objet.
      le processus est active avec les annotations:
      @Entity : la classe est la table
      @Id : a lair de dire que la prochaine variable est une clé (int unique)
      @GeneratedValue : la prochaine variable est généré automatiquement

      apres c'est de la creation d'objet classic:
      attribut et GET/SET

  Etape 20:

      ID  	CONTENT  	CREATION
      1	57  boulevard  demorieux 	2019-12-02 09:45:28.662657
      2	51 allee  du gamay , 34080 montpellier 	2019-12-02 09:45:28.709528

  Etape 23:

      l'annotation @AutoWired permet l'injection et resolution de dependence

  Etape 30:

      J'ai ajouté la dependence "WebJar for Bootstrap"

Partie 2:
  Etape 5:

      il faut une clé pour appeler l'API.
      Elle est obtenue par la création d'un compte sur le site de cette dernière
      Ou en la piquant a un copain ^^ (j'ai créé un compte).

      l'adresse à appeller est :
      https://api.darksky.net/forecast/[key]/[latitude],[longitude]
      afin de recupérer seulement les infos actuelles et celle de demain j'ai ajouté : ?exclude=minutely,hourly
      J'ai aussi ajouté : ?exclude=minutely,hourly?units=si  , pour que les unité soit en si
      (spoiler ça n'a pas marché)

      pour passer les paramètres d'appels j'ai concatènné les variables au liens

      Reponse>currently>temperature
      Reponse>currently>humidity
