package Java1006;

import java.util.HashSet;
import java.util.Set;

public class RandomNumberWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        HashSet<Integer> numbers = new HashSet<>(); // Set - 중복제거

        for(int i=0; i<50; i++){
            numbers.add(randomNumberGenerator.generate(30));
        }
        System.out.println(numbers);
        System.out.println("총 " + numbers.size() + "개 입니다.");
    }
}
