package ObservePattern;

/**
 * @author xiaoma
 * @create 2020-02-24 18:28:30
 * @desc ...被观察者接口
 */
public interface Observer {
    public void update(float temp , float humidity , float pressure);
}
