package FactoryPattern.FactoryMethodPattern;

/**
 * @author xiaoma
 * @create 2020-02-25 16:40:18
 * @desc ...测试类
 */
public class Test {
    public static void main(String[] args) {
        Car car = new WuLingFactory().getCar();
        Car car1 = new TeslaFactory().getCar();
        car.name();
        car1.name();
    }
}
