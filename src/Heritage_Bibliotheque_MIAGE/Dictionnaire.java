package Heritage_Bibliotheque_MIAGE;

public class Dictionnaire extends Document {
	
	private String langue;
	private int nbTomes;
	
	public Dictionnaire(String t, String l, int nt) {
		super(t);
		this.langue = l;
		this.nbTomes = nt;
	}
	
	public Dictionnaire(String t,int num, String l, int nt) {
		super(t,num);
		this.langue = l;
		this.nbTomes = nt;
	}

	public String getLangue() {
		return this.langue;
	}

	public int getNbTomes() {
		return this.nbTomes;
	}

	@Override
	public String toString() {
		return "Dictionnaire [langue=" + langue + ", nbTomes=" + nbTomes + ", titre=" + this.getTitre() + ", numero=" + this.getNumero() + "]";
	}

}

