package hzx.design.singleton.innerclass;

/**
 * Introduction:  [采用静态内部类的方式来维护单例的实例，延时加载，线程安全]
 * Package Name:  hzx.design.singleton.innerclass
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Email： zongxingh@163.com
 * Tel: 157*****778
 * Create Time:  2017/7/1 18:04
 */
public class InnerClassSingleton {

    private InnerClassSingleton(){}

    private static class SingletonHolder{
        private static InnerClassSingleton singleton = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance(){
        return SingletonHolder.singleton;
    }
}
