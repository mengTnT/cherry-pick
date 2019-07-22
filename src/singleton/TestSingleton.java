package singleton;

/**
 * @author mengxiangtao
 * @date 4/7/2019 下午5:51
 */
public class TestSingleton {
    public static void main(String[] args) {
        SingletonClass instance = SingletonEnum.INSTANCE.getInstance();
        SingletonClass instance2 = SingletonEnum.INSTANCE.getInstance();

        System.out.println(instance==instance2);
    }
}
