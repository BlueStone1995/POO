package Heritage_Personne;

abstract class Personne {

    protected String nom;
    protected String prenom;
    protected String rue;
    protected String ville;
    protected static int nbPersonnes = 0;

    //Constructeur
    Personne(String nom, String prenom, String rue, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.rue = rue;
        this.ville = ville;
        nbPersonnes++;
    }

    public String toString() {
        return nom + " " + prenom + " " + rue + " " + ville;
    }

    void ecrirePersonne(){
        System.out.println (this);
    }

    public static void nbPersonnes() {
        System.out.println(
                "\nNombre d’employés       : " + nbPersonnes +
                        "\nNombre de secrétaires   : " + Secretaire.nbSecretaires() +
                        "\nNombre d’enseignants    : " + Enseignant.nbEnseignants() +
                        "\nNombre d’étudiants      : " + Etudiant.nbEtudiants()
        );
    }

    void modifierPersonne(String rue, String ville) {
        this.rue = rue;
        this.ville = ville;
        ecrirePersonne();
    }
}
