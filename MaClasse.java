import java.io.File;

public class MaClasse {
    public String nomFichier;
    public void lireFichier (String nomFichier)throws Exception{

        //verifie si le fichier existe
        if (new File(nomFichier).exists()){
            //lire le fichier
        }else{
            //le fichier n'existe pas
        }

    }

}

//here the problem can be diverse and if condition is not specific
//consequently personalized exceptions are needed
