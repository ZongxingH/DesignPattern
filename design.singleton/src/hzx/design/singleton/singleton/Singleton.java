package hzx.design.singleton.singleton;

/**
 * Introduction:  [非延时加载的单例模式，在完成类加载的同时初始化实例对象]
 * Package Name:  hzx.design.singleton.singleton
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Email： zongxingh@163.com
 * Tel: 157*****778
 * Create Time:  2017/7/1 17:18
 */
public class Singleton {

    private Singleton(){

    }

    private static Singleton singleton = new Singleton();

    public static Singleton getInstance(){
        return singleton;
    }
}
