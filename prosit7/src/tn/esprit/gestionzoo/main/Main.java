package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.exceptions.ZooFullException;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("Belvédère", "Ksar Hlel", 3);


        Animal lion = new Terrestrial("Felidae", "Simba", 5, true, 4);
        Animal dolphin = new Dolphin("Delphinidae", "Flipper", 4, true, "Ocean", 15.5f);
        Animal penguin = new Penguin("Spheniscidae", "Pingu", 3, true, "Antarctique", 2.0f);


        Animal invalidAnimal = new Animal("Canidae", "Rex", -2, true) {
            @Override
            public String toString() {
                return super.toString();
            }
        };

        tryAddAnimal(zoo, lion);
        tryAddAnimal(zoo, dolphin);
        tryAddAnimal(zoo, penguin);
        tryAddAnimal(zoo, invalidAnimal);

        Animal extraLion = new Terrestrial("Felidae", "Mufasa", 8, true, 4);
        tryAddAnimal(zoo, extraLion);


        zoo.afficher_animals();
        System.out.println("Nombre total d'animaux : " + zoo.getCountAnimal());
    }

    private static void tryAddAnimal(Zoo zoo, Animal animal) {
        try {
            zoo.addAnimal(animal);
        } catch (InvalidAgeException e) {
            System.err.println("ERREUR : " + e.getMessage());
        } catch (ZooFullException e) {
            System.err.println("ERREUR : " + e.getMessage());
        } finally {
            System.out.println("Nombre actuel d'animaux dans le zoo : " + zoo.getCountAnimal());
        }
    }
}