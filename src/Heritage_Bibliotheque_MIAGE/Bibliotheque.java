package Heritage_Bibliotheque_MIAGE;

public class Bibliotheque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ListeDeDocuments liste = new ListeDeDocuments();
		liste.ajouter(new Document("Harry Potter"));
		liste.ajouter(new Document("Pokemon",2));
		liste.ajouter(new Document("GOT"));
		liste.ajouter(new Dictionnaire("Larousse", "fran�ais", 45));
		liste.ajouter(new Livre("DBZ", "Akira Toriyama", 105));
		liste.ajouter(new Dictionnaire("Dico", "anglais", 105));
		liste.ajouter(new Livre("One Piece", "Eiichiro Oda", 203));
		liste.ajouter(new Dictionnaire("DicoLoin",36,"japonais",899));*/
		
		Document d1 = new Document("Harry Potter");
		Document d2 = new Document("Pokemon",2);
		Document d3 = new Document("GOT");
		Document d4 = new Dictionnaire("Larousse", "fran�ais", 45);
		Document d5 = new Livre("DBZ", "Akira Toriyama", 105);
		Document d6 = new Dictionnaire("Dico", "anglais", 105);
		Document d7 = new Livre("One Piece", "Eiichiro Oda", 203);
		Document d8 = new Dictionnaire("DicoLoin",36,"japonais",899);
		
		System.out.println(Document.accesDocument(d7.getNumero())+"\n");
		
		ListeDeDocuments liste = Document.getListe();
		
		System.out.println("LISTE.TOSTRING() : \n" + liste.toString());
		System.out.println("LISTE.GETDOCUMENT(5) : \n" + liste.getDocument(5) + "\n");
		
		ListeDeDocuments liste2 = liste.touslesDicos();
		System.out.println("LES DICOS : \n"+liste2);
		System.out.println("LES AUTEURS : \n"+liste.touslesAuteurs());
	}

}
