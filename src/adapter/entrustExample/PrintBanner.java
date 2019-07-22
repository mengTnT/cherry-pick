package adapter.entrustExample;

/**
 * @author mengxiangtao
 * @date 4/7/2019 下午1:39
 */
public class PrintBanner extends Print {
    private Banner banner=new Banner();

    @Override
    public void printA() {
        banner.printAa();
    }

    @Override
    public void printB() {
        banner.printBb();
    }
}
