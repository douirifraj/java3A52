import java.util.*;

public class DepartementHashSet implements IDepartement<Departement> {

    private HashSet<Departement> departements;

    public DepartementHashSet() {
        departements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement t) {
        if (departements.add(t)) {
            System.out.println("Département ajouté avec succès : " + t);
        } else {
            System.out.println("Erreur : Département déjà existant !");
        }
    }

    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        for (Departement d : departements) {
            if (d.getNomDepartement().equalsIgnoreCase(nomDepartement))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement t) {
        return departements.contains(t);
    }

    @Override
    public void supprimerDepartement(Departement t) {
        if (departements.remove(t)) {
            System.out.println("Département supprimé : " + t);
        } else {
            System.out.println("Département introuvable !");
        }
    }

    @Override
    public void afficherDepartements() {
        System.out.println("Liste des départements :");
        for (Departement d : departements)
            System.out.println(d);
    }

    @Override
    public void trierDepartementsParId() {
        System.out.println(" Tri par ID :");
        departements.stream()
                .sorted(Comparator.comparingInt(Departement::getId))
                .forEach(System.out::println);
    }

    @Override
    public void trierDepartementsParNomEtNombreEmployes() {
        System.out.println(" Tri par nom + nombre employés :");
        departements.stream()
                .sorted(Comparator
                        .comparing(Departement::getNomDepartement)
                        .thenComparing(Departement::getNombreEmployes))
                .forEach(System.out::println);
    }
}
