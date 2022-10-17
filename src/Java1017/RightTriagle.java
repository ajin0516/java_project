package Java1017;
public class RightTriagle {
    public void starNum(int num){
        for(int i = 0; i < num; i++){
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        RightTriagle rightTriagle = new RightTriagle();
        rightTriagle.starNum(6);
    }
}
