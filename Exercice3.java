import java.util.Scanner;

public class Exercice3 {

    public static void main(String[] args) {
        
        int a, b, c;
        
        try {
            System.out.println("Entrez la valeur de a");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            System.out.println("Entrez la valeur de b");
            b = sc.nextInt();

            c = a + b;
            System.out.println("La somme de a et b est: " +c);
            
        } catch (Exception e) {
            // TODO: handle exception  InputMismatchException
            System.out.println("l'exception: "+e+" a ete capturé");
            System.out.println("Entrez une valeur entiere s'il vous plait");
        }
        
    

    }
    

}
