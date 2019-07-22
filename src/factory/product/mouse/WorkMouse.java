package factory.product.mouse;

import factory.make.Make;

/**
 * @author mengxiangtao
 * @date 8/7/2019 上午11:49
 */
public class WorkMouse extends Mouse {
    @Override
    public void makeProduct() {
        System.out.printf("制造工作鼠标");
    }
}
