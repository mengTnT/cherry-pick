package factory;

import factory.product.mouse.GameMouse;
import factory.product.mouse.Mouse;
import factory.product.mouse.WorkMouse;

/**
 * @author mengxiangtao
 * @date 8/7/2019 上午11:46
 */
public class MouseFactory extends Factory {
    public static Mouse getMouse(String type) {
        if (type.equals("游戏")) {
            return new GameMouse();
        }
        if (type.equals("办公")) {
            return new WorkMouse();
        }
        return new WorkMouse();
    }

    @Override
    protected void makeSomeThing(String type) {
     getMouse(type).makeProduct();
    }
}
