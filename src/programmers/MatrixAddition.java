package programmers;

import java.util.Arrays;

public class MatrixAddition {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};

        int[][] fff1 = {{1,2}, {2,3}};
        int[][] fff2 = {{3,4}, {5,6}};

        int[][] result = new int[fff1.length][fff1[0].length];
        for (int i = 0; i < fff1.length; i++) {
            for (int j = 0; j < fff1[0].length; j++) {
                result[i][j] = fff1[i][j] + fff2[i][j];
            }
        }

        System.out.println(Arrays.deepToString(result));
        return answer;
    }
    public static void main(String[] args) {
        MatrixAddition matrixAddition = new MatrixAddition();
        int[][] fff1 = {{1,2}, {2,3}};
        int[][] fff2 = {{3,4}, {5,6}};
        matrixAddition.solution(fff1, fff2);

    }
}
