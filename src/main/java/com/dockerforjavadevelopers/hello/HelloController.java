package com.dockerforjavadevelopers.hello;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {

        String html =
            "<h1 style='color: green;'>Devoir Springboot MQL M2</h1>" +
            "<h2>Année : 2021/2022</h2>" +
            "<h3>Nom/Prénom : Kahlaoui anouar</h3><br><br>\n";

        String htmlEx =
        "<h2>Exercice à faire</h2>" +
        "<h3>Choisissez un programme springboot de votre choix</h3>" +
        "<ul><li>1. Construisez une image docker pour votre programme springboot.</li>" +
        "<li>2. Supposons que vous voulez connecter votre programme à une base de données de votre choix :</li>" +
        "<p>• Utilisez docker compose pour lancer le service de votre base de données et pour lancer votre application.</p>" +
        "<li>3. Construisez une pipeline CI/CD sur Jenkins ou bien GitLab (selon votre choix) permettant de réaliser les étapes suivantes :</li>" +
        "<p>(Il faut mettre votre Code sur GitHub /GitLab.)</p><br>" +
        "(a) Si vous êtes sur Jenkins: pour lancer la pileline concernant votre code, Commencez par connecter votre dépôt sur Github à Jenkins.<br>" +
        "(b) Faire le build et packager votre application sous format .jar (avec maven ou tout autre outils de build).<br>" +
        "(c) La construction de l’image docker de votre programme et son envoie sur DockerHub\n";

        return "<div style='text-align: center;'>" + html + htmlEx + "</div>";
    }
}
