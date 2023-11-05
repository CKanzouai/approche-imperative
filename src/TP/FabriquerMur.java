package TP;

public class FabriquerMur {
    public static void main(String[] args) {

        verifier(3, 1, 8, true);
        verifier(3, 1, 9, false);
        verifier(3, 2, 10, true);
        verifier(3, 2, 8, true);
        verifier(3, 2, 9, true);
        verifier(6, 1, 11, true);
        verifier(6, 0, 11, false);
        verifier(1, 4, 11, true);
        verifier(0, 3, 10, true);
        verifier(1, 4, 12, false);
        verifier(3, 1, 7, true);
        verifier(1, 1, 7, false);
        //System.out.println(fabriquerMur(2,1,9));
    }

    public static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
        int maxNbBig = nbBig * 5;

        int resteLongeur = longueur - maxNbBig;
        boolean resultat = false;

        if (resteLongeur <= nbSmall) {
            resultat = true;
        }

        int resteNbBig = resteLongeur / 5;
        int resteNbSmall = resteLongeur % 5;

        if (resteNbBig <= nbBig && resteNbSmall <= nbSmall) {
            resultat = true;
        }

        return resultat ;
    }


    private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {

        if (!fabriquerMur(nbSmall, nbBig, longueur) == b ) {
            System.out.println(b);
            System.out.println(fabriquerMur(nbSmall, nbBig, longueur));
            System.err.println("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") NON passant.");
            System.out.println();
        } else {
            System.out.println(b);
            System.out.println(fabriquerMur(nbSmall, nbBig,longueur));
            System.out.println();
            System.err.println("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ")  passant.");
        }
    }


}