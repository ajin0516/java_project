package Java1017;
public class RightTriagle {
    private String letter = "#";

    // 기본값일 때
    public RightTriagle() {
    }
    // 파라미터 있을 기
    public RightTriagle(String letter) {
        this.letter = letter;
    }

    public void starNum(int num){
        for(int i = 0; i < num; i++){
            for (int j = 0; j <= i; j++) {
                System.out.print(this.letter);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        RightTriagle rightTriagle = new RightTriagle();
        rightTriagle.starNum(6);
    }
}
