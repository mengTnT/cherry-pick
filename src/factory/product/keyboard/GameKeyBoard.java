package factory.product.keyboard;

/**
 * @author mengxiangtao
 * @date 8/7/2019 下午1:47
 */
public class GameKeyBoard extends KeyBoard {
    @Override
    public void makeProduct() {
        System.out.printf("生产游戏键盘");
    }
}
