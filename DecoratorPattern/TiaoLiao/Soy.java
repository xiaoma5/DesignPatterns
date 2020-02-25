package DecoratorPattern.TiaoLiao;

import DecoratorPattern.BasicClass.Beverage;
import DecoratorPattern.BasicClass.CondimentDecorator;

/**
 * @author xiaoma
 * @create 2020-02-25 11:20:17
 * @desc ...豆浆配料
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+" , Soy";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
