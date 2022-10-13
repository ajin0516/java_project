package Java1013;

import java.util.Arrays;

class BubbleSort {
    public int[] sort(int[] arr, int i) {
        // 오름차순 또는 내림차순으로 정렬하는 알고리즘

        for (int j = 1; j < arr.length; j++) {
            if (arr[i] > arr[j]) {   // 7 vs 2
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 3, 9, 28, 11};
        BubbleSort insertSort = new BubbleSort();

        int[] result = insertSort.sort(new int[]{2, 7, 3, 9, 28, 11}, 1); // 7 vs 3
        System.out.println(Arrays.toString(result)); // 2,3,7,9,28,11
    }
}
