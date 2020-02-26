package FactoryPattern.AbstractFactoryPattern;

/**
 * @author xiaoma
 * @create 2020-02-25 17:29:41
 * @desc ...华为路由器
 */
public class HuaweiRouter implements IRouterProduct{
    @Override
    public void start() {
        System.out.println("打开华为路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为路由器");
    }
}
