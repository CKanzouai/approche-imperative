package TP;

import java.util.Scanner;

public class baton {
    private int batonCount;
    private boolean playerTurn;


    public baton(int batonCount) {
        this.batonCount = batonCount;
        this.playerTurn = true;
    }


    public boolean isPlayerTurn() {
        return playerTurn;
    }


    public int getBatonCount() {
        return batonCount;
    }

    public void removeBatons(int count) {
        if (count < 1 || count > batonCount) {
            throw new IllegalArgumentException("Invalid number of batons to remove.");
        }

        batonCount -= count;
        playerTurn = !playerTurn;
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        while (batonCount > 0) {
            System.out.println("Number of batons remaining: " + batonCount);

            if (playerTurn) {
                System.out.print("Enter the number of batons to remove (1-3): ");
                int count = scanner.nextInt();

                if (count < 1 || count > 3 || count > batonCount) {
                    System.out.println("Invalid number of batons. Please try again.");
                    continue;
                }

                removeBatons(count);
                System.out.println("Player removed " + count + " baton(s).");
            } else {
                int count = Math.min(batonCount, 3);
                removeBatons(count);
                System.out.println("Computer removed " + count + " baton(s).");
            }
        }

        if (playerTurn) {
            System.out.println("Player wins!");
        } else {
            System.out.println("Computer wins!");
        }

        scanner.close();
    }


    public static void main(String[] args) {
        baton game = new baton(21);
        game.playGame();
    }
}