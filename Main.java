//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("lion","simba",5,true);
        Animal elephant = new Animal("elephant", "bomba", 12, true);
        Animal cobra = new Animal("serpentes", "moufasa", 3, false);
        Zoo myZoo = new Zoo("belvider","tunis",25);
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

    }
}