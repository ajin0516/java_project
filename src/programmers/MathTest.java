package programmers;

public class MathTest {
    public int[] solution(int[] answers) {
/*  1,2,3,4,5 | 1,3,2,4,2
1번 수포자가 찍는 방식: 1, 2, 3, 4, 5,  1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2,  2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

첫번째 5 2
두번째 0 2
세번째 0 2
 */
        int[] firstStudent = {1, 2, 3, 4, 5}; // 반복이 안되네?...
        int[] secondStudent = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdStudent = {3, 3, 1, 1, 2,  2, 4, 4, 5, 5};
        int firstStudentAnswerCnt = 0;
        int secondStudentAnswerCnt = 0;
        int thirdStudentAnswerCnt = 0;

        for (int i = 0; i < answers.length; i++) {
            if(answers[i] != firstStudent[i]){
                continue;  // 같지 않으면 현재 반복 넘어나고 다음 반복 실행
            }
            firstStudentAnswerCnt++;
        }


        String answerPattern1 = "1, 2, 3, 4, 5".repeat(2000);
        String answerPattern2 = "2, 1, 2, 3, 2, 4, 2, 5".repeat(1250);
        String answerPattern3 = "3, 3, 1, 1, 2,  2, 4, 4, 5, 5".repeat(1000);

        for (int i = 0; i < answers.length; i++) {

            if( (answerPattern1.charAt(i) - '0') == answers[i]){
                firstStudentAnswerCnt++;
            }

        }
        return new int[0];
    }

    public static void main(String[] args) {
        MathTest mathTest = new MathTest();
        int[] answers = {1,2,3,4,5};
    }
}
