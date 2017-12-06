package hzx.design.decorator.car.bean;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  design.decorator.bean
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/9 14:50
 */
public class SuperCar implements Car {
    private ICar car;

    public SuperCar(ICar car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}
