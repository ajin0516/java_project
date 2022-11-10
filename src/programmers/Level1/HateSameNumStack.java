package programmers.Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class HateSameNumStack {
    public int[] solution(int []arr) {

        Stack<Integer> stack = new Stack();

        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(stack.peek().equals(arr[i])){
                stack.push(arr[i]);
                stack.pop();
            }else {
                stack.push(arr[i]);
            }
        }
        var answer = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

            return answer;
    }
    public static void main(String[] args) {
        HateSameNumStack hateSameNum = new HateSameNumStack();
        hateSameNum.solution(new int[]{1,1,3,3,0,1,1});
    }
}
