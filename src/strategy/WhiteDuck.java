package strategy;

import strategy.impl.DuckFlyByWin;

/**
 * @author mengxiangtao
 * @date 8/7/2019 上午10:54
 */
public class WhiteDuck extends Duck {
    public WhiteDuck() {
        super(new DuckFlyByWin());
    }
}
