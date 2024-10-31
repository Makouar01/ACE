# ACE
## Démo Vidéo des Tests JSON et XML

[Regarder la démo vidéo des tests JSON et XML](https://drive.google.com/file/d/1b-L0HD1jsnETqtLfaSiLSSd275CW5WRH/view?usp=sharing)

## Ci-dessous l'Architecture du Projet
com.example
├── config
│   └── MyConfig.java              // Classe de configuration de l'application
│
├── controller
│   └── CompteRestJaxRSAPI.java    // Contrôleur REST exposant les API pour les comptes
│
├── entity
│   └── Compte.java                // Classe représentant l'entité Compte
│
├── enums
│   └── TypeCompte.java            // Enumération pour les types de comptes
│
├── repository
│   └── CompteRepository.java       // Interface de repository pour l'entité Compte
│
└── AceApplication.java            // Classe principale pour démarrer l'application Spring Boot
resources
├── static                         // Répertoire pour les fichiers statiques (CSS, JavaScript, etc.)
├── templates                      // Répertoire pour les templates HTML
└── application.properties         // Fichier de configuration de l'application




