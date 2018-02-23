/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoursPile;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Mbape
 */
public class LectureClavier {

    static BufferedReader fe = new BufferedReader(new InputStreamReader(System.in));

    //Lire une chaine au clavier 
    public static String lireChaine() {
        // lecture tamponnée de caractères au clavier;
        // lecture tamponnée permet readline()
        String reponse = "";
        try {
            reponse = fe.readLine();
        } catch (Exception e) {
            System.out.println("Erreur lireChaine");
            System.exit(1);
        }
        return reponse;
    }

    //lire un entier au clavier
    public static int lireEntier() {
        String reponse = "";
        int n = 0;
        boolean luEntier = false;
        while (!luEntier) {
            try {
                reponse = fe.readLine();
                n = Integer.parseInt(reponse);
                luEntier = true;
            } catch (Exception e) {
                System.out.print("Valeur non entière, " + "\nretaper une valeur entière");
            }

        }
        return n;
    }
}
