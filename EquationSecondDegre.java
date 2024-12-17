
public class EquationSecondDegre {
    //uses Exericice 5 file
    // fonction pour calculer delta
    public static double calculDelta(double ca, double cb, double cc){
        //delta = b2 -4ac
        double delta = (Math.pow(2, cb)) - 4*(ca*cc);
        // Afficher le discriminant
        System.out.println("Le discriminant (Δ) est : " + delta);

        return delta;
    }

    //procedureafficher les solutions
    public static void afficherResultats(double ca, double cb, double delta){
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
            double realPart = -cb / (2 * ca);
            double imaginaryPart = Math.sqrt(-delta) / (2 * ca);
            System.out.println("Les racines complexes sont : x1 = " + realPart + " - " + imaginaryPart + 
            "i et x2 = " + realPart + " + " + imaginaryPart + "i");


        }
    }

    

}
