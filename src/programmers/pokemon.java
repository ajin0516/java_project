package programmers;

import java.util.HashSet;
import java.util.Set;

// 중복제거하기
// 개수 구하는 식

// 중복이 없는 숫자만 구해보기?

public class pokemon {
        public int solution(int[] nums) {
            // 같은 번호는 지우고 다른 번호들만 남기기?!
            Set<Integer> set = new HashSet<>(); // 중복제거 위해 set사용 - [3,3,3,2,2,2] -> [3,2]
            for (int i = 0; i < nums.length; i++) {
                set.add(nums[i]);
            }

            // 중복을 없애기 위해서??
            int N = nums.length /2 ;

            // N의 개수보다 set개수가 적으면 중복이 제거 된거라서 set개수 리턴
            // 그렇지 않다면 동일하거나 많은거라 정해진 개수 N만큼만 리턴
            if(set.size() < N){
                return set.size();
            }else {
                return N;
            }

        }

    public static void main(String[] args){

    }
}
