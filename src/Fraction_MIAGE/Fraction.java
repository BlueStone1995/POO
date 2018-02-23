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
public class Fraction {

    private int num;
    private int den;

    public Fraction(int a, int b) {
        this.num = a;
        this.den = b;
        double fraction = a / b;
    }

    public Fraction plus(Fraction b) {
        Fraction solution = new Fraction(this.num * b.den + b.num * this.den, this.den * b.den);
        return solution;
    }

    public Fraction multi(Fraction a) {
        Fraction solution = new Fraction(this.num * a.num, this.den * a.den);
        return solution;
    }

    public Fraction divise(Fraction a) {
        Fraction solution = new Fraction(this.num * a.den, this.den * a.num);
        return solution;
    }

    public boolean isequal(Fraction a) {
        if(this.num == a.num && this.den == a.den)
            return true;
        else return false;
    }

    public void afficher() {
        System.out.println(this.num + " / " + this.den);
    }
}
