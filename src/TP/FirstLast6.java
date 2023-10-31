package TP;

public class FirstLast6 {
    public static void main(String[] args) {
        int[] array = {-1, 3, 7, 9, 10, 1};
        boolean firstLast = false;


            if (((array.length > 0) && (array[0] == 6 || array[array.length - 1] == 6))) {
                firstLast = true;
            }
            System.out.println(firstLast);

        }
    }
