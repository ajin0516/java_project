package programmers;

import java.util.HashSet;
import java.util.Set;

// 중복제거하기
// 개수 구하는 식

// 중복이 없는 숫자만 구해보기?

public class pokemon {
        public int solution(int[] nums) {
            Set<Integer> set = new HashSet<>(); // 중복제거 위해 set사용
            for (int i = 0; i < nums.length; i++) {
                set.add(nums[i]);
            }

            // 중복을 없애기 위해서?
            int N = nums.length /2 ;

            // 같은 번호는 지우고 다른 번호들만 남기는 건?..

        }

    public static void main(String[] args){

    }
}
