import java.util.Scanner;

public class Exercice6 {
    //les tableaux
    public static void main(String[] args) {

        double tab[] = new double[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez les 10 valeurs reelles s'il vous plait: ");
        //initialisation du tableau avec les valeurs entrées par l'utilisateur
        for (int i=0; i<tab.length; i++){
            System.out.println("Valeur "+(i+1));
            tab [i]= sc.nextDouble();
        }  
        
        //calcul de la somme, produit et moyenne des valeurs
        double somme = 0;
        double produit = 1;
        double moyenne;

        //somme et produit
        for (int i = 0; i<tab.length; i++){
            somme = somme + tab[i];
            produit = produit * tab[i];

        }

        //moyenne
        moyenne = somme/tab.length;

        System.err.println("Somme: "+somme+", produit: "+produit+", et moyenne: "+moyenne);

        sc.close();
        

        
    }
    


}
