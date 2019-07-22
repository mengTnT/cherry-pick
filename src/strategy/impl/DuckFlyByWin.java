package strategy.impl;

import strategy.DuckFlyStrategy;

/**
 * @author mengxiangtao
 * @date 8/7/2019 上午10:46
 */
public class DuckFlyByWin implements DuckFlyStrategy {
    @Override
    public void fly() {
        System.out.printf("我靠翅膀飞");
    }
}
