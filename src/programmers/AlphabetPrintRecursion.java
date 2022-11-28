package programmers;

public class AlphabetPrintRecursion {
    public static void alphabet(char ch) {
        if(ch > 'Z') {
            return;
        }
        System.out.println(ch);
        alphabet(ch+=1);
    }
    public static void main(String[] args) {
        alphabet('A');
    }
}
