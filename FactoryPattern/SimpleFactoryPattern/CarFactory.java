package FactoryPattern.SimpleFactoryPattern;

/**
 * @author xiaoma
 * @create 2020-02-25 16:41:45
 * @desc ...简单工厂模式
 * 弊端：增加一个新的产品，就得修改下面的条件判断代码
 */
public class CarFactory {
    public static Car getCar(String car){
        if (car.equals("五菱")){
            return new WuLing();
        }else if(car.equals("特斯拉")){
            return new Tesla();
        }else {
            return null;
        }
    }
}
