package hzx.design.lazyload;

/**
 * Introduction:  [使用代理模式来实现延时加载，将消耗资源较多的方法使用代理模式将它们分离，从而加快系统的启动速度]
 * Package Name:  hzx.design.lazyload
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Email： zongxingh@163.com
 * Tel: 157*****778
 * Create Time:  2017/7/1 20:00
 */
public class LazyLoadProxyMain {
    public static void main(String[] args) {
        IDBQuery idbQuery = new DBQueryProxy();
        String result = idbQuery.request();
        System.out.println(result);
    }
}
