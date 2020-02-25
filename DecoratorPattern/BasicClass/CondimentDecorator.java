package DecoratorPattern.BasicClass;

/**
 * @author xiaoma
 * @create 2020-02-25 11:08:27
 * @desc ...调料抽象类（所有的调料都必须重新实现getDescription()方法）
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
