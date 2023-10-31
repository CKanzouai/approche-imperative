package TP;

import java.util.Arrays;

public class InversionContenu {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] arrayCopy = new int[array.length];
        //System.out.println(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[array.length - i - 1];
            System.out.println( arrayCopy[i]+ " ");
        }
    }
}
