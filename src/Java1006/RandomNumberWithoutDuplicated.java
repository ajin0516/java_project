package Java1006;

public class RandomNumberWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator RandomNumberGenerator = new RandomNumberGenerator();
        for(int i=0; i<50; i++){
            int r = RandomNumberGenerator.generate(10);
            System.out.println(r);
        }
    }
}
