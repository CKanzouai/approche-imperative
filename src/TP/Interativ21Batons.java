package TP;

import java.util.Scanner;
import java.util.Random;

public class Interativ21Batons {
    public static void main(String[] args) {
        int batons = 21;

        System.out.println("Allez choisi 1 ou 2 batons.");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (batons > 0) {
            System.out.println( "il reste "+ batons + " batons.");
            int tourUser;
            do {
                System.out.print("Combien de batons voulez-vous prendre ? ");
                tourUser = scanner.nextInt();
            } while (tourUser < 1 || tourUser > 2 || tourUser > batons);
            batons -= tourUser;
            if (batons == 0) {
                System.out.println("Vous avez perdu ! ");
                break;
            }
            int maxChoix = Math.min(batons, 2);
            int tourOrdi = random.nextInt(maxChoix) + 1;
            batons -= tourOrdi;
            System.out.println("L'ordinateur retire " + tourOrdi + " batons.");
            if (batons == 0) {
                System.out.println("Vous avez gagné !");
                break;
            }
        }
    }
}