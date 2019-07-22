package adapter.extendsExample;

/**
 * @author mengxiangtao
 * @date 4/7/2019 下午1:41
 */
public class AdapterTest {
    public static void main(String[] args) {
        Print print=new PrintBanner();
        print.printA();
        print.printB();
    }
}
