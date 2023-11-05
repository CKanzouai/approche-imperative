package TP;

import java.util.Scanner;


public class InteractifStockageNombre {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacite = 5;
        int [] tableau = new int[capacite];
        int taille = 0;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Ajouter un nombre");
            System.out.println("2. Visualiser les nombres");
            System.out.print("Selectionner un choix: ");
            int option = scanner.nextInt();

            if (option == 1) {
                if (taille == capacite) {
                    int newCapacite = capacite * 2;
                    int[] newTableau = new int[newCapacite];
                    System.arraycopy(tableau, 0, newTableau, 0, taille);
                    tableau = newTableau;
                    capacite = newCapacite;
                    System.out.println("Tableau agrandi. Nouvelle capacité: " + capacite);

                }

                System.out.print("Entrer a number: ");
                int nombre = scanner.nextInt();
                tableau[taille] = nombre;
                taille++;
                System.out.println("Nombre a bien été ajouté.");
            } else if (option == 2) {
                if (taille == 0) {
                    System.out.println("Pas de nombres à afficher.");
                } else {
                    System.out.println("Nombres dans le tableau:");
                    for (int i = 0; i < taille; i++) {
                        System.out.println(tableau[i]);
                    }
                }
            } else {
                System.out.println("Choix invalide. Reéssayer.");
            }
        }
    }


}