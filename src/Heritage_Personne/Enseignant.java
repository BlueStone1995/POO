package Heritage_Personne;

class Enseignant extends Personne {

    private String specialite;
    private static int nbEnseignants = 0; // nombre d’Enseignant

    //Construcyeur
    Enseignant(String nom, String prenom, String rue, String ville, String specialite) {
        super(nom, prenom, rue, ville); // appel du constructeur Personne
        this.specialite = specialite;
        nbEnseignants++;
    }

    public String toString() {
        return super.toString() + "\n spécialité : " + specialite;
    }

    void ecrirePersonne() {
        System.out.println("Enseignant : " + toString());
    }

    static int nbEnseignants() {
        return nbEnseignants;
    }
} // Enseignant