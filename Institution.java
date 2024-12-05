import java.time.LocalDate;

public class Institution {
    //les variables d'instance
    private String name;
    private String pays;
    private String type;
    private int anneeCreation;

    //le constructeur
    public Institution(String name, String pays, String type, int anneeCreation){
        this.name = name;
        this.pays = pays;
        this.type = type;
        this.anneeCreation = anneeCreation;
    }

    //getters and setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getPays(){
        return pays;
    }
    public void setPays(String pays){
        this.pays = pays;
    }

    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }

    public int getAnneeCreation(){
        return anneeCreation;
    }
    public void setAnneeCreation(int anneCreation){
        this.anneeCreation = anneCreation;
    }

    //deux methodes d'instance peut modifier l'objet (et est sans static), 
    //une methode de classe est comme en procedural
    //Une méthode d'instance (ou d'objet) a pour but de manipuler les attributs de l'objet.
    //Si ce n'est pas le cas alors ta méthode doit surement être statique (de classe)
    public int getAgeInstitution(int annee){
        int year = LocalDate.now().getYear();
        int age = year-annee;
        return age;
    }
    // public void decrireInstitution(String name, int anneCreation){
    //     System.out.println("L'instititution "+name+ " est situé dans le pays: " +this.getPays()+
    //      "a pourtype: "+this.getType()+", a pour annee de creation: "+this.getAnneeCreation()+ 
    //      "et a pour age: "+ getAgeInstitution(anneCreation));
    // }
    public void decrireInstitution(){
        System.out.println("Description de l'instititution "+this.getName()+ " est situé dans le pays: " +this.getPays()+
         ", a pour type: "+this.getType()+", a pour annee de creation: "+this.getAnneeCreation()+ 
         "et a pour age: "+ this.getAgeInstitution(this.getAnneeCreation()));
    }

    



}
