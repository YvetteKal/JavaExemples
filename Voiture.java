public class Voiture{
    //Variables d'instance
    private String numero;
    private String marque;
    private int nombrePortes;
    private int nombrePneus;
    private int nombreChaises;

    //le constructeur de la classe voiture
    public Voiture(String numero, String marque, int nombrePortes, int nombrePneus, int nombreChaises ){
        this.numero = numero;
        this.marque = marque;
        this.nombrePortes = nombrePortes; 
        this.nombrePneus = nombrePneus;
        this.nombreChaises = nombreChaises;
    }

    //les getters et les setters
    public String getNumero(){
        return numero;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }

    public String getMarque(){
        return marque;
    }
    public void setMarque(String marque){
        this.marque = marque;
    }

    public int getNombrePortes(){
        return nombrePortes;
    }
    public void setNombrePortes(int nombrePortes){
        this.nombrePortes = nombrePortes;
    }

    public int getNombrePneus(){
        return nombrePneus;
    }
    public void setNombrePneus(int nombrePneus){
        this.nombrePneus = nombrePneus;
    }

    public int getNombreChaises(){
        return nombreChaises;
    }
    public void setNombreChaises(int nombreChaises){
        this.nombreChaises = nombreChaises;
    }


}


