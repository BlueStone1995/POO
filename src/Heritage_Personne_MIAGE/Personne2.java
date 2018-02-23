package Heritage_Personne_MIAGE;


import java.util.Scanner;

public class Personne2 {

    private String nom;
    private String prenom;
    private int id; //unique pour chaque personne
    public Personne2 suivant;
    static int compteur = 0;

    public Personne2(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.id = compteur;
        compteur++;
    }

    public int getID() {
        return this.id;
    }

    @Override
    public String toString() {
        return "La personne s'appelle " + this.nom + " " + this.prenom + " et possède l'dentifiant " + this.id;
       
    }

    public void ajout(String nom, String prenom) {
        if (suivant == null) {
            suivant = new Personne2(nom, prenom);
        } else {
            this.suivant.ajout(nom, prenom); //récursive tant que suivant != 0
        }
    }

    public int nbSuivant() {
        if (this.suivant == null) {
            return 0;
        } else {
            return suivant.nbSuivant() + 1;
        }
    }

    public boolean retirer(int index) {
        for (int i = 0; i < nbSuivant(); i++) {

            if (i == index) {
                this.suivant = this.suivant.suivant;
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public void afficherSuivants() {
        if (suivant == null) {
            System.out.println(this);//this correspond au toString de la sous classe de Personne
        } else {
            System.out.println(this);
            suivant.afficherSuivants();

        }
    }

    public void saisirSuivant() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir un nom");
        String n = sc.nextLine();
        System.out.println("saisir un prénom");
        String p = sc.nextLine();
        ajout(n, p);

    }
}
