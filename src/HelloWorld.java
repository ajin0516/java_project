public class HelloWorld {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 8;
        arr[4] = 10;

        for(int i =0; i<5; i++){
            System.out.printf(i+1 + "번쨰에는 %d가 들어있습니다.%n", arr[i]);
        }


    }
}
