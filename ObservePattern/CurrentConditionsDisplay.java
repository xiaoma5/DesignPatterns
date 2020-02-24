package ObservePattern;

/**
 * @author xiaoma
 * @create 2020-02-24 18:39:56
 * @desc ... 被观察者
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: " + temperature+ "F degrees and "+humidity+ "% humidity");
    }
    
}
