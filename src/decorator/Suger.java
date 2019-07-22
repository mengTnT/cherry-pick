package decorator;

/**
 * @author mengxiangtao
 * @date 11/7/2019 下午8:42
 */
public class Suger extends Condiment {
    private Drink drink;

    public Suger(Drink drink) {
        this.drink = drink;
        desc=",加糖";
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
