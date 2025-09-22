public class Zoo {
    Animal[] animals =new Animal[25];
    String name ;
    String city ;
    int nbrCages ;
    Zoo(String name,String city,int nbrcages){
        this.name=name;
        this.city=city;
        this.nbrCages=nbrcages;
        animals=new Animal[nbrcages];

    }
    void displayZoo(){
        System.out.println("Zoo name:"+name);
        System.out.println("Zoo city:"+city);
        System.out.println("Zoo nombre de cage :"+nbrCages);
    }
    public String toString() {
        return "Zoo [name:" + name + ", city:" + city + ", nbrCages:" + nbrCages + "]";
    }

}
