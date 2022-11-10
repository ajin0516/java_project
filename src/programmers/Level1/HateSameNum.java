package programmers.Level1;

public class HateSameNum {
    public int[] solution(int []arr) {
        int[] answer = {};
        int[] arrAll = {1,1,3,3,0,1,1};
        int[] newArr = new int[]{};
         // 연속으로 같은 숫자가 들어오면 새 배열에 담기
        for (int i = 0; i < answer.length; i++) {
            if(arrAll[i] == arrAll[i+1]){
                newArr[i] = arrAll[i+1];

            }else {
                newArr[i] = arrAll[i];
            }
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }



    public static void main(String[] args) {
        HateSameNum hateSameNum = new HateSameNum();
        hateSameNum.solution(new int[]{2,3,4});
    }
}
