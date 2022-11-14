package programmers;

import java.util.Arrays;

public class Eratosthenes {
    public static void main(String[] args) {
        Eratosthenes eratosthenes = new Eratosthenes();
        int num = 50;
        int[] arr = new int[num-1];
        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
            if(arr[i] != 2 && arr[i] % 2 == 0){
                arr[i] = 0;
            }
            if(arr[i] != 3 && arr[i] % 3 == 0){
                arr[i] = 0;
            }
            if(arr[i] != 5 && arr[i] % 5 == 0){
                arr[i] = 0;
            }
            if(arr[i] != 7 && arr[i] % 7 == 0){
                arr[i] = 0;
            }
        }
        int cnt = -1;  //  1 제외
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                cnt++;
            }
        }
        System.out.println(cnt);
        System.out.println(Arrays.toString(arr));

    }
}
