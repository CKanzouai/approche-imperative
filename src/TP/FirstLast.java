package TP;

public class FirstLast {
    public static void main(String[] args) {
        int[] array = {6, 3, 7, 9, 10, 1};
        boolean firstLast = false;
        if (array.length>=1 && array[0] == array[array.length - 1]){
            firstLast = true;

        }
        System.out.println(firstLast);
    }
}
