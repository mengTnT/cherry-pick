package factory;

/**
 * @author mengxiangtao
 * @date 8/7/2019 下午1:59
 */
public class FactoryProducer extends AbstractProductFactory {

    @Override
    public  Factory getFactory(String type) {
        if ("鼠标".equals(type)){
           return new MouseFactory();
        }
        if ("键盘".equals(type)){
            return new KeyBoardFactory();
        }
        return null;
    }
}
