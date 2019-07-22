package strategy;

/**
 * @author mengxiangtao
 * @date 8/7/2019 上午10:58
 */
public class TestStrategy {
    public static void main(String[] args) {
        //Duck duck=new WhiteDuck();
        Duck duck=new BigYellowDuck();
        duck.fly();
    }
}
