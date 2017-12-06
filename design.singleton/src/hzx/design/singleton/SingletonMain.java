package hzx.design.singleton;

import hzx.design.singleton.innerclass.InnerClassSingleton;
import hzx.design.singleton.lazy.LazySingleton;
import hzx.design.singleton.serializable.SerSingleton;
import hzx.design.singleton.singleton.Singleton;
import hzx.design.singleton.utils.SerializableUtils;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.singleton
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Email： zongxingh@163.com
 * Tel: 157*****778
 * Create Time:  2017/7/1 18:23
 */
public class SingletonMain {

    public static void main(String[] args) {
        Singleton singleton_1 = Singleton.getInstance();
        Singleton singleton_2 = Singleton.getInstance();
        System.out.println("singleton_1 == singleton_2 " + (singleton_1 == singleton_2));

        LazySingleton lazySingleton_1 = LazySingleton.getInstance();
        LazySingleton lazySingleton_2 = LazySingleton.getInstance();
        System.out.println("lazySingleton_1 == lazySingleton_2 " + (lazySingleton_1 == lazySingleton_2));

        InnerClassSingleton inner_1 = InnerClassSingleton.getInstance();
        InnerClassSingleton inner_2 = InnerClassSingleton.getInstance();
        System.out.println("inner_1 == inner_2 " + (inner_1 == inner_2));

        SerSingleton serSingleton_1 = SerSingleton.getInstance();
        SerSingleton serSingleton_2 = SerSingleton.getInstance();
        System.out.println("serSingleton_1 == serSingleton_2 " + (serSingleton_1 == serSingleton_2));

        byte[] objBytes = SerializableUtils.serialize(serSingleton_1);
        Object obj = SerializableUtils.deserialize(objBytes);
        SerSingleton serSingleton = (SerSingleton) obj;
        System.out.println("serSingleton_1 == serSingleton " + (serSingleton_1 == serSingleton));

    }
}
