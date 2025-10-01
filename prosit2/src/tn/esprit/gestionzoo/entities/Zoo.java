package tn.esprit.gestionzoo.entities;
public class Zoo {
    static final int cage =25;
    private Animal[] animals =new Animal[cage];
    private String name ;
    private String city ;
    private final int nbrCages ;
    private int countAnimal=0;
    Zoo(String name,String city,int nbrCages){
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
    void displayZoo(){
        System.out.println("Zoo name:"+name);
        System.out.println("Zoo city:"+city);
        System.out.println("Zoo nombre de cage :"+nbrCages);
    }
    public String toString() {
        return "Zoo [name:" + name + ", city:" + city + ", nbrCages:" + nbrCages + "]";
    }
    Boolean addAnimal(Animal a) {

        if (isFull()) {
            System.out.println(" Le zoo est plein !");
            return false;
        }


        for (int i = 0; i < countAnimal; i++) {
            if (animals[i].getFamily().equals(a.getFamily())) {
                System.out.println(" L’animal " + a.getFamily() + " existe déjà !");
                return false;
            }
        }


        animals[countAnimal] = a;
        countAnimal++;
        System.out.println( a.getName() + " ajouté avec succès !");
        return true;
    }


    void afficher_animals(){
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





}
