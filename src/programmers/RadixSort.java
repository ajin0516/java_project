package programmers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] radix = new int[10];
        int[] arr = {7, 4, 5, 9, 1, 0};
        for (int j = 0; j < arr.length; j++) {
            radix[arr[j]] = arr[j];
        }
        Arrays.sort(radix);
        for (int i : radix) {
            if(i!=0) {
                System.out.println(i);
            }
        }

    }
}
