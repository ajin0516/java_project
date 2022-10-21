package java1021;

import java.util.Arrays;
import java.util.Stack;

public class SolveBracket {
    // 열고 닫는 걸 없애는 게 중요!
    // indexOf사용
    public boolean solution(String s) {
//        System.out.println(s);
        while (s.indexOf("()") >= 0) {
//            System.out.println(s.indexOf("()")); // 이 문자열이 처음 등장하는 인덱스
            s = s.replaceAll("()", ""); // 괄호가 안 사라짐 - 정규식이라서?
            // 이 문자열이 등장하기 전까지 계속 replaceAll 한다
        }
//        String s1 = s.replaceAll("\\(\\)",""); // 괄호가 안 사라짐 - 정규식이라서?
//        System.out.println(s1);
//        System.out.println(s1.length());

        return s.length() == 0;
    }

    // split 사용
    public boolean solution2(String s){
        String [] splitted = s.split("\\(\\)");
        System.out.println(Arrays.toString(splitted));

        return s.length() == 0;
    }

    // stack으로 풀기
    // 여는 괄호 st.push('(');
    // 닫는 괄호 st.pop();
    // 하나씩 쭉 돌리면 0, whlie은 ()이거먼저 찾아서 돌림
    public boolean solution3(String s){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if('(' == s.charAt(i)){
                st.push(s.charAt(i));
//                System.out.println(st.size());
            } else if (')' == s.charAt(i)) {
                if(st.empty()) return false;
                st.pop();
            }
        }
        return st.empty();
    }
}

