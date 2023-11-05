package TP;

import java.util.Arrays;

public class Rotation {
    public static void main(String[] args) {
        int[] array = {0,1,2,3};
        int lastElt = array[array.length -1];
       for (int i = array.length - 1; i > 0; i--){
            array[i]=array[i -1];

       }
        array[0] = lastElt;
        System.out.println(Arrays.toString(array));

        }
}
