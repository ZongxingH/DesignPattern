package hzx.design.singleton.lazy;

/**
 * Introduction:  [延时加载的单例模式，只有当第一次获得实例的时候才会初始化]
 * Package Name:  hzx.design.singleton.lazy
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Email： zongxingh@163.com
 * Tel: 157*****778
 * Create Time:  2017/7/1 17:22
 */
public class LazySingleton {
    private LazySingleton() {
    }

    private static LazySingleton singleton = null;

    public static synchronized LazySingleton getInstance() {

        if (null == singleton){
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
