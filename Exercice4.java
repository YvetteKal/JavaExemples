import java.util.Scanner;

public class Exercice4 {
    //TD
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //question 1
        System.out.println("Entrer votre temps en seconde");
        int totalSeconde = sc.nextInt();

        int heure = totalSeconde/3600; //1h = 60min, 1 min = 60 sec  1h = 3600sec
        int restesSeconde = totalSeconde%3600;
        int minute = restesSeconde/60;
        int seconde = restesSeconde%60;

        System.out.println(totalSeconde+ " secondes correspondent à "+heure+ " heures, "+minute+" minutes, et "+seconde+ " secondes");

        //question 2
        System.out.println("----------------Q2-----------------");
        System.out.println("Entrer la valeur de la premiere variable entiere");
        int a = sc.nextInt();

        System.out.println("Entrer la valeur de la deuxieme variable entiere");
        int b = sc.nextInt();

        //Exemple 2,3

        int produit = a *b;
        
        if (produit < 0){
            int c;
            c = a;a = b;b = c;//c = 2; a = 3, b= 2
            System.out.println("les valeurs echangees sont: "+a+ " et "+b);

        }else{
            int somme = a+b;
            a = produit;
            b = somme;
            //int somme = a+b;
            System.out.println("Le produit des deux est "+a+" et la somme des deux est "+b);

        }
        //Question 3
        System.out.println("---------------Q3------------------");
        System.out.println("Entrer la premiere valeur entiere");
        a = sc.nextInt();
        System.out.println("Entrer la deuxieme valeur entiere");
        b = sc.nextInt();
        System.out.println("Entrez l'opérateur (+, -, *, /) :");
        char operateur = sc.next().charAt(0);

        double resultat = 0;
        switch (operateur) {
            case '+':
                resultat = a + b;   
                break; //used to exit the swith bloc after a case is executed
                //Without break, the program will continue executing the subsequent cases even if they don't match the condition, 
                //which is called "fall-through."
                //after a break, the instructions after the swith block are executed
            case '*':
                resultat = a * b;   
                break;
            case '/':
                //gestion division par zero exception
                try {
                    resultat = a / b; 
                    break; 
                    
                } catch (Exception e) {
                    // TODO: handle exception
                    System.out.println("Erreur: "+e);
                    return;
                }
 
                   
            case '-':
                resultat = a - b;   
                break;
            default:
                System.out.println("Opérateur invalide.");
                return;// Arrêter le programme si l'opérateur est invalide
        }

        double doubleR = 2 * resultat;

        System.out.println("Le double de "+a+ " "+operateur+ " "+b+ " est "+doubleR);

        //Question 4
        System.out.println("---------------Q4------------------");
        System.out.println("Entrer le nombre de depart");
        int nombre = sc.nextInt();
        System.out.println("Entrer le nombre de nombres à afficher");
        int N = sc.nextInt();


        if (N<nombre){
            
            System.out.println("Les "+N+" nombres precedent "+nombre+ " sont:");
            for(int i=1; i<= N; i++){
                System.out.println(nombre - i);
            }

        }else{
            System.out.println("Le nombre des nombres doit etre inferieur au nombre de depart");
        }
        



        
    }


}
