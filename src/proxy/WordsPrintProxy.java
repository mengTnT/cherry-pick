package proxy;

/**
 * @author mengxiangtao
 * @date 8/7/2019 下午3:03
 */
public class WordsPrintProxy implements Print {
    private Print print=new WordsPrint();
    @Override
    public void printContent() {
        System.out.println("打印标题");
        print.printContent();
        System.out.println("打印结束语");
    }

    public static void main(String[] args) {
        Print print=new WordsPrintProxy();
        print.printContent();
    }
}
