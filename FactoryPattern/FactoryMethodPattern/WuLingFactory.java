package FactoryPattern.FactoryMethodPattern;

/**
 * @author xiaoma
 * @create 2020-02-25 16:55:14
 * @desc ...
 */
public class WuLingFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new WuLing();
    }
}
