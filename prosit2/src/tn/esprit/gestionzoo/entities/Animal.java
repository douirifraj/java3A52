package tn.esprit.gestionzoo.entities;
public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;


    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name ;
        setAge(age);
        this.isMammal = isMammal;
    }


    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }


    public String getName() {
        return name;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Erreur : l’âge ne peut pas être négatif !");
            this.age = 0; // valeur par défaut
        } else {
            this.age = age;
        }
    }

    // Getter & Setter pour isMammal
    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    @Override
    public String toString() {
        return "Animal [family=" + family +
                ", name=" + name +
                ", age=" + age +
                ", isMammal=" + isMammal + "]";
    }
}
