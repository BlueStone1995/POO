package Heritage_Bibliotheque_MIAGE;

public class ListeDeDocuments {

	private static int taille=1;
	private Document[] tableau;
	
	public ListeDeDocuments() {
		tableau = new Document[taille];
	}
	
	public boolean ajouter(Document d) {
		if(d.getNumero()>=taille) {
			taille=d.getNumero()*2;
			Document[] tmp=new Document[taille];
			
			for(int i=0; i<this.tableau.length;i++)
				tmp[i]=this.tableau[i];
			
			this.tableau = new Document[taille];
			this.tableau=tmp;
		}
		try {
			this.tableau[d.getNumero()]=d;
			return true;
		}
		catch(Exception e) {
			System.out.println("Probl�me de taille");
			return false;
		}
	}
	
	public Document getDocument(int num) {
		if(num<this.tableau.length)
			return this.tableau[num];
		return null;
	}
	
	public String touslesAuteurs() {
		String res = "";
		for(Document d : this.tableau) {
			if(d instanceof Livre)
				res+=((Livre) d).getAuteur()+"\n";
		}
		return res;
	}

	public ListeDeDocuments touslesDicos() {
		ListeDeDocuments dictionnaires = new ListeDeDocuments();
		for(Document d : this.tableau) {
			if(d instanceof Dictionnaire)
				dictionnaires.ajouter(d);
		}
		return dictionnaires;
	}

	public String toString() {
		String res="";
		for(Document d : this.tableau) {
			if(d!=null)
				res+=d+"\n";
		}
		return res;
	}
}
