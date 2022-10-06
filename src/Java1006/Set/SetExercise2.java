package Java1006.Set;

import java.util.HashSet;

public class SetExercise2 {
    public static void main(String[] args) {
        AlphabetGenerator alphabetGenerator = new AlphabetGenerator();
        HashSet<Character> hashSet = new HashSet<>();

        for(int i=0; i<50; i++) {
            char alphabet = alphabetGenerator.create();
            hashSet.add(alphabet);
        }
        System.out.println(hashSet);
    }
}
