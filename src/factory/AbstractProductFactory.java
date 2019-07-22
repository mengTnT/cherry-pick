package factory;

/**
 * @author mengxiangtao
 * @date 8/7/2019 下午1:53
 */
public abstract class AbstractProductFactory {
    public abstract  Factory getFactory(String type);
}
