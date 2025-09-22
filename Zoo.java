public class Zoo {
    static final int cage =25;
    Animal[] animals =new Animal[cage];
    String name ;
    String city ;
    final int nbrCages ;
    int countAnimal=0;
    Zoo(String name,String city,int nbrCages){
        this.name=name;
        this.city=city;
        this.nbrCages = Math.min(nbrCages, cage);
        this.animals = new Animal[this.nbrCages];

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
        // Vérifier la capacité
        if (countAnimal >= nbrCages) {
            System.out.println(" Le zoo est plein !");
            return false;
        }

        // Vérifier unicité
        for (int i = 0; i < countAnimal; i++) {  // uniquement animaux existants
            if (animals[i].family.equals(a.family)) {
                System.out.println(" L’animal " + a.family + " existe déjà !");
                return false;
            }
        }


        animals[countAnimal] = a;
        countAnimal++;
        System.out.println( a.name + " ajouté avec succès !");
        return true;
    }


    void afficher_animals(){
        for(int i=0;i<countAnimal;i++){
            System.out.println(animals[i]);
        }
    }
    public int searchAnimal(String name) {
        for (int i = 0; i < countAnimal; i++) {
            if (animals[i].name.equals(name)) {
                return i ;
            }

        }
        return -1;
    }
    public boolean removeAnimal(String name) {
        for (int i = 0; i < countAnimal; i++) {
            if (animals[i].name.equals(name)) {
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
