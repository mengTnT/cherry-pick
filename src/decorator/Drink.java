package decorator;

/**
 * @author mengxiangtao
 * @date 11/7/2019 下午8:34
 */
public abstract class Drink {
    String desc="饮料";
    public String desc(){
      return desc;
    }
    protected abstract int cost();
}
