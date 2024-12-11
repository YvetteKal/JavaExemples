public class Ecole extends Institution{

    private String typeEcole;
    private int nombreClasse;
    private String promoteur;

    //constructor
    public Ecole(String nomInstitution, String paysInstitution, String typeInstitution, int anneeCreation, String typeEcole, int nombreClasse, String promoteur){
        super(nomInstitution, paysInstitution, typeInstitution, anneeCreation);
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
        System.out.println("Type: "+getTypeEcole()+ "\n"+
        "Nombre des classes: "+getNombreClasse()+ "\n"+
        "Promoteur: "+getPromoteur());
    }

    //seconde methode d'instance
    public void getNomPromoteurParEcole(Ecole e1, Ecole e2, Ecole e3){
        System.out.println("Le nom du promoteur de l'ecole 1 nommé "+e1.getName()+ "est: "+e1.getPromoteur());
        System.out.println("Le nom du promoteur de l'ecole 2 nommé "+e2.getName()+ "est: "+e2.getPromoteur());
        System.out.println("Le nom du promoteur de l'ecole 3 nommé "+e3.getName()+ "est: "+e3.getPromoteur());
    }


}
