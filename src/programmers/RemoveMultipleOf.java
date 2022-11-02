package programmers;

import java.util.ArrayList;
import java.util.List;

public class RemoveMultipleOf {

    public static void main(String[] args) {
        int N = 50; // 50미만의 모든 소수 구하기

        List<Integer> nums = new ArrayList<>();

        // 2~50채우기
        for (int i = 2; i <= N; i++) {
            nums.add(i);
            System.out.println(nums);
        }

        // 2의 배수 지우기 2제외
        // 1부터 시작하면 ? - 안됨
        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i) % 2 == 0 && nums.get(i) > 2){
                nums.remove(i);
            }
        }
        System.out.println(nums);
//        nums.removeIf( num -> num % 2 == 0 && num !=2);
    }
}
