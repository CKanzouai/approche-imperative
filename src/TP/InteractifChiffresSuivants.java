package TP;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb;

        System.out.println("Veuillez saisir un nombre : ");
        nb = scanner.nextInt();
        System.out.println(" Voici les 10 nombres suivants :");
        for (int i = 1; i<=10; i++ ){
            System.out.println(nb + i);
        }
    }
}
