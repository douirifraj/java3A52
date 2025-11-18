public class Main {
    public static void main(String[] args) {

        DepartementHashSet gestion = new DepartementHashSet();

        // Création d'objets Departement
        Departement d1 = new Departement(1, "Informatique", 25);
        Departement d2 = new Departement(2, "Ressources Humaines", 10);
        Departement d3 = new Departement(3, "Marketing", 18);
        Departement d4 = new Departement(1, "Informatique", 25);
        gestion.ajouterDepartement(d1);
        gestion.ajouterDepartement(d2);
        gestion.ajouterDepartement(d3);
        gestion.ajouterDepartement(d4);
        gestion.afficherDepartements();
        System.out.println("Recherche Informatique : " + gestion.rechercherDepartement("Informatique"));
        System.out.println("Recherche Finance : " + gestion.rechercherDepartement("Finance"));
        System.out.println("Recherche d1 : " + gestion.rechercherDepartement(d1));
        System.out.println("Recherche d4 (même que d1) : " + gestion.rechercherDepartement(d4));
        gestion.supprimerDepartement(d2);
        gestion.afficherDepartements();
        gestion.trierDepartementsParId();
        gestion.trierDepartementsParNomEtNombreEmployes();
    }
}
