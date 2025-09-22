//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("lion","simba",5,true);
        Animal elephant = new Animal("elephant", "bomba", 12, true);
        Animal cobra = new Animal("serpentes", "moufasa", 3, false);
        Animal tortue = new Animal("tortue", "touta", 5, false);
        Zoo myZoo=new Zoo ("belvider","tunis",4);
        Zoo Zo1=new Zoo ("afric","sousse",10);
        Zoo Zo2=new Zoo ("boooo","hammamet",10);
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        System.out.println(Zo1.addAnimal(lion));
       
        System.out.println(Zo2.addAnimal(lion));
        System.out.println(myZoo.addAnimal(elephant));
        System.out.println(myZoo.addAnimal(cobra));
        System.out.println(myZoo.addAnimal(tortue));
        myZoo.afficher_animals();
        System.out.println("Indice du  "+lion.name + ": "+ + myZoo.searchAnimal(lion.name));
        myZoo.removeAnimal("bomba");
        myZoo.afficher_animals();
        System.out.println("Zoo1 plein  " + myZoo.isFull());
        Zoo plusGrand = Zoo.compareZoo(Zo1, Zo2);
        System.out.println("Le zoo avec le plus d’animaux est : " + plusGrand.name);




    }
}