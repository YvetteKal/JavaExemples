public abstract class Animal {
    //une classe qui ne peut pas etre instancié et pouvant contenir des methodes abstraites
    //les classes qui heritent de cette classe abstraite sont celles qui redefinissent les methodes abstraites

    private int poid;
    private String couleur;

    //les deux methodes non abstraites
    public void manger(){
        System.out.println("Cet animal mange de la viande");
    };

    public  void boire(){
        System.out.println("Cet animal boit de l'eau");
    };

    //les deux methodes abstraites
    abstract void deplacement();
    abstract void crier();


}
