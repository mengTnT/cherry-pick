package adapter.extendsExample;

/**
 * @author mengxiangtao
 * @date 4/7/2019 下午1:39
 */
public class PrintBanner extends Banner implements Print {

    @Override
    public void printA() {
        printAa();
    }

    @Override
    public void printB() {
        printBb();
    }
}
