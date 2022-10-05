package Java1005.ex;

public class RandomNumberCreator implements  NumberCreator{


    public RandomNumberCreator(){}

    @Override
    public int create() {
       int num = (int)(Math.random()*10);
       return num;
    }
}
