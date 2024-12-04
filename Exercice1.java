import java.util.Scanner;
//import Voiture;

public class Exercice1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //creer l'objet tableau voiture de la classe Voiture
        Voiture[] voiture = new Voiture[5]; //tableau des 5 voitures

        for (int i=0; i<5; i++){

            System.out.println("Voiture numero" +(i+1)+ ":");

            System.out.println("Entrer le numero de la voiture");
            String numero = scanner.nextLine();

            System.out.println("Entrer la marque de la voiture");
            String marque = scanner.nextLine();

            System.out.println("Entrer le nombre des portes de la voiture");
            int nombrePortes = scanner.nextInt();

            System.out.println("Entrer le nombre des pneus de la voiture");
            int nombrePneus = scanner.nextInt();

            System.out.println("Entrer le nombre des chaises de la voiture");
            int nombreChaises = scanner.nextInt();

            scanner.nextLine(); // As nextInt() leaves a nextline /n we have Consume the leftover newline character before calling nextLine again

            System.out.println("---------------------------------------------");
            voiture[i] = new Voiture(numero,marque,nombrePortes,nombrePneus,nombreChaises); 

            //Affichage des informations entrées
            System.out.println("Vous venez de créer la voiture " +(i+1)+ " de numero: " +voiture[i].getNumero()+
             ", de marque: "+voiture[i].getMarque()+ ", au nombre des portes: "+voiture[i].getNombrePortes()+
              ", au nombre des pneus: "+voiture[i].getNombrePneus()+ 
              ", et au nombre des chaises: "+voiture[i].getNombreChaises());
            System.out.println("---------------------------------------------");

        }
        scanner.close();
        //ALTERNATIVE USING THE SETTERS
        //create a contructor of class Voiture without parameters called a Default no-argument constructor
        //public Voiture() {}
        //create the arrau of voitures as usual
        //Voiture[] voitures = new Voiture[5];
        //in the for loop, create an object voiture that will be taking values entered by the user
        //// Create a new Voiture object using the no-argument constructor
        //Voiture voiture = new Voiture();
        //Everytime a value is entered, use it to update the object variable
        //voiture.setNumero(numero); // Set the numero using the setter

        //now update the tableau voitures with thenewly set voiture object
        //// Add the voiture object to the array
        //voitures[i] = voiture;
        //the rest of the code remains same


    }
}




