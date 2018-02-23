package Interface_Cours;

class BB extends B implements Modifiable {

    private String chaine;

    BB(int numero, String chaine){
        super(numero);
        this.chaine=chaine;
    }

    public String toString() {
        return "BB : "+super.toString()+" , BB  : "+chaine;
    }

    public void zoomer(int n) {
        if (n < MIN) n = MIN;
        if (n > MAX) n = MAX;
        if (n ==0) n = 1;
        // n > 0, on multiplie par 2*n
        // n < 0, on divise par 2*|n|
        numero = n > 0 ? numero*2*n : (int)(numero / (double) (-2*n));
    }
}
