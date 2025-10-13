package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {
        Zoo zoo= new Zoo ( "belvider","ksar hlel",20);
        Aquatic fish = new Aquatic("fish", "Nemo", 2, false, "Ocean");
        Terrestrial lion = new Terrestrial("lion", "Leo", 5, true, 4);
        Dolphin dol = new Dolphin("dolphin", "Flipper", 4, true, "Sea", 10);
        Penguin peng = new Penguin("penguin", "Pingu", 3, true, "Ice", 2);
        System.out.println(fish);
        System.out.println(lion);
        System.out.println(dol);
        System.out.println(peng);


        zoo.addAquaticAnimal(fish);
        zoo.addAquaticAnimal(dol);

        for (int i = 0; i < zoo.getCountanimalaqua(); i++) {
            zoo.getAquaticAnimals()[i].swim();
        }









    }
}