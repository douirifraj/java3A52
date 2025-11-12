public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(1, "Ali", "Ben", "IT", 3);
        Employe e2 = new Employe(2, "Sara", "Amor", "RH", 2);
        Employe e3 = new Employe(3, "Hatem", "Salah", "IT", 1);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        societe.displayEmploye();

        societe.rechercherEmploye("Sara");

        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        societe.supprimerEmploye(e2);
        societe.displayEmploye();
    }
}
