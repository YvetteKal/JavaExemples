public class Ecole extends Institution{

    private String typeEcole;
    private int nombreClasse;
    private String promoteur;

    //constructor
    public Ecole(String name, String pays, String type, int anneeCreation, String typeEcole, int nombreClasse, String promoteur){
        super(name, pays, type, anneeCreation);
        this.typeEcole = typeEcole;
        this.nombreClasse = nombreClasse;
        this.promoteur = promoteur;
        //every time you create an object of this class, the variable classname is set to the name of this class
        super.setClassName("Ecole");
    }

    //getters and setters
    public String getTypeEcole(){
        return typeEcole;
    }
    public void setTypeEcole(String typeEcole){
        this.typeEcole = typeEcole;
    }

    public int getNombreClasse(){
        return nombreClasse;
    }
    public void setNombreClasse(int nombreClasse){
        this.nombreClasse = nombreClasse;
    }

    public String getPromoteur(){
        return promoteur;
    }
    public void setPromoteur(String promoteur){
        this.promoteur= promoteur;
    }

    //methodes d'instance
    @Override
    public void decrireInstitution(){
        super.decrireInstitution();
        System.out.println("L'ecole a pour type: "+this.getTypeEcole()+
        ", elle a pour nombre des classes: "+this.getNombreClasse()+
        ", et pour promoteur"+this.getPromoteur());
    }

    //seconde methode d'instance: POUR 3 ECOLES on fait comment??
    public void getNomPromoteurParEcole(String nom){
        System.out.println("Le nom du promoteur de l'ecole "+nom+ "est: "+this.promoteur);
    }


}
