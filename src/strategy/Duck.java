package strategy;

/**
 * @author mengxiangtao
 * @date 8/7/2019 上午10:36
 */
public abstract class Duck {
    private DuckFlyStrategy duckFlyStrategy;
    private void say(){
        System.out.printf("<{=．．．．(嘎~嘎~嘎~)");
    }

    public Duck(DuckFlyStrategy duckFlyStrategy) {
        this.duckFlyStrategy = duckFlyStrategy;
    }

    public void fly(){
        duckFlyStrategy.fly();
    }
}
