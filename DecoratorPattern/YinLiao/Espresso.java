package DecoratorPattern.YinLiao;

import DecoratorPattern.BasicClass.Beverage;

/**
 * @author xiaoma
 * @create 2020-02-25 11:10:49
 * @desc ...浓咖啡饮料
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso"; //description实例变量继承自Beverage
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
