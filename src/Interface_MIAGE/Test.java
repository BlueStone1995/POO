package Interface_MIAGE;

public class Test {

    public static void main(String[] args) {
        ListeEntier l = new ListeEntier();

        l.ajouter(3);
        l.ajouter(2);

        //System.out.println(l.plusGrandQue(0, 1));
        //System.out.println(l.plusGrandQue(1, 0));
        //System.out.println(l.tailleListe());
        ListeEntier l2 = new ListeEntier();

        l2.ajouter(2);
        l2.ajouter(3);
        l2.ajouter(7);
        l2.ajouter(1);
        l2.ajouter(2);

        int[] t = OrdonnerListe.tri(l2);

        System.out.println(t[0]);
        System.out.println(t[1]);
        System.out.println(t[2]);
        System.out.println(t[3]);
        System.out.println(t[4]);
        
        ListString l3 = new ListString();
        l3.ajouter("abc");
        l3.ajouter("aab");
        l3.ajouter("ze");
        l3.ajouter("rtf");
        l3.ajouter("aaa");
        int[] tol = OrdonnerListe.tri(l);
        System.out.println(tol[0]);
        System.out.println(tol[1]);
        System.out.println(tol[2]);
        System.out.println(tol[3]);
        System.out.println(tol[4]);
    }
}
