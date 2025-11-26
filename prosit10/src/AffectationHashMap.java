import java.util.*;

public class AffectationHashMap {


    private HashMap<Employe, Departement> affectations;

    public AffectationHashMap() {
        affectations = new HashMap<>();
    }


    public void ajouterEmployeDepartement(Employe e, Departement d) {
        Departement ancien = affectations.put(e, d);
        if (ancien != null) {
            System.out.println("Réaffectation : " + e.getNom() + " " + e.getPrenom() +
                    " était à " + ancien.getNomDepartement() +
                    " → maintenant à " + d.getNomDepartement());
        } else {
            System.out.println("Affectation réussie : " + e.getNom() + " " + e.getPrenom() +
                    " → " + d.getNomDepartement());
        }
    }


    public void afficherEmployesEtDepartements() {
        if (affectations.isEmpty()) {
            System.out.println("Aucune affectation enregistrée.");
            return;
        }
        System.out.println("\n=== Affectations Employé → Département ===");
        for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue().getNomDepartement());
        }
        System.out.println();
    }


    public void supprimerEmploye(Employe e) {
        Departement d = affectations.remove(e);
        if (d != null) {
            System.out.println("Employé supprimé avec succès : " + e.getNom() + " " + e.getPrenom());
        } else {
            System.out.println("Employé non trouvé : " + e.getNom() + " " + e.getPrenom());
        }
    }


    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        Departement actuel = affectations.get(e);
        if (actuel != null && actuel.equals(d)) {
            affectations.remove(e);
            System.out.println("Affectation supprimée : " + e.getNom() + " retiré de " + d.getNomDepartement());
        } else {
            System.out.println("Aucune affectation correspondante trouvée pour " + e.getNom());
        }
    }


    public void afficherEmployes() {
        if (affectations.isEmpty()) {
            System.out.println("Aucun employé affecté.");
            return;
        }
        System.out.println("=== Liste des employés ===");
        for (Employe e : affectations.keySet()) {
            System.out.println(e);
        }
        System.out.println();
    }


    public void afficherDepartements() {
        if (affectations.isEmpty()) {
            System.out.println("Aucun département.");
            return;
        }
        System.out.println("=== Départements présents (sans doublons) ===");
        Set<Departement> departsUniques = new HashSet<>(affectations.values());
        for (Departement d : departsUniques) {
            System.out.println(d.getNomDepartement() + " (ID: " + d.getId() + ")");
        }
        System.out.println();
    }


    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }


    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }


    public TreeMap<Employe, Departement> trierMap() {
        TreeMap<Employe, Departement> treeMap = new TreeMap<>(
                (e1, e2) -> Integer.compare(e1.getId(), e2.getId())
        );
        treeMap.putAll(affectations);
        return treeMap;
    }
}