package TP;

import java.util.Scanner;

public class InteractifTableMulti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int nb;
        int i = 0;
        while ( i  >= 0) {
            System.out.println("entrer un nombre");
            nb = scanner.nextInt() ;

            System.out.println("le nombre que vous avez entré est :" + nb);

            if (nb >= 1 && nb <= 10){
                System.out.println("Le nombre appartient à [1, 10].\n");
                System.out.println("voici sa table de multiplication : \n");
                for (int j = 1; j<=10; j++){
                    System.out.println(nb + " * " + j + " = " + (nb * j));
                }

                break;
            }else {
                System.out.println("Le nombre n'est pas dans la plage [1, 10]. Réessayez.");
            }
            //i++;

        }scanner.close();
    }
}
