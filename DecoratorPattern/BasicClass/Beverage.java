package DecoratorPattern.BasicClass;

/**
 * @author xiaoma
 * @create 2020-02-25 11:06:07
 * @desc ...装饰者模式（星巴克咖啡）
 *
 * 饮料抽象类
 */
public abstract class Beverage {
    public String description = "Unknow Bevveragge";
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
