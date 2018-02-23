package CoursPile;

/**
 *
 * @author Mbape
 */
public class Pile {

    private int sommet;//Sommet case est la dernière case de ma pile
    private int[] element;

    private void erreur(String mes) {
        System.out.println("***erreur : " + mes);
    }

    public Pile(int max) {
        //Pile Vide
        this.sommet = -1;
        this.element = new int[max];
    }

    public boolean pileVide() {
        return this.sommet == -1;
    }

    public void empiler(int v) {
        if (this.sommet < this.element.length - 1) {
            this.sommet++;
            this.element[sommet] = v;
        } else {
            System.out.println("Pile saturée");
        }
    }

    //Retourne la valeur de l'élement dépiler
    public int depiler() {
        int v = 0;
        if (!this.pileVide()) {
            v = this.element[sommet];
            sommet--;
        } else {
            erreur("Pile vide");
        }
        return v;
    }

    public void viderPile() {
        this.sommet = -1;
    }

    public void listerPile() {
        if (this.pileVide()) {
            System.out.println("Pile Vide");
        } else {
            System.out.println("Taille de la pile : " + this.element.length);
            for (int i = 0; i < this.element.length; i++) {
                System.out.print(this.element[i] + " ");
            }
            System.out.println();
        }
    }
}
