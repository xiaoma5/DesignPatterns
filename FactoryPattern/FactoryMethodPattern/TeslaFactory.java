package FactoryPattern.FactoryMethodPattern;

/**
 * @author xiaoma
 * @create 2020-02-25 16:54:24
 * @desc ...
 */
public class TeslaFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new Tesla();
    }
}
