package Java1005.ex;

public class SpecificNumberCreator implements NumberCreator{

    public SpecificNumberCreator(){}

    @Override
    public int create() {
        return 100;
    }
}
