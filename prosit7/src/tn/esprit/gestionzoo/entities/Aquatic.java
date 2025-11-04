package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal{
    protected String habitat;
    public Aquatic(String family, String name, int age, boolean isMammal,String habitat) {
        super(family,name,age,isMammal);
        this.habitat=habitat;

    }
    public void swim (){
        System.out.println("this aquatic animal is swimming");
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat=" + habitat;
    }
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;


        if (obj == null || getClass() != obj.getClass()) return false;


        Aquatic other = (Aquatic) obj;


        return this.getName().equals(other.getName())
                && this.getAge() == other.getAge()
                && this.habitat.equals(other.habitat);
    }

}
