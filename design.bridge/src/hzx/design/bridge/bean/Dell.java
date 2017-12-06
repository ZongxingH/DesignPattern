package hzx.design.bridge.bean;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.bridge.bean
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/7 16:36
 */
public class Dell implements Brand {
    @Override
    public void sale() {
        System.out.println("戴尔电脑");
    }
}
