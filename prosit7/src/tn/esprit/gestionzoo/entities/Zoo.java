package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.exceptions.ZooFullException;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
public class Zoo {
    static final int cage =25;
    private Animal[] animals =new Animal[cage];
    private String name ;
    private String city ;
    private final int nbrCages ;
    private int countAnimal=0;
    public int countanimalaqua=0;
    private Aquatic[]  aquaticAnimals =new Aquatic[10];
   public Zoo(String name,String city,int nbrCages){
        setName(name);
        this.city=city;
        this.nbrCages = Math.min(nbrCages, cage);
        this.animals = new Animal[this.nbrCages];

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("le nom du Zoo ne doit pas être vide !");

        } else {
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public int getCountAnimal() {
        return countAnimal;
    }
    public int getCountanimalaqua() {return countanimalaqua;}

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    void displayZoo(){
        System.out.println("Zoo name:"+name);
        System.out.println("Zoo city:"+city);
        System.out.println("Zoo nombre de cage :"+nbrCages);
    }
    public String toString() {
        return "Zoo [name:" + name + ", city:" + city + ", nbrCages:" + nbrCages + "]";
    }
    public void addAnimal(Animal a) throws ZooFullException, InvalidAgeException {

        if (a.getAge() < 0) {
            throw new InvalidAgeException();
        }


        if (isFull()) {
            throw new ZooFullException();
        }

        for (int i = 0; i < countAnimal; i++) {
            if (animals[i].getFamily().equals(a.getFamily())) {
                System.out.println("L’animal " + a.getFamily() + " existe déjà !");
                return;
            }
        }

        animals[countAnimal] = a;
        countAnimal++;
        System.out.println(a.getName() + " ajouté avec succès !");
    }


    public void afficher_animals(){
        for(int i=0;i<countAnimal;i++){
            System.out.println(animals[i]);
        }
    }
    public int searchAnimal(String name) {
        for (int i = 0; i < countAnimal; i++) {
            if (animals[i].getName().equals(name)) {
                return i ;
            }

        }
        return -1;
    }
    public boolean removeAnimal(String name) {
        for (int i = 0; i < countAnimal; i++) {
            if (animals[i].getName().equals(name)) {
                animals[i] = animals[countAnimal - 1];
                animals[countAnimal - 1] = null;
                countAnimal--;

                System.out.println(" L’animal " + name + " a été supprimé du zoo ");
                return true;
            }
        }

        System.out.println(" L’animal " + name + " n’existe pas dans le zoo !");
        return false;
    }
    public boolean isFull() {
        return countAnimal >= nbrCages;
    }
    public static Zoo compareZoo(Zoo z1, Zoo z2) {
        if (z1.countAnimal >= z2.countAnimal) {
            return z1;
        } else {
            return z2;
        }
    }
    public void addAquaticAnimal(Aquatic a) {
       if(countanimalaqua<10){
           aquaticAnimals[countanimalaqua]=a;
           countanimalaqua++;
       }
       else
           System.out.println("Le zoo est plein ");

    }
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0f;
        for (int i = 0; i < countAnimal; i++) {
            if (animals[i] instanceof Penguin) {
                Penguin p = (Penguin) animals[i];
                if (p.getSwimmingDepth() > maxDepth) {
                    maxDepth = p.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }
    public void afficherNombreParType() {
        int countDolphins = 0;
        int countPenguins = 0;

        for (int i = 0; i < countAnimal; i++) {
            if (animals[i] instanceof Dolphin) {
                countDolphins++;
            } else if (animals[i] instanceof Penguin) {
                countPenguins++;
            }
        }

        System.out.println("Nombre de dauphins : " + countDolphins);
        System.out.println("Nombre de pingouins : " + countPenguins);
    }








}
