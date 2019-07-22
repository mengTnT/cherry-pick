package observer;

/**
 * @author mengxiangtao
 * @date 9/7/2019 上午11:41
 */
public class PhoneObserver implements Observer,Display {
    private float temp;
    private float humidity;
    private float pressure;
    private Subject subject;

    public PhoneObserver(Subject subject) {
        this.subject = subject;
        subject.registObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        show();
    }

    @Override
    public void show() {
        System.out.println("温度:"+temp);
        System.out.println("湿度:"+humidity);
        System.out.println("气压:"+pressure);
    }
}
