package FactoryPattern.AbstractFactoryPattern;

/**
 * @author xiaoma
 * @create 2020-02-25 17:27:41
 * @desc ...小米路由器
 */
public class XiaomiRouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("打开小米路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米路由器");
    }
}
