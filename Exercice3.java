import java.util.Scanner;

public class Exercice3 {

    public static void main(String[] args) {
        
        int a, b, c;
        System.out.println("Entrez la valeur de a");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        
        System.out.println("Entrez la valeur de b");
        b = sc.nextInt();

        c = a + b;
        System.out.println("La somme de a et b est: " +c);

    }
    

}
