import java.util.Scanner;

public class ZooManagement {
    int nbrCages ;
    String zooName ;

    Scanner sc = new Scanner(System.in);
    void lecture_nom(){
        System.out.println("Le nom de la zoo :");
        zooName = sc.nextLine();
        if (zooName.isEmpty()){
            System.out.println("Le nom de la zoo est vide");
        }
    }
    void lecture_nbr_cage(){
        System.out.println("nombre des cages :");
        nbrCages = sc.nextInt();
        if (nbrCages<=0){
            System.out.println("le nombre de cage doit etre positive");
            nbrCages= sc.nextInt();
        }
    }

    void afficher (){
        System.out.println(zooName +" comporte "+nbrCages+" cages");
    }

}
