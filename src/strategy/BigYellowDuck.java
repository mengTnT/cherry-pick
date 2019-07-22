package strategy;

import strategy.impl.DuckFlyByRocket;

/**
 * @author mengxiangtao
 * @date 8/7/2019 上午10:49
 */
public class BigYellowDuck extends Duck {

    public BigYellowDuck() {
        super(new DuckFlyByRocket());
    }
}
