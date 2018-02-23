/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_MIAGE;

/**
 *
 * @author Mbape
 */
public class ListString implements ListeOrdonnable {

    private String[] tableau;
    private int taille;

    public ListString() {
        tableau = new String[1];
        taille = 0;
    }

    public void ajouter(String i) {
        if (taille == tableau.length) {
            String[] tableau2 = new String[taille * 2];
            for (int j = 0; j < taille; j++) {
                tableau2[j] = tableau[j];
            }
            tableau = tableau2;
        }
        tableau[taille] = i;
        taille++;
    }

    public boolean plusGrandQue(int i, int j) {
        if (i >= 0 && j >= 0 && i < taille && j < taille) {
            return true;
            //return  (tableau[i]).compareTo(tableau[j]);
        } else {
            return false;
        }
    }

    public int tailleListe() {
        return (taille);
    }

    public boolean egal(int i, int j) {
        if (i >= 0 && j >= 0 && i < taille && j < taille) {
            return (tableau[i] == tableau[j]);
        } else {
            return false;
        }
    }
    
}
