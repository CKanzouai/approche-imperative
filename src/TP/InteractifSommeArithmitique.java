package TP;

import java.util.Scanner;

public class InteractifSommeArithmitique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb;

        System.out.print("Veuillez entrer un nombre : ");
        nb = scanner.nextInt();
        int som=0;
        for (int i = 1; i<=nb; i++ ){
            som += i;

        }
        System.out.println("La somme des entiers de 1 à " + nb + " est : " + som);

    }
}
