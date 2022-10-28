package programmers;

// 최악의 경우 얼마나 느려질까?
// indexof 몇번째 인덱스에 해당하는 글자가 등장하는지 리턴
// 1. 같은 전화번호가 중복해서 들어가지 않음

// System.out.println("123".indexOf("12"));  // 0

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

// hashSet 하나씩 뽑아서 ex) 12345
//  1
// 12
// 123
// 1234
// 12345
// 시간 복잡도 O(20N)
// 중첩 for문을 써야 함

public class PhoneBook {

        public boolean solution(String[] phone_book) {
            boolean answer = true;
            HashSet<String> memo = new HashSet<>();

            for(String phoneNember : phone_book ){
                memo.add(phoneNember);
            }

            // 모르겠음...
            for (int i = 0; i < ; i++) {
                for (int j = 0; j < ; j++) {

                }
            }
            return answer;
        }
    public static void main(String[] args) {

    }
}
