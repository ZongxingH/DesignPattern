package hzx.design.decorator.car.bean;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  design.decorator.bean
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/9 14:49
 */
public class ICar implements Car {
    @Override
    public void move() {
        System.out.println("陆地上跑、、、、、");
    }
}
