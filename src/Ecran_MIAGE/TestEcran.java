/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ecran_MIAGE;

import java.util.Scanner;
import Ecran_MIAGE.Ecran;

/**
 *
 * @author Mbape
 */
public class TestEcran {

    static Scanner sc = new Scanner(System.in);

    /*Tableau de 2 dimension -> 1 dimension :
    tab[ligne][colonne] = tab[ligne * nbColonne + colonne]
    */
    
    public static void main(String[] args) {
        Ecran c = new Ecran(4,20);
        c.ecrire(0, 0, 'P');
        c.ecrire(0, 1, 'I');
        c.ecrire(0, 2, 'E');
        c.ecrire(0, 3, 'R');
        c.ecrire(0, 4, 'R');
        c.ecrire(0, 5, 'E');
        c.afficher();
        c.effacer(0, 1);
        c.afficher();
    }

}
