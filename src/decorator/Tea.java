package decorator;

/**
 * @author mengxiangtao
 * @date 11/7/2019 下午8:37
 */
public class Tea extends Drink {

    @Override
    public String desc() {
        desc="我是茶";
        return desc;
    }

    @Override
    protected int cost() {
        return 100;
    }
}
