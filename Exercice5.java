import java.util.Scanner;

public class Exercice5 {

    public static void main(String[] args) {
        //Suite exercices TD, Question 6
        //resolution ax2 + bx + c = 0
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le coefficient a (non nul)");
        double ca = sc.nextInt(); //ca = coefficient a

        System.out.println("Entrer le coefficient b");
        double cb = sc.nextInt();

        System.out.println("Entrer le coefficient c");
        double cc = sc.nextInt();

        //afficher l'equatio a resoudre
        System.out.println("L'equation à resoudre est: "+ca+ "x^2 + "+cb+ "x + "+cc);

        //calcul de delta
        double delta = EquationSecondDegre.calculDelta(ca, cb, cc);

        EquationSecondDegre.afficherResultats(ca, cb, delta);            
     
    }
    

}
