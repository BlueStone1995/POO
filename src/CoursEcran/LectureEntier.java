/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoursEcran;

/**
 *
 * @author Mbape
 */
import java.io.*;

public class LectureEntier {

    public static void main(String[] args) {
        //On commmence à déclarer un objet lecteur sur le clavier
        //Le clavier est associé à la variable System.in
        //Un InputStreamReader (lecteur sur un flux) est crée dessus
        //Puis on ajoute une couche BufferedReader nécessaire pour lire des infos par ligne
        
/*Cours Prof :
        lecteurClavier est un objet de type BufferedReader. Il est instancié par le mot clé new -> exécute le constructeur de la classe
        Initialisation :
            ->Constructeur : méthode particulière qui a le même nom que la classe
        
*/
        BufferedReader lecteurClavier = new BufferedReader(new InputStreamReader(System.in));//System : classe et in : attribut
        int valeur = 0;
        String chaineLue;

        try {
            System.out.print("Entrer un entier : ");
            chaineLue = lecteurClavier.readLine();
            //Conversion de la chaine en entier
            valeur = Integer.parseInt(chaineLue);
        }
        catch(Exception e){//On exécute ca si il y a une erreur 
            System.out.println("Erreur d'E/S "+e.getMessage());//System : classe out : attribut static et println : méthode static 
        }
        System.out.println("La valeur est : "+valeur);
    }

}
