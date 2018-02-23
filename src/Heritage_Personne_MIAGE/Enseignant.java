/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heritage_Personne_MIAGE;

/**
 *
 * @author Mbape
 */
public class Enseignant extends Personne {
    private String labo;
    private int ufr;
    private String grade;
    
    public Enseignant(String nom, String prenom, String a, int b, String c){
        super(nom, prenom);//Toujour en première instruction
        this.labo = a;
        this.ufr = b;
        this.grade = c;
    }
     public String toString(){
        return (super.toString()+" | Labo : "+this.labo+" | Ufr : "+this.ufr+" | Grade : "+this.grade);
    }
     
     //Super peut etre utilisé comme this mais pour désigné les attributs de la classe mère
}
