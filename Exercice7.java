import java.util.Scanner;
public class Exercice7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tab[][] = new int[4][5];
        int valeur;

        System.out.println("Entrer les valeurs du tableau");
        for(int i =0; i<4; i++){
            for (int j = 0; j<5; j++){
                System.out.println("Valeur à la position "+i+ ""+j);
                tab[i][j] = sc.nextInt();
            }
        }

        //affficher le tableau sous forme de matrice
        for(int i =0; i<4; i++){
            for (int j = 0; j<5; j++){
                System.out.print(tab[i][j]+"\t");
            }
            System.out.print("\n");
        }

        //verifier si un nombre quelconque est dans le tableau
        System.out.println("Entrez un entier quelconque");
        valeur = sc.nextInt();

        //recherche
        boolean trouve = false;
        for(int i =0; i<4; i++){
            for (int j = 0; j<5; j++){
                if (tab[i][j] == valeur){
                    trouve = true;
                    break; // Arrête la boucle interne si le nombre est trouvé

                }
            }
            if (trouve) break; // Arrête la boucle externe
        }

        //affichage du resultat
        if(trouve){
            System.out.println("le nombre "+valeur+" se trouve dans le tableau");

        }else{
            System.out.println("le nombre "+valeur+" ne se trouve pas dans le tableau");
        }



        
    }

}
