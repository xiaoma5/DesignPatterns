package ObservePattern;

import java.util.ArrayList;

/**
 * @author xiaoma
 * @create 2020-02-24 18:31:19
 * @desc ... 观察者
 */
public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList();
    }

    @Override
    //注册观察者
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    //移除观察者
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if ( i >= 0){
            observers.remove(o);
        }
    }

    @Override
    //通知所有被观察者
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature , humidity , pressure);
        }
    }

    //观察者更新数据
    public void setMeasurements(float temperature , float humidity , float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    //观察者更新数据
    public void measurementsChanged(){
        notifyObservers();
    }
}
