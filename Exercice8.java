import java.util.Scanner;;
public class Exercice8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tab1 [][] = new int[4][4];
        int tab2[][] = new int [4][4];

        //initialisation du premier tableau (pemiere matrice)
        System.out.println("Entrez les valeurs de la premiere matrice");
        for(int i=0; i<4; i++){
            for (int j = 0; j<4; j++){
                System.out.println("valeur "+i+""+j);
                tab1[i][j] = sc.nextInt();
                
            }
        }

        //afficher la premiere matrice
        System.out.println("La premiere matrice est: ");
        for(int i=0; i<4; i++){
            for (int j = 0; j<4; j++){
                System.out.print(tab1[i][j]+"\t");                
            }
            System.out.println();
        }

        //initialisation de la deuxieme matrice
        System.out.println("Entrez les valeurs de la deuxieme matrice");
        for(int i=0; i<4; i++){
            for (int j = 0; j<4; j++){
                System.out.println("valeur "+i+""+j);
                tab2[i][j] = sc.nextInt();
                
            }
        }

        //afficher la premiere matrice
        System.out.println("La deuxieme matrice est: ");
        for(int i=0; i<4; i++){
            for (int j = 0; j<4; j++){
                System.out.print(tab2[i][j]+"\t");                
            }
            System.out.println();
        }

        //calculs
        //multiplication de la premiere matrice par la transposee de la deuxieme
        //tab1 * ttab2

        int ttab2[][] = new int[4][4];
        for (int i = 0; i<4; i++){
            for (int j = 0; j<4; j++){
                ttab2 [j][i] = tab2[i][j];
            }
        }

        //affiter tttab2
        System.out.println("La deuxieme matrice transposee est: ");
        for(int i=0; i<4; i++){
            for (int j = 0; j<4; j++){
                System.out.print(ttab2[i][j]+"\t");                
            }
            System.out.println();
        }

        //multiplication de la premiere par la deuxieme transposee
        //LICO
        //value at ij = sum of values corresponding to 
        int produitM[][] = new int [4][4];
        System.out.println("le produit des matrices est:");
        for(int i=0; i<4; i++){
            for (int j = 0; j<4; j++){
                produitM[i][j] = 0;//ensures that all elements start at 0. 
                //If you don’t initialize, the results might be inaccurate because you might end up summing onto pre-existing values.
                for(int k=0; k<4; k++){// it allows us to iterate through the rows i of the first matrix and the columns j of the second matrix
                    produitM[i][j] = produitM[i][j] + (tab1[i][k] * ttab2 [k][j]);
                    
                }
                
                System.out.print(produitM[i][j]+"\t"); 
                
            }
            System.out.println();
        }


        
        

        
    }
}
