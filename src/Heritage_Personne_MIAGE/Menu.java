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
public class Menu {

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        //Initialisation 
        System.out.println("Entrer le nom et prénom de la personne n°0 : ");
        Personne p0 = new Personne(sc.nextLine(), sc.nextLine());

        //Menu
        System.out.println("Saisir le numéros corespondant à votre requète : ");
        int r = 0;
        while (r != 4) {
            System.out.println("1 : ajouter une Personne | 2 : retirer | 3 : liste | 4 : exit ");
            r = sc.nextInt();

            //Ajouter 
            if (r == 1) {
                System.out.println("Entrer nom et prénom de la personne : ");
                sc.nextLine();//On vide la ligne avant d'en lire une autre
                p0.ajout(sc.nextLine(), sc.nextLine());
            }

            //Retirer
            if (r == 2) {
                System.out.println("Entrer l'identifiant de la personne à retirer : ");
                int index = sc.nextInt();
                System.out.println("La personne d'identifiant " + index + " a été retiré ?");
                System.out.println(p0.retirer(index));
            }

            //Liste
            if (r == 3) {
                System.out.println("Affichage liste des personnes : ");
                System.out.println(p0.toString());
                Personne perso = p0;
                while (perso.suivant != null) {
                    perso.afficherSuivant();
                    perso = perso.suivant;
                }
            }
        }
        System.out.println("Merci pour votre participation et au revoir");
    }

}
