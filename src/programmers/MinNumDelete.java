package programmers;

import java.util.ArrayList;
import java.util.List;

public class MinNumDelete {
    public int[] solution(int[] arr1) {

        int minIdx = 0;
        // 빈배열 또는 1개의 배열 -> -1 리턴
        if( arr1.length == 1 || arr1.length == 0) return new int[]{-1};

        // 가장 작은 수 찾기
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[minIdx] > arr1[i]) minIdx = i;
        }

        List<Integer> list = new ArrayList<>();

        // 가장 작은 수 제외 list에 담기
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[minIdx] != arr1[i]){
                list.add(arr1[i]);
            }
        }
        // list -> Array
        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        MinNumDelete minNumDelete = new MinNumDelete();
        minNumDelete.solution(new int[]{10});
    }
}
