package TP;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        Random random = new Random();
        int nb;
        Scanner scanner = new Scanner(System.in);
        int nombreAleatoire = random.nextInt(100) +1;
        //System.out.println(nombreAleatoire);
        int nCoups =0;
        while (true){
            System.out.println("Veuillez saisir un nombre");
            nb = scanner.nextInt();
            nCoups++;
            if (nombreAleatoire < nb){
                System.out.println("il est au-dessus du nombre");

            }else if (nombreAleatoire > nb){
                System.out.println("il est en dessous du nombre");
            }else {
                System.out.println("Bravo, vous avez trouvé en: " +nCoups + " fois");
                break;
            }

        }



    }
}
