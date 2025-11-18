public class Departement {
    private int id;
    private String nomDepartement;
    private int nombreEmployes;


    public Departement() {
    }


    public Departement(int id, String nomDepartement, int nombreEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nombreEmployes = nombreEmployes;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof Departement)) return false;

        Departement d = (Departement) obj;

        return this.id == d.id && this.nomDepartement.equalsIgnoreCase(d.nomDepartement);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nomDepartement + '\'' +
                ", nombreEmployes=" + nombreEmployes +
                '}';
    }

    @Override
    public int hashCode() {
        return id + nomDepartement.hashCode();
    }
}
