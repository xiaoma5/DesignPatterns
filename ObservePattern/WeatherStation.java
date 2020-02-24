package ObservePattern;

/**
 * @author xiaoma
 * @create 2020-02-24 19:12:25
 * @desc ...测试类
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        //调用对象的构造方法时就将次对象加入到了观察者列表中
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        //要把哪个对象加入观察者列表，只需要创建该类对象，构造器传入weatherData


        weatherData.setMeasurements(1,1,1);
        weatherData.setMeasurements(2,2,2);
        weatherData.setMeasurements(3,3,3);
    }
}










































