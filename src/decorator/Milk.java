package decorator;

/**
 * @author mengxiangtao
 * @date 11/7/2019 下午8:43
 */
public class Milk extends Condiment{
    private Drink drink;

    public Milk(Drink drink) {
        this.drink = drink;
        desc=",加奶";
    }

    @Override
    protected int cost() {
        return 10 + drink.cost();
    }

    @Override
    public String desc() {
        return drink.desc()+desc;
    }
}
