package singleton;

/**
 * @author mengxiangtao
 * @date 4/7/2019 下午4:55
 */
public enum SingletonEnum {
    INSTANCE;
    private SingletonClass singletonClass;

    public SingletonClass getInstance() {
        return singletonClass;
    }

    SingletonEnum(){
        singletonClass=new SingletonClass();
    }


}
