package factory.product.mouse;

import factory.make.Make;

/**
 * @author mengxiangtao
 * @date 8/7/2019 上午11:49
 */
public class GameMouse extends Mouse{
    @Override
    public void makeProduct() {
        System.out.printf("制造游戏鼠标");
    }
}
