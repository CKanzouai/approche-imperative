package TP;

public class rechercheMaxMin {
    public static void main(String[] args) {


        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int max = 0;
        int min = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }

        }
        System.out.println(max);
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];

            }

        }
        System.out.println(min);

    }
}
