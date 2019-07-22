package factory;

import factory.product.keyboard.GameKeyBoard;
import factory.product.keyboard.KeyBoard;
import factory.product.keyboard.WorkKeyBoard;
import factory.product.mouse.GameMouse;
import factory.product.mouse.Mouse;
import factory.product.mouse.WorkMouse;

/**
 * @author mengxiangtao
 * @date 8/7/2019 上午11:46
 */
public class KeyBoardFactory extends Factory {
    public static KeyBoard getKeyBoard(String type) {
        if (type.equals("游戏")) {
            return new GameKeyBoard();
        }
        if (type.equals("办公")) {
            return new WorkKeyBoard();
        }
        return new WorkKeyBoard();
    }

    @Override
    public void makeSomeThing(String type) {
        getKeyBoard(type).makeProduct();
    }
}
