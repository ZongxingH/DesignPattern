package hzx.design.bridge.bean;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.bridge.bean
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/7 16:37
 */
public class Computer {
    protected Brand brand;
    public Computer(Brand brand){
        this.brand = brand;
    }
    public void sale(){
        brand.sale();
    }
}
