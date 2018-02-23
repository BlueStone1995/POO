/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pile_MIAGE;

import java.util.Scanner;

/**
 *
 * @author Mbape
 */
public class TestPile {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Entrer la taille de votre pile : ");
        Pile duracell = new Pile(sc.nextInt());
        duracell.empile(4);
        System.out.println("Ma pile est vide ? : " + duracell.estvide());
        System.out.println("Ma pile est pleine ? : " + duracell.estpleine());
        duracell.depile();
        System.out.println("Ma pile est vide ? : " + duracell.estvide());
        System.out.println("Ma pile est pleine ? : " + duracell.estpleine());

    }
}
