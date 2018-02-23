package Interface_Cours;

public class PPInterface {

    public static void main(String[] args) {
// un tableau de Modifiable contenant des AA ou des BB

        Modifiable[] tabMod = {
                new AA(10, "b1"),
                new AA(20, "b2"),
                new BB(30, "b3"),
                new BB(50, "b3")
        };

        // on déclenche la méthode zoomer() pour les éléments du tableau
        // les AA sont divisés par 2
        // les BB sont divisés par 4
        for (int i = 0; i < tabMod.length; i++) {
            tabMod[i].zoomer(-2); // -2 : réduction
        }

        for (int i = 0; i < tabMod.length; i++) {
            //System.out.println(tabMod[i].toString());
            System.out.println(tabMod[i]);
        }

        // erreur : un Modifiable ne peut pas accéder à incrementer()
        for (int i = 0; i < tabMod.length; i++) {
            // erreur : incrementer n’est pas une méthode
            // de la classe Modifiable
            // tabMod[i].incrementer();
            System.out.println(tabMod[i].getClass().getName());
        }

        Modifiable m1 = tabMod[0]; //m1 est de type AA
        ((AA) m1).incrementer(); // il faut effectuer un transtypage
        System.out.println("m1 : " + m1);

        Modifiable m2 = tabMod[2]; //m2 est de type BB
        //((AA) m2).incrementer(); //exception ClassCastException
        System.out.println("m2 : " + m2);

    } // main
} // PPInterface

