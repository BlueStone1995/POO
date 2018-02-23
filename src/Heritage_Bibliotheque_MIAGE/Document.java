package Heritage_Bibliotheque_MIAGE;


import Heritage_Bibliotheque_MIAGE.ListeDeDocuments;



public class Document {

	private String titre;
	private int numero;
	private static int cpt=0;
	private static ListeDeDocuments liste=new ListeDeDocuments();
	
	public Document(String t) {
		this.titre = t;
		this.numero=cpt;
		cpt++;
		liste.ajouter(this);
	}
	
	public Document(String t, int id) {
		this.titre = t;
		if(cpt<=id) {
			this.numero=id;
			cpt=id+1;
		}
		else {
			this.numero=cpt;
			cpt++;
		}
		liste.ajouter(this);
	}
	
	public static Document accesDocument(int num) {
		return liste.getDocument(num);
	}
	
	public String toString() {
		return "Document [titre=" + titre + ", numero=" + numero + "]";
	}

	public String getTitre() {
		return this.titre;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public static ListeDeDocuments getListe() {
		return liste;
	}
}
