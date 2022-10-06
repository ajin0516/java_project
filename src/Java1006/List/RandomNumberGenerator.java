package Java1006.List;

import Java1006.List.NumberGenerator;

public class RandomNumberGenerator implements NumberGenerator {

    @Override
    public int generate(int num) {
        return (int)(Math.random()*num);
    }
}

