package Heritage_Personne;

public class PPPersonne {

    public static void main(String[] args) {


        Secretaire chantal = new Secretaire("Dupond", "Chantal", "rue des mimosas", "Rennes", "A123");
        chantal.ecrirePersonne();

        Enseignant michel = new Enseignant("Martin", "Michel", "bd St-Antoine", "Rennes", "Maths");
        michel.ecrirePersonne();

        Etudiant e1 = new Etudiant("Martin", "Guillaume", "bd St-Jacques", "Bordeaux", "licence info");
        e1.ecrirePersonne();

        Etudiant e2 = new Etudiant("Dufour", "Stéphanie", "rue des saules", "Lyon", "DUT info");
        e2.ecrirePersonne();

        Personne.nbPersonnes(); // méthode static

        System.out.println("\n\nAprès modification :");
        chantal.modifierPersonne("rue des sorbiers", "Nantes");
        michel.modifierPersonne("rue des lilas", "Rennes");

    } // main
}//PPPersonne
