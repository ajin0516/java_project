package Java1006.Map;

import java.util.HashMap;
import java.util.Locale;

public class AlphabetCnt {
    public static void main(String[] args) {
        AlphabetCnt alphabetCnt = new AlphabetCnt();
        // 소문자 -> 대문자(데소문자를 구분하지 않음)
        String s1 = "aaabbbbbccddddglksjfk".toUpperCase();

        HashMap<Character, Integer> alphabetMap = new HashMap<>();

        for(char c = 'A'; c < 'Z'; c++){
            alphabetMap.put(c,0);
        }
        // String 한글자씩 출력해보기
        for(int i=0; i<s1.length(); i++) {
            char c = s1.charAt(i);

            boolean isAlphabet = alphabetCnt.isAlphabet(c);
            // 알파뱃 개수 세기
            if(isAlphabet){
                alphabetMap.put(c, alphabetMap.get(c) + 1);
            }
        }
        System.out.println(alphabetMap);
    }
    // c가 알파벳인지 확인
    public boolean isAlphabet(char ch) {
        if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
            return true;
        } return false;
    }

}
