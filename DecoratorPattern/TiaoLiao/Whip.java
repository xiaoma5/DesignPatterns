package DecoratorPattern.TiaoLiao;

import DecoratorPattern.BasicClass.Beverage;
import DecoratorPattern.BasicClass.CondimentDecorator;

/**
 * @author xiaoma
 * @create 2020-02-25 11:22:37
 * @desc ...奶泡配料
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public  Whip(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+" , Whip";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
