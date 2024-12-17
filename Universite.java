public class Universite extends Institution{   

    //attributs supplementaires 
    private int nombreFaculte;
    private String systeme;
    private String nomRecteur;


    //constructeur
    public Universite(String nomInstitution, String paysInstitution, String typeInstitution, int anneeCreation, int nombreFaculte, String systeme, String nomRecteur){
        super(nomInstitution, paysInstitution, typeInstitution, anneeCreation);
        this.nombreFaculte = nombreFaculte;
        this.systeme = systeme;
        this.nomRecteur = nomRecteur;
        super.setClassName("Université");

    }
 
    //getters and setters
    //herite les getters and setters pour les characteristiques communes
    public int getNombreFaculte(){
        return nombreFaculte;
    }
    public void setNombreFaculte(int nombreFaculte){
        this.nombreFaculte = nombreFaculte;
    }

    public String getSysteme(){
        return systeme;
    }
    public void setSysteme(String systeme){
        this.systeme = systeme;
    }

    public String getNomRecteur(){
        return nomRecteur;
    }
    public void setNomRecteur(String nomRecteur){
        this.nomRecteur = nomRecteur;
    }

    //METHODE POLYMPRPHE: Modification du comportement de la classe fille par rapport à la classe mère
    @Override
    public void decrireInstitution() {
        // TODO Auto-generated method stub
        super.decrireInstitution();
        System.out.println("Nombre des faculté: "+this.getNombreFaculte()+ "\n"+
        "Systeme: "+this.getSysteme()+"\n"+
        "Nom du recteur: "+this.getNomRecteur()

        );
    }

    //methode d'instance
    // public void getNomRecteurByUniversityName(Universite u1, Universite u2){
    //     System.out.println("Le nom du recteur de l'université 1 nommé, "+u1.getName()+" est: "+u1.getNomRecteur());
    //     System.out.println("Le nom du recteur de l'université 2 nommé, "+u2.getName()+" est: "+u2.getNomRecteur());
    // }
    //methode d'instance
    public void getNomRecteurByUniversite(Universite u1, Universite u2){
        System.out.println("Le nom du recteur de l'université 1 nommé, "+u1.getName()+" est: "+u1.getNomRecteur());
        System.out.println("Le nom du recteur de l'université 2 nommé, "+u2.getName()+" est: "+u2.getNomRecteur());
    }

}
