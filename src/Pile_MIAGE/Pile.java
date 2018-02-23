package Pile_MIAGE;

import java.util.Scanner;

/**
 *
 * @author Mbape
 */
public class Pile {

    private int tabSize;
    private int[] tabpile;
    private int hautpile;

    static Scanner sc = new Scanner(System.in);

    //Instanciation de la classe Pile
    public Pile(int a) {
        this.tabSize = a;
        this.tabpile = new int[a];
        this.hautpile = 0;
    }
    
    Pile(int taille, Pile p){
        this.tabSize = taille;
        for(int i=0; i<this.tabSize && i<p.tabSize; i++){
            this.tabpile[i] = p.tabpile[i];
        }
    }

    public boolean estvide() {
        return this.tabpile[0] == 0;
    }

    public boolean estpleine() {
        return this.tabpile[this.tabpile.length - 1] != 0;
    }

    public void empile(int a) {
        this.tabpile[hautpile] = a;
        hautpile++;      
    }

    public void depile() {
        this.tabpile[hautpile-1] = 0;
        hautpile--;
    }
   
}
