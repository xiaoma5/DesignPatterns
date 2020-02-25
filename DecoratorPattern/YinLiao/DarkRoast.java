package DecoratorPattern.YinLiao;

import DecoratorPattern.BasicClass.Beverage;

/**
 * @author xiaoma
 * @create 2020-02-25 11:29:53
 * @desc ...深培咖啡饮料
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
