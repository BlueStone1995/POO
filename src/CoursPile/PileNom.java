/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoursPile;

/**
 *
 * @author bluestone
 */
public class PileNom extends Pile {
    private String nomPile;
    
    PileNom(int max, String nomPile){
        super(max);
        this.nomPile = nomPile;
    }
    
    public void listerPile(){
        System.out.println("\nNom pile  : "+nomPile);
    }
    
}
