package Heritage_Personne;

public class Secretaire extends Personne {

    private String numeroBureau;
    private static int nbSecretaire =0;

    Secretaire(String nom, String prenom, String rue, String ville, String numeroBureau){
        //Constructeur de ma super classe
        super(nom, prenom, rue, ville);
        this.numeroBureau=numeroBureau;
        nbSecretaire++;
    }

    public String toString(){

        return super.toString()+"\n Numero bureau : "+this.numeroBureau;
    }

    void ecrirePersonne(){
        System.out.println("Secrétaire : "+toString());
    }

    public static int nbSecretaires(){
        return nbSecretaire;

    }


}
