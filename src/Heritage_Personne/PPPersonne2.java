package Heritage_Personne;

public class PPPersonne2 { //Programme Principal Personne 2
    public static void main(String[] args) {
        Personne p;
        p = new Secretaire("Dupond", "Chantal", "rue des mimosas", "Rennes", "A123");
        p.ecrirePersonne(); // ecrirePersonne() de Secretaire
        p = new Enseignant("Martin", "Michel", "bd St-Antoine", "Rennes", "Maths");
        p.ecrirePersonne(); // ecrirePersonne() de Enseignant
        p = new Etudiant("Martin", "Guillaume",
                "bd St-Jacques", "Bordeaux", "licence info");
        p.ecrirePersonne(); // ecrirePersonne() de Etudiant
        p = new Etudiant("Dufour", "Stéphanie", "rue des saules", "Lyon", "DUT info");
        p.ecrirePersonne(); // ecrirePersonne() de Etudiant


        Personne.nbPersonnes();

        Etudiant et1 = (Etudiant) p; // OK p est un Etudiant
        System.out.println("Diplôme en cours : " + et1.diplomeEnCours());

        // teste si p est un objet de la classe Etudiant
        if (p instanceof Etudiant) {
            System.out.println("p est de la classe Etudiant");
        }
    } // main
} // PPPersonne2
