package FactoryPattern.AbstractFactoryPattern;

/**
 * @author xiaoma
 * @create 2020-02-25 17:26:27
 * @desc ...华为手机
 */
public class HuaweiPhone implements IphoneProduct {
    @Override
    public void start() {
        System.out.println("开启华为手机！");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为手机！");
    }
}
