package TP;

import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        int nb;
        int i = 0;
        while ( i  >= 0) {
            System.out.println("entrer un nombre");
            nb = scanner.nextInt() ;

            System.out.println("le nombre que vous avez entré est :" + nb);

            if (nb >= 1 && nb <= 10){
                System.out.println("Le nombre apparteint à [1, 10].");
                break;
            }else {
                System.out.println("Le nombre n'est pas dans la plage [1, 10]. Réessayez.");
            }
            //i++;

        }scanner.close();




    }
}
