package Java1017;

public class Pyramid {
    // 피라미드 - 별 위치 신경써야함
    // 직각삼각형 - 오른쪽 정렬
    public void printStar(int N){

        for (int i = 0; i < N; i++) {
            // 공백출력
            for (int j = N - 1 -i; j > 0; j--) {
                System.out.print(" ");
            }
            // 별
            for (int k = 0; k < 2*i + 1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid();
        pyramid.printStar(4);
    }
}
