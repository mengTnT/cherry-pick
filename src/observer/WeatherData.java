package observer;


import java.util.ArrayList;
import java.util.List;

/**
 * @author mengxiangtao
 * @date 9/7/2019 上午10:56
 */
public class WeatherData implements Subject {
    private List<Observer> obervers=new ArrayList<>();
    private float temp;
    private float humidity;
    private float pressure;
    @Override
    public void registObserver(Observer Observer) {
        obervers.add(Observer);
    }

    @Override
    public void removeObserver(Observer Observer) {
      obervers.remove(Observer);
    }

    @Override
    public void notifyObserver() {
        if (obervers.size()!=0){
            obervers.forEach(Observer -> Observer.update(getTemp(),getHumidity(),getPressure()));
        }
    }
    public void measurementsChanged(float temp,float humidity,float pressure){
        this.temp=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        notifyObserver();
    }


    private float getTemp() {
        return temp;
    }

    private float getHumidity() {
        return humidity;
    }

    private float getPressure() {
        return pressure;
    }
}
