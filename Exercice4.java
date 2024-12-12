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

        //Question 5
        System.out.println("---------------Q5------------------");
        System.out.println("Entrer un nombre entier positif");
        int number = sc.nextInt();

        // Vérifier que le nombre est positif
        if (nombre <= 0) {
            System.out.println("Veuillez entrer un nombre entier positif.");
        } else {

            int somme = 0;

            for(int i=1; somme < number; i++){
                somme = somme + i;
            }
            System.out.println("La somme des nombres entiers inferieurs à "+number+" est: " +somme);

            //another method instead of the for loop.
            // int i = 1;

            // // Ajouter les entiers naturels jusqu'à ce que la somme soit supérieure ou égale au nombre
            // while (somme < nombre) {
            //     somme += i;
            //     i++;
            // }
        } 
        
        //Question 6
        //resolution ax2 + bx + c = 0
        System.out.println("---------------Q6------------------");
        System.out.println("Entrer le coefficient a (non nul)");
        double ca = sc.nextInt(); //ca = coefficient a

        System.out.println("Entrer le coefficient b");
        double cb = sc.nextInt();

        System.out.println("Entrer le coefficient c");
        double cc = sc.nextInt();

        //delta = b2 -4ac
        double delta = (Math.pow(2, cb)) - 4*(ca*cc);

        // Afficher le discriminant
        System.out.println("Le discriminant (Δ) est : " + delta);

        //calcul des racines
        //x1,x2 = -b+-sqrt (delta)/2b
        double x1, x2;

        if (delta > 0){

            x1 = (-cb + Math.sqrt(delta))/(2*ca);
            x2 = (-cb - Math.sqrt(delta))/(2*ca);
            System.out.println("Les racines sont : x1 = " + x1 + " et x2 = " + x2);

        }else if (delta == 0){
            //une recine reelle double
            x1 = -cb/(2*ca);
            System.out.println("La racine double est : x1 = x2 = " + x1);

        }else{
            //racines complexes
            // double i = Math.sqrt(-1);
            // x1 = (-cb + i * Math.sqrt(-delta))/(2*ca);
            // x2 = (-cb - i * Math.sqrt(-delta))/(2*ca);
            // System.out.println("Les recines imaginaires sont: x1 = " + x1 + " et x2 = " + x2);
            // Racines complexes
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-delta) / (2 * a);
            System.out.println("Les racines complexes sont : x1 = " + realPart + " - " + imaginaryPart + 
            "i et x2 = " + realPart + " + " + imaginaryPart + "i");


        }
   
    }


}
