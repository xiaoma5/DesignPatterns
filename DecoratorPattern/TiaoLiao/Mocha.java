package DecoratorPattern.TiaoLiao;

import DecoratorPattern.BasicClass.Beverage;
import DecoratorPattern.BasicClass.CondimentDecorator;

/**
 * @author xiaoma
 * @create 2020-02-25 11:16:40
 * @desc ... 摩卡配料
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+" , Mocha";
    }

    @Override
    public double cost() {
        return .20+beverage.cost();
    }
}
