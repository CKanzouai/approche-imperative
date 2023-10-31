package TP;

public class CALCULMOYENNE {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int som = 0;
        for (int i = 0; i < array.length; i++){
            som += array[i];

        }

        System.out.println("la moyenne est "+ som/array.length);

    }
}
