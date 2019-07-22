package decorator;

/**
 * @author mengxiangtao
 * @date 11/7/2019 下午8:39
 */
public class Coffee extends Drink {
    @Override
    public String desc() {
        desc="我是咖啡";
        return desc;
    }
    @Override
    protected int cost() {
        return 10;
    }
}
