package tn.esprit.gestionemployes.main;

import tn.esprit.gestionemployes.entities.Employe;
import tn.esprit.gestionemployes.services.SocieteArrayList;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();


        societe.ajouterEmploye(new Employe(3, "Ben Ali", "Mohamed", "IT", 2));
        societe.ajouterEmploye(new Employe(1, "Jarraya", "Ahmed", "RH", 3));
        societe.ajouterEmploye(new Employe(5, "Trabelsi", "Sami", "IT", 1));
        societe.ajouterEmploye(new Employe(2, "Guesmi", "Fatma", "Finance", 2));
        societe.ajouterEmploye(new Employe(4, "Khelifi", "Nour", "IT", 3));

        System.out.println("\n=== Liste complète ===");
        societe.displayEmploye();


        System.out.println("\nRecherche par nom 'Ahmed' : " + societe.rechercherEmploye("Ahmed"));
        System.out.println("Recherche par nom 'Inconnu' : " + societe.rechercherEmploye("Inconnu"));
        Employe e = new Employe(3, "Ben Ali", "Mohamed", "IT", 2);
        societe.supprimerEmploye(e);
        System.out.println("\n=== Après suppression ===");
        societe.displayEmploye();
        societe.trierEmployeParId();
        societe.trierEmployeParNomDepartementEtGrade();
        System.out.println("\n=== Employés du département IT ===");
        societe.rechercherParDepartement("IT").forEach(System.out::println);
    }
}