package FactoryPattern.SimpleFactoryPattern;


/**
 * @author xiaoma
 * @create 2020-02-25 16:40:18
 * @desc ...测试类
 */
public class Test {
    public static void main(String[] args) {
        Car car = CarFactory.getCar("五菱");
        Car car1 = CarFactory.getCar("特斯拉");
        car.name();
        car1.name();
    }
}
