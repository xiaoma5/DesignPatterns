package FactoryPattern.AbstractFactoryPattern;

/**
 * @author xiaoma
 * @create 2020-02-25 20:51:23
 * @desc ...
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("============小米系列产品===========");
        //小米工厂
        XiaomiFactory xiaomiFactory = new XiaomiFactory();

        IphoneProduct iphoneProduct = xiaomiFactory.iphoneProduct();
        iphoneProduct.start();
        iphoneProduct.shutdown();

        System.out.println("============华为系列产品===========");
        //华为工厂
        HuaweiFactory huaweiFactory = new HuaweiFactory();

        IphoneProduct iphoneProduct1 = huaweiFactory.iphoneProduct();
        iphoneProduct1.start();
        iphoneProduct1.shutdown();
    }
}
