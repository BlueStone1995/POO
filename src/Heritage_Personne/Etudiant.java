package Heritage_Personne;

public class Etudiant extends Personne {

    private String diplomeEnCours;
    private static int nbEtudiants = 0; // nombre d’Etudiant

    Etudiant(String nom, String prenom, String rue, String ville, String diplomeEnCours) {
        super(nom, prenom, rue, ville); // appel du constructeur Personne
        this.diplomeEnCours = diplomeEnCours;
        nbEtudiants++;
    }

    public String toString() {
        return super.toString() + "\n Diplome en cours : " + diplomeEnCours;
    }

   /* void ecrirePersonne() {
        System.out.println("Etudiant : " + toString());
    }
*/
    public String diplomeEnCours() {
        return diplomeEnCours;
    }

    static int nbEtudiants() {
        return nbEtudiants;
    }
} // Etudiant

