package hzx.design.decorator.car.bean;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  design.decorator.bean
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/9 14:51
 */
public class FlyCar extends SuperCar {
    public FlyCar(ICar car) {
        super(car);
    }

    private void fly(){
        System.out.println("空中飞行、、、、");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}
