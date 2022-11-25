package programmers;

import java.util.Arrays;

public class SamBudget {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);

        int answer = 0;
        int sum = 0;

        for (int i = 0; i < d.length; i++) {
            sum += d[i];
            if(sum > budget) {
                break;
            }
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        SamBudget samBudget = new SamBudget();
        samBudget.solution(new int[]{1, 3, 2, 5, 4, 6, 7}, 9);
    }
}
