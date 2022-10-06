package Java1006.Set;

import Java1006.Set.Generator;

public class AlphabetGenerator implements Generator {

    @Override
    public char create() {
        return (char)((int)(Math.random()*26)+65);
    }
}
