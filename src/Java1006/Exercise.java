package Java1006;

import java.util.HashMap;
import java.util.Locale;

public class Exercise {
    public static void main(String[] args) {
        // 대소문자 관계없이 주어진 String에서 각각 알파벳의 개수 찾기
        String str = "sAJFHSUklADdgghofdgjklerw123".toUpperCase();

        HashMap<Character,Integer> hashMap = new HashMap<>();

        // 문자열의 문자를 하나씩 뽑아서 HashMap에 담기
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch>=65 && ch<=90){
                hashMap.put(ch,hashMap.getOrDefault(ch,0)+1);
                System.out.println(hashMap);
            }
        }
        System.out.println(hashMap);

    }
}
