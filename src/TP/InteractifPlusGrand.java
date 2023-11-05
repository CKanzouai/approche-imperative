package TP;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
       // int nb;
        Scanner scanner = new Scanner(System.in);
       // System.out.println("Veuillez saisir 10 nombre : ");
        int max = 0;
        int[] tab = new int[10];
        //System.out.println(" Voici les 10 nombres suivants :");
        for (int i = 0; i<10; i++ ){
            System.out.println("Entrer le nombre numéro °"  + (i+1));
            tab[i] = scanner.nextInt();
            //System.out.println(Arrays.toString(tab));

        }
        for (int i = 0; i<10; i++){
            if (tab[i] > max){
                max = tab[i];
            }
        }
        System.out.println("le plus grand nombre est : "+ max);

    }
}
