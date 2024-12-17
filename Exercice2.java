
public class Exercice2 {

    public static void main(String[] args) {
        String nomInstitution;
        String paysInstitution;
        String typeInstitution;
        int anneeCreation;

        int nombreFaculte;
        String systeme;
        String nomRecteur;
        
        String typeEcole;
        int nombreClasse;
        String promoteur;


        //Description d'une institution
        Institution institution = new Institution("ULPGL", "Congo", "Public", 1996);
        institution.decrireInstitution();

        System.out.println("----------------------------------");

        // //description d'universite
        Universite universite1 = new Universite("Unigom", "Congo", "Public", 1994, 6, "LMD", "Kalimumbalo");
        universite1.decrireInstitution();

        Universite universite2 = new Universite("Sapiensia", "Congo", "Privée", 1990, 6, "LMD", "Prof. Sacco");
        universite2.decrireInstitution();

        System.out.println("----------------------------------");

        //decriprion
        Ecole ecole1 = new Ecole("Lycee Amani", "DRC", "Privée", 1980, "Secondaire", 10, "Sr.Philomene");
        ecole1.decrireInstitution();

        Ecole ecole2 = new Ecole("College Mwanga", "DRC", "Public", 1990, "Secondaire", 20, "Abbe Malu");
        Ecole ecole3 = new Ecole("Lycee Chemschem", "DRC", "Public", 1960, "Secondaire", 20, "Sr. Marie");


        System.out.println("----------------------------------");
        universite1.getNomRecteur();
        universite2.getNomRecteur();

        //if the method getNomRecteurByUniversite() was static. we could call it using Universite.getNomRecteurByUniversite();
        //but as our method is an instance method, we have to call it on an object of University type,
        //here as the method already has two objects as parameters, we call it using the constructor with null parameters.
        new University(null, null, null, 0, 0, null, null).getNomRecteurByUniversite(universite1, universite2);

        System.out.println("----------------------------------");
        new Ecole(null, null, null, 0, null, 0, null).getNomPromoteurParEcole(ecole1, ecole2, ecole3);
        
    }
    
}