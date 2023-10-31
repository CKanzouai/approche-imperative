package TP;

public class sommeTableauxDiff {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18};
        int maxLength = 0;

        if (array1.length > array2.length) {
            maxLength = array1.length;
        } else {
            maxLength = array2.length;
        }
        System.out.println(maxLength);

        for (int i = 0; i < maxLength; i++) {
            int valeur1 = 0;
            int valeur2 = 0;

            if (i < array1.length) {
                valeur1 = array1[i];
            }
            if (i < array2.length) {
                valeur2 = array2[i];
            }

            int sum = valeur1 + valeur2;
            System.out.println(sum);
        }



    }
}


