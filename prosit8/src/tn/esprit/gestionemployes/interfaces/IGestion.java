package tn.esprit.gestionemployes.interfaces;

import java.util.Comparator;

public interface IGestion<T> {
    void ajouterEmploye(T t);
    boolean rechercherEmploye(String nom);
    boolean rechercherEmploye(T t);
    void supprimerEmploye(T t);
    void displayEmploye();
    void trierEmployeParId(); // Comparable
    void trierEmployeParNomDepartementEtGrade(); // Comparator
}