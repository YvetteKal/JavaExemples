public class Universite extends Institution{   

    //attributs supplementaires 
    int nombreFaculte;
    String systeme;
    String nomRecteur;

    //constructeur
    public Universite(String name, String pays, String type, int anneeCreation, int nombreFaculte, String systeme, String nomRecteur){
        super(name, pays, type, anneeCreation);
        this.nombreFaculte = nombreFaculte;
        this.systeme = systeme;
        this.nomRecteur = nomRecteur;

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
        System.err.println("L'université a pour nombre des faculté: "+this.getNombreFaculte()+ 
        ", elle utilise le pour systeme: "+this.getSysteme()+
        ", et a pour nom de recteur: "+this.getNomRecteur());
    }

    //methode d'instance: pOUR 2 University o fait comment??
    public void getNomRecteurByUniversityName(String name){

        System.out.println("Le nom du recteur de l'université "+name+" est: "+this.getNomRecteur());

    }

}
