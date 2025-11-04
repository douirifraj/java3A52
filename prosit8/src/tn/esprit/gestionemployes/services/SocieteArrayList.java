package tn.esprit.gestionemployes.services;

import tn.esprit.gestionemployes.entities.Employe;
import tn.esprit.gestionemployes.interfaces.IGestion;
import tn.esprit.gestionemployes.interfaces.IRechercheAvancee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe> {

    private List<Employe> employes = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe employe) {
        if (!rechercherEmploye(employe)) {
            employes.add(employe);
            System.out.println("Employé ajouté : " + employe.getNom());
        } else {
            System.out.println("Employé existe déjà (ID: " + employe.getId() + ")");
        }
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        return employes.stream().anyMatch(e -> e.getNom().equalsIgnoreCase(nom));
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        if (employes.remove(employe)) {
            System.out.println("Employé supprimé : " + employe.getNom());
        } else {
            System.out.println("Employé non trouvé : " + employe.getNom());
        }
    }

    @Override
    public void displayEmploye() {
        if (employes.isEmpty()) {
            System.out.println("Aucun employé dans la société.");
        } else {
            employes.forEach(System.out::println);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
        System.out.println("\nTri par ID (Comparable) :");
        displayEmploye();
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Comparator<Employe> comparator = Comparator
                .comparing(Employe::getNomDepartement)
                .thenComparingInt(Employe::getGrade)
                .thenComparing(Employe::getNom);

        Collections.sort(employes, comparator);
        System.out.println("\nTri par Département → Grade → Nom (Comparator) :");
        displayEmploye();
    }

    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        return employes.stream()
                .filter(e -> e.getNomDepartement().equalsIgnoreCase(nomDepartement))
                .collect(Collectors.toList());
    }
}