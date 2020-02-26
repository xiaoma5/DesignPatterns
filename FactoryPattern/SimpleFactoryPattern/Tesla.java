package FactoryPattern.SimpleFactoryPattern;

/**
 * @author xiaoma
 * @create 2020-02-25 16:39:38
 * @desc ...
 */
public class Tesla implements Car {
    @Override
    public void name() {
        System.out.println("特斯拉！");
    }
}
