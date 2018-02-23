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
public class Etudiant extends Personne {
    Scanner sc = new Scanner(System.in);
    private int annee;
    private String cursus;
    
    public Etudiant(String nom, String prenom, int b, String c){
        super(nom,prenom);
        this.annee = b;
        this.cursus = c;
    }
    
    public String toString(){
        return (super.toString()+" | Année : "+this.annee+" | Cursus : "+this.cursus);
    }
    
}
