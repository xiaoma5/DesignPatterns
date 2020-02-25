package DecoratorPattern.YinLiao;

import DecoratorPattern.BasicClass.Beverage;

/**
 * @author xiaoma
 * @create 2020-02-25 11:12:59
 * @desc ...首选咖啡饮料
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
