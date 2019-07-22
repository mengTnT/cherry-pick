package observer;

/**
 * @author mengxiangtao
 * @date 9/7/2019 上午11:45
 */
public class ObserverTest {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        Observer observer = new PhoneObserver(weatherData);
        weatherData.measurementsChanged(23,56,89);
        weatherData.measurementsChanged(29,59,89);
        weatherData.measurementsChanged(33,86,89);



    }
}
