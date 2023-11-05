package TP;

import java.util.Scanner;

public class InteractifFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le rang N dans la suite de Fibonacci : ");
        int N = scanner.nextInt();

        int a = 0;
        int b = 1;
        int resultat = 0;

        if (N <= 0) {
            resultat = 0;
        } else if (N == 1) {
            resultat = 1;
        } else {
            for (int i = 2; i <= N; i++) {
                resultat = a + b;
                a = b;
                b = resultat;
            }
        }

        System.out.println("Le nombre de rang N dans la suite de Fibonacci est : " + resultat);

        scanner.close();
    }
}
