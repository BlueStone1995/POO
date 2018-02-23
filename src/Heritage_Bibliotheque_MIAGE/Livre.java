package Heritage_Bibliotheque_MIAGE;

public class Livre extends Document {

	private String auteur;
	private int nbPages;
	
	public Livre(String t, String a, int np) {
		super(t);
		this.auteur = a;
		this.nbPages = np;
	}
	
	public Livre(String t,int num, String a, int np) {
		super(t,num);
		this.auteur = a;
		this.nbPages = np;
	}

	public String toString() {
		return "Livre [auteur=" + auteur + ", nbPages=" + nbPages + ", titre=" + this.getTitre() + ", numero=" + this.getNumero() + "]";
	}
	
	public String getAuteur() {
		return this.auteur;
	}

	public int getNbPages() {
		return this.nbPages;
	}

}
