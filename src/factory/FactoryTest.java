package factory;

import factory.MouseFactory;
import factory.product.mouse.Mouse;

/**
 * @author mengxiangtao
 * @date 8/7/2019 下午1:41
 */
public class FactoryTest {
    public static void main(String[] args) {
       /* Mouse mouse = MouseFactory.getMouse("游戏");
        mouse.makeProduct();*/

       AbstractProductFactory abstractProductFactory=new FactoryProducer();
        Factory factory = abstractProductFactory.getFactory("键盘");
        factory.makeSomeThing("游戏");
    }
}
