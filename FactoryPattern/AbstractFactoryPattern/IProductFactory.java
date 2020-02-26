package FactoryPattern.AbstractFactoryPattern;

/**
 * @author xiaoma
 * @create 2020-02-25 20:47:26
 * @desc ...抽象产品工厂
 */
public interface IProductFactory {
    //生产手机
    IphoneProduct iphoneProduct();

    //生产路由器
    IRouterProduct routerProduct();
}
