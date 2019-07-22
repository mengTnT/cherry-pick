package observer;

/**
 * @author mengxiangtao
 * @date 9/7/2019 上午10:59
 */
public interface Subject {
    void registObserver(Observer oberver);
    void removeObserver(Observer oberver);
    void notifyObserver();
}
