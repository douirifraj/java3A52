import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class SocieteArrayList implements IGestion<Employe> {

    private ArrayList<Employe> listeEmployes;


    public SocieteArrayList() {
        listeEmployes = new ArrayList<>();
    }


    @Override
    public void ajouterEmploye(Employe e) {
        listeEmployes.add(e);

    }


    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : listeEmployes) {
            if (e.getNom().equalsIgnoreCase(nom)) {
                System.out.println(" Employé trouvé : " + e);
                return true;
            }
        }
        System.out.println(" Aucun employé trouvé avec le nom : " + nom);
        return false;
    }


    @Override
    public boolean rechercherEmploye(Employe e) {
        boolean trouve = listeEmployes.contains(e);
        if (trouve)
            System.out.println(" Employé trouvé : " + e);
        else
            System.out.println(" Employé non trouvé !");
        return trouve;
    }


    @Override
    public void supprimerEmploye(Employe e) {
        if (listeEmployes.remove(e))
            System.out.println(" Employé supprimé : " + e);
        else
            System.out.println(" Employé introuvable !");
    }


    @Override
    public void displayEmploye() {
        System.out.println("\n Liste des employés :");
        for (Employe e : listeEmployes)
            System.out.println(e);
    }


    @Override
    public void trierEmployeParId() {
        Collections.sort(listeEmployes);
        System.out.println("📊 Employés triés par ID !");
    }


    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(listeEmployes, new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                int depCompare = e1.getNomDepartement().compareToIgnoreCase(e2.getNomDepartement());
                if (depCompare != 0)
                    return depCompare;
                return Integer.compare(e1.getGrade(), e2.getGrade());
            }
        });
        System.out.println(" Employés triés par département et grade !");
    }
}
