package FactoryPattern.AbstractFactoryPattern;

/**
 * @author xiaoma
 * @create 2020-02-25 17:25:19
 * @desc ...小米手机
 */
public class XiaomiPhone implements IphoneProduct {
    @Override
    public void start() {
        System.out.println("开启小米手机！");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米手机！");
    }
}
