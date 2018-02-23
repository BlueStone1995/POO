/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ecran_MIAGE;

/**
 *
 * @author Mbape
 */
public class Ecran {

    private int nbligne;
    private int nbcolonne;
    private char[][] ecran;

    public Ecran(int a, int b) {
        this.nbligne = a;
        this.nbcolonne = b;
        this.ecran = new char[a][b];
        for (int i = 0; i < this.nbligne; i++) {
            for (int j = 0; j < this.nbcolonne; j++) {
                this.ecran[i][j] = ' ';
            }
        }
    }

    public void ecrire(int a, int b, char c) {
        this.ecran[a][b] = c;
    }
    
    public void effacer(int a, int b){
        this.ecran[a][b] = ' ';
    }

    public void afficher() {
        for (int i = 0; i < this.nbligne; i++) {
            for (int j = 0; j < this.nbcolonne; j++) {
                System.out.print(ecran[i][j]);
            }
            System.out.println();
        }
    }
    
    
}
