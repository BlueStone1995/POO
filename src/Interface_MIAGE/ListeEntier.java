package Interface_MIAGE;

public class ListeEntier implements ListeOrdonnable {

    private int[] tableau;
    private int taille;

    public ListeEntier() {
        tableau = new int[1];
        taille = 0;
    }

    public void ajouter(int i) {
        if (taille == tableau.length) {
            int[] tableau2 = new int[taille * 2];
            for (int j = 0; j < taille; j++) {
                tableau2[j] = tableau[j];
            }
            tableau = tableau2;
        }
        tableau[taille] = i;
        taille++;
    }

    public boolean plusGrandQue(int i, int j) {
        if (i >= 0 && j >= 0 && i < taille && j < taille) {
            return (tableau[i] > tableau[j]);
        } else {
            return false;
        }
    }

    public int tailleListe() {
        return (taille);
    }

    public boolean egal(int i, int j) {
        if (i >= 0 && j >= 0 && i < taille && j < taille) {
            return (tableau[i] == tableau[j]);
        } else {
            return false;
        }
    }
}
