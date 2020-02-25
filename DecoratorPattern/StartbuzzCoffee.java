package DecoratorPattern;

import DecoratorPattern.BasicClass.Beverage;
import DecoratorPattern.TiaoLiao.Mocha;
import DecoratorPattern.TiaoLiao.Soy;
import DecoratorPattern.TiaoLiao.Whip;
import DecoratorPattern.YinLiao.DarkRoast;
import DecoratorPattern.YinLiao.Espresso;
import DecoratorPattern.YinLiao.HouseBlend;

/**
 * @author xiaoma
 * @create 2020-02-25 11:25:08
 * @desc ...测试制作咖啡
 */
public class StartbuzzCoffee {
    public static void main(String[] args) {
        //制作浓咖啡
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+" $"+beverage.cost());

        //制作深培咖啡，加两份摩卡和一份奶泡配料
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()+" $"+beverage2.cost());

        //制作首选咖啡，加一份豆浆、一份摩卡和一份奶泡饮料
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()+" $"+beverage3.cost());
        
        Beverage beverage4 = new HouseBlend();
        beverage4 = new Whip(new Mocha(new Soy(beverage4)));
        System.out.println(beverage4.getDescription()+" $"+beverage4.cost());
    }
}
