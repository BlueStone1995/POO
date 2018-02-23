package CoursPile;

//Programme Principal de la Pile
public class PPPile {

    static int menu() {
        System.out.print(
                "\nGestion d'une Pile\n\n"
                + "0 - Fin\n"
                + "1 - Initialisation de la Pile\n"
                + "2 - La pile est elle vide ?\n"
                + "3 - Insertion dans la pile\n"
                + "4 - Retrait dans la pile\n"
                + "5 - Vidage de la pile\n"
                + "6 - Listage de la pile\n"
                + "Votre choix ? "
        );
        return LectureClavier.lireEntier();
    }

    public static void main(String[] args) {
        Pile pile1 = new Pile(5);
        int valeur;
        boolean fini = false;

        while (!fini) {
            switch (menu()) {
                case 0: //Fin
                    fini = true;
                    break;

                case 1: //Initialisation
                    System.out.print("Taille de la pile ? ");
                    int taille = LectureClavier.lireEntier();
                    System.out.print("Nom de la pile ? ");
                    String nom = LectureClavier.lireChaine();
                    pile1 = new PileNom(taille, nom);
                    System.out.println("Initialisation d'une pile vide");
                    break;

                case 2: //La pile est elle vide ? 
                    if (pile1.pileVide()) {
                        System.out.println("La pile est vide");
                    } else {
                        System.out.println("La pile n'est pas vide");
                    }
                    break;

                case 3: //Empiler 
                    System.out.println("Entrer valeur à empiler : ");
                    valeur = LectureClavier.lireEntier();
                    pile1.empiler(valeur);
                    break;

                case 4: //Depiler
                    valeur = pile1.depiler();
                    System.out.println("La valeur dépilée : " + valeur);
                    break;

                case 5: //Vidage Pile
                    pile1.viderPile();
                    break;

                case 6: //Lister Pile
                    
                    pile1.listerPile();
                    break;
            }//switch
        }//while
    }//main   
}//classe PPPile
