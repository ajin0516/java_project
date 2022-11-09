package programmers;

import java.util.Arrays;

public class SelectionSort {
    public void sort(int[] data) {

        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        for (int i = 0; i < arr.length-1; i++) {
            int minIdx = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public void sort2(int[] data) {

        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        for (int i = 0; i < arr.length-1; i++) {
            int maxIdx = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[maxIdx] < arr[j]) {
                    maxIdx = j;
                }
            }
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int[] arr1 = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort2(arr1);
        selectionSort.sort(arr1);

    }
}