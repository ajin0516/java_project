package programmers;

public class CaesarCipher {

    public String solution(String s, int n) {
        String answer = "z";
        int a = 97; // a
        int b = 122; // z
        int c = 65; // A
        int d = 90; // Z
        char ch = 'a';
//        int y = ch + 0;
//        System.out.println(y);

        String result = "";
        for (int i = 0; i < answer.length(); i++) {
            int x = (int)answer.charAt(i) + 0;

            if(x >= 97 && x <= 122){
                int plusOne = x + 1;
                char plusAlpha = (char)plusOne;
                result += plusAlpha;
                System.out.println(result + "1");
            } else if (x >= 65 && x <= 90) {
                int plusOne = x + 1;
                char plusAlpha = (char)plusOne;
                result += plusAlpha;
                System.out.println(result + "2");
            }else if(answer.charAt(i)==' '){
                result += answer.charAt(i);
                System.out.println(result + "3");
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher();
        caesarCipher.solution("A",4);
    }
}
