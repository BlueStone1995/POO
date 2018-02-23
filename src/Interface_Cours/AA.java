package Interface_Cours;

class AA extends A implements Modifiable {

    private String nom;

    AA(int taille, String nom) {
        super(taille);
        this.nom = nom;
    }

    void incrementer() {
        taille++;
    }

    public String toString() {
        return "AA : " + super.toString() + " , AA  : " + taille;
    }

    public void zoomer(int n) {
        if (n < MIN) n = MIN;
        if (n > MAX) n = MAX;
        if (n == 0) n = 1;
        // n > 0, on multiplie par n
        // n < 0, on divise par |n|
        taille = n > 0 ? taille * n : (int) (taille / (double) -n);
    }
}
