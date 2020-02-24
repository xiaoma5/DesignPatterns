package ObservePattern;


/**
 * @author xiaoma
 * @create 2020-02-24 18:25:26
 * @desc ...主题接口（观察者）
 */
public interface Subject {
    public void registerObserver(Observer o);  //注册观察者
    public void removeObserver(Observer o);    //移除观察者
    public void notifyObservers();   //唤醒观察者列表
}
