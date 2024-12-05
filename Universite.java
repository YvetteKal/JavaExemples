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

}
