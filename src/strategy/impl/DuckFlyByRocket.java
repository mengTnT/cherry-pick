package strategy.impl;

import strategy.DuckFlyStrategy;

/**
 * @author mengxiangtao
 * @date 8/7/2019 上午10:47
 */
public class DuckFlyByRocket implements DuckFlyStrategy {

    @Override
    public void fly() {
        System.out.printf("我靠火箭飞");
    }
}
