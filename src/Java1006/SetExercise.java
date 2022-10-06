package Java1006;

import java.util.HashSet;
import java.util.Set;

public class SetExercise {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("이아진");
        set1.add("이아진");
        // 값이 유일하다(중복없다-중복제거 시 유용)

        Set<Integer> setInteger = new HashSet<>();
        setInteger.add(1);
        setInteger.add(2);
        setInteger.add(2);
        setInteger.add(3);
        setInteger.add(4);
        setInteger.add(5);

        System.out.println(setInteger);
    }
}
