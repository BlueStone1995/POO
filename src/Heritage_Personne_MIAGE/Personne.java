/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heritage_Personne_MIAGE;

import java.util.Scanner;

/**
 *
 * @author Mbape
 */
public class Personne {

    static Scanner sc = new Scanner(System.in);

    private String nom;
    private String prenom;
    private int id;
    public Personne suivant;
    private static int compteur = 0;//Commun à tous les objets en private pour ne pas povoir le modifier et avoir l'unicité

    public Personne(String a, String b) {
        this.nom = a;
        this.prenom = b;
        this.id = compteur;
        compteur++;
        this.suivant = null;
    }
    
    public String getNom(){
        return nom;
    }
    
    public String getPrenom(){
        return prenom;
    }
    
    public int getId(){
        return id;
    }

    //Renvoie un String id, nom et prenom
    public String toString() { //Cette méthode remplace en soit le System.out.println(Personne p);
        return "Id : " + this.id + " | Nom : " + this.nom + " | Prénom : " + this.prenom;
    }

    //Ajoute une personne à la fin
    public void ajout(String nom, String prenom) {
        if (this.suivant == null) {
            Personne aAjouter = new Personne(nom, prenom);
            this.suivant = aAjouter;
        } else {
            this.suivant.ajout(nom, prenom);
        }
    }

    //Afficher la Personne suivante
    void afficherSuivant() {
        System.out.println(this.suivant.toString());
    }

    //Compte le nombre personnes suivants
    public int nbSuivant() {
        if (this.suivant == null) {
            return 0;
        } else {
            return this.suivant.nbSuivant() + 1;
        }
    }

    //Retire l'objet correspondant à l'index, exemple p1 -> p3 -> p4 retire p2
    //Renvoie true si tout va bien ou false si l'index dépasse le nbSuivant
    boolean retirer(int index) {
        Personne perso = this;
        Personne suitPerso = this.suivant;
            while (suitPerso.id < index) {
                perso = suitPerso;
                suitPerso = suitPerso.suivant;
            }
            if (suitPerso.id == index) {
                perso.suivant = suitPerso.suivant;
                return true;
            } else {
                return false;
            }
    }

}
