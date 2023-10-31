import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(2+4);
        int cico=4;
        System.out.println(cico);
        /**
         *
         */
        boolean kkk = false;
        if (kkk==true){
            return;
        }
        int in = 10000;
        byte bt = 14;
        short sh = 123;
        long lg = 123456790;
        System.out.println(in);
        System.out.println(bt);
        System.out.println(sh);
        System.out.println(lg);

        float fl = 2.5f;
        double db = 2.5;
        System.out.println(fl +" " + db);
        String stri = "chimo";
        System.out.println(stri);
        /**
         *         private int nbre;
         *         protected float taux;
         *         public double niveau;
         *         public static String tranformation;
          */
        double distance;
        int converstion;
        distance = 2345.77;
        converstion = (int)distance;
        System.out.println(converstion);
        // Initialisation et declaration de la constante
        final double TAUXTVA = 1.196;
        int prixHT = 10;
        double prixTTC;
        prixTTC = TAUXTVA*prixHT;
        System.out.println(prixTTC);
        // Enumeration
        enum Mois{
            janvier,
            fev,
            mars,
            avril,
            mai,
            juin,
            juillet,
            aout,
            sept,
            oct,
            novembre,
            decembre
        }
        Mois janvier = Mois.janvier;
        System.out.println(janvier);
        //TABLEAUX
        int[] tab1;
        tab1 = new int[4];
        tab1 [0] = 22;
        tab1 [1] = 23;
        tab1 [2] = 24;
        tab1 [3] = 25;

        for (int i= 0; i<tab1.length; i++){
            System.out.println(tab1[i]);
        }

        // tableau a plusieur dimension : tableau contenan dautres tab

        /**
         *
          */
        int[][] montab = new int[3][2];
        montab[0][0] = 1122;
        montab[0][1] = 1124;
        montab[1][0] = 1128;
        montab[1][1] = 1129;
        montab[2][0] = 1127;
        montab[2][1] = 1123;
        for (int i = 0; i<3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(montab[i][j]);
            }

        }

            // methodes predifinies des tabs
            int[] chicho = {234, 453, 674, 245, 456};
            Arrays.sort(chicho);
            System.out.println(Arrays.toString(chicho));
        System.out.println(chicho.length);
            //copie un tab

            int[]copietab = Arrays.copyOf(chicho, 5);
            System.out.println("voici la copie"     + Arrays.toString(copietab));

        int a =     053;
        System.out.println(a);
        }

   }
