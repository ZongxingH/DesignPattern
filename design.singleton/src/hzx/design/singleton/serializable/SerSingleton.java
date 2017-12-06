package hzx.design.singleton.serializable;

import java.io.Serializable;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.singleton.serializable
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Email： zongxingh@163.com
 * Tel: 157*****778
 * Create Time:  2017/7/1 18:17
 */
public class SerSingleton implements Serializable {
    private String name;

    private SerSingleton(){
        name = "SerSingleton";
    }

    private static SerSingleton singleton = new SerSingleton();

    public static SerSingleton getInstance(){
        return singleton;
    }

    // 实现私有的 readResolve 方法后，readObject 方法形同虚设，他直接使用
    // readResolve 替换了原来的返回值
    private Object readResolve(){
        return singleton;
    }
}
