public class Taxi extends Voiture {

    private String couleur;
    private String itineraire;

    //constructeur de la classe fille
    public Taxi(String numero, String marque, int nombrePortes, int nombrePneus, int nombreChaises, String couleur, String itineraire){
        super(numero, marque, nombrePortes, nombrePneus, nombreChaises);
        this.couleur = couleur;
        this.itineraire = itineraire;
    }
}