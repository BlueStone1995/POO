/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fraction_MIAGE;

/**
 *
 * @author Mbape
 */
import Fraction_MIAGE.Fraction;

public class TestFraction {
    public static void main (String[] args){
        Fraction f = new Fraction(2, 3);
        Fraction g = new Fraction(3, 5);
        Fraction som = f.plus(g);
        som.afficher();      
    }
}
