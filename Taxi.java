public class Taxi extends Voiture {

    private int numeroTaxi;
    private String itineraire;

    //constructeur de la classe fille
    public Taxi(String numero, String marque, int nombrePortes, int nombrePneus, int nombreChaises, int numeroTaxi, String itineraire){
        super(numero, marque, nombrePortes, nombrePneus, nombreChaises);
        this.numeroTaxi = numeroTaxi;
        this.itineraire = itineraire;
    }
}