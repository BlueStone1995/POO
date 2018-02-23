
package CoursEcran;

//Simulation d'un Ecran
class Ecran {

    //Constante symbolique pour les couleurs noir et blanc
    static final int NOIR = 0; //final pour dire que c'est un attribut non modifiable
    static final int BLANC = 15;

    //Constantes symbolique pour description
    static final int GAUCHE = 1;
    static final int HAUT = 2;
    static final int DROITE = 3;
    static final int BAS = 4;

    //Attributs de l'objet sont privés
    private int nbLig;
    private int nbCol;
    private int numLigCrayon;
    private int numColCrayon;
    private int couleurCrayon;
    private char[][] zEcran;//Reference sur le tableau à 2D

    Ecran(int nbLig, int nbCol) {
        this.nbLig = nbLig;
        this.nbCol = nbCol;
        zEcran = new char[nbLig][nbCol];
        changerCouleurCrayon(NOIR);
        crayonEn(nbLig / 2, nbCol / 2);
        effacerEcran();
    }

    void effacerEcran() { //Mettre l'écran en blanc
        for (int i = 0; i < nbLig; i++) {
            for (int j = 0; j < nbCol; j++) {
                zEcran[i][j] = ' ';
            }
        }
    }

    void crayonEn(int numLigCrayon, int numColCrayon) {
        this.numLigCrayon = numLigCrayon;
        this.numLigCrayon = numColCrayon;
    }

    void changerCouleurCrayon(int couleurCrayon) {//Change la couleur du crayon compris entre 0 et 15
        if ((couleurCrayon >= 0) && (couleurCrayon <= 15)) {
            this.couleurCrayon = couleurCrayon;
        }
    }
    
    void ecrirePixel(int nl, int nc){ //Ecrit un caractère au (nbl, nbc) en fonction de ma couleur crayon
        String couleurs = "*123456789ABCDE."; //16 couleurs de 0 à 15
        if( (nl>=0) && (nl<nbLig) && (nc>=0) && (nc<nbCol)){
            zEcran[nl][nc] = couleurs.charAt(couleurCrayon); //Prend couleur correspondand au chiffre tapé
        }
    }
    
    void ecrireMessage(int nl, int nc, String mes){
        for(int i=0; i<mes.length(); i++){ //On parcours le message
            if( (nl>=0) && (nl<nbLig) && (nc>=0) && (nc<nbCol)){ //Vérifie qu'on depasse pas l'écran
                zEcran[nl][nc] = mes.charAt(i);
                nc++;
            }//if
        }//for
    }
    
    void tracerCadre(){ //Tracer cadre autour de l'écran
        for(int nc=0; nc<nbCol; nc++){
            zEcran[0][nc] = '-'; //Haut de l'écran
            zEcran[nbLig-1][nc] = '-'; //Bas de l'écran
        }
        for(int nl = 0; nl<nbLig; nl++){
            zEcran[nl][0] = '|'; //Côté gauche de l'écran
            zEcran[nl][nbCol-1] = '|'; //Côté droit de l'écran
        }
    }
    
    void avancer(int d, int n){ //Avancer dans la direction d de n caractère
        switch(d){
            case DROITE:
                for(int i=numColCrayon; i< numColCrayon+n; i++){
                    ecrirePixel(numLigCrayon, i);
                }
                numColCrayon += n-1;
                break;
                
            case GAUCHE:
                for(int i=numColCrayon; i>numColCrayon-n; i--){
                    ecrirePixel(numLigCrayon, i);
                }
                numColCrayon += -n+1;
                break;
                
            case BAS:
                for(int i=numLigCrayon; i<numLigCrayon+n; i++){
                    ecrirePixel(i, numColCrayon);
                }
                numLigCrayon += n-1;
                break;
                
            case HAUT:
                for(int i=numLigCrayon; i>numLigCrayon-n; i--){
                    ecrirePixel(i, numColCrayon);
                }
                numLigCrayon += -n+1;
                break;
        }//switch
    }
    
    void afficherEcran(){
        for(int i=0; i<nbLig; i++){
            for(int j=0; j<nbCol; j++){
                System.out.print(zEcran[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
    
    //Tracer rectangle défini par 2 points Coint Superieur Gauche (CSG) et Coint Inferieur Droit
    void rectangle(int xCSG, int yCSG, int xCID, int yCID){
        int longeur = xCID - xCSG+1;
    }
}
