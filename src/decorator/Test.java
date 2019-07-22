package decorator;

/**
 * @author mengxiangtao
 * @date 11/7/2019 下午8:44
 */
public class Test {
    public static void main(String[] args) {
         Drink drink=new Tea();
        //System.out.println(drink.desc());
        drink=new Suger(drink);
         drink=new Suger(drink);
         drink=new Milk(drink);
        System.out.println(drink.desc());
        System.out.println(drink.cost());
    }
}
