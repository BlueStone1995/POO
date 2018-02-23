package Interface_MIAGE;

public class OrdonnerListe {

    public static int[] tri(ListeOrdonnable l) {
        int taille = l.tailleListe();
        int[] tableauTrie = new int[taille];
        int min = 0; //indice du plus petit �l�ment
        int max = 0;

        for (int i = 0; i < taille; i++) {
            if (l.plusGrandQue(i, max)) {
                max = i;
            }
        }
        System.out.println("max : " + max);

        min = 0;
        for (int i = 0; i < taille; i++) {
            if (l.plusGrandQue(min, i)) {
                min = i;
            }
        }
        tableauTrie[0] = min;

        for (int j = 1; j < taille; j++) {
            min = max;
            for (int i = 0; i < taille; i++) {
                if (l.plusGrandQue(min, i) && l.plusGrandQue(i, tableauTrie[j - 1])) {
                    min = i;
                }
                if (l.plusGrandQue(min, i) && l.egal(i, tableauTrie[j - 1])) {
                    if (i > tableauTrie[j - 1]) {
                        min = i;
                    }
                }
            }
            System.out.println("min : " + min);
            tableauTrie[j] = min;
        }
        return (tableauTrie);
    }
}
