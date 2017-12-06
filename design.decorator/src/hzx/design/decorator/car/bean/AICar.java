package hzx.design.decorator.car.bean;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  design.decorator.bean
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/9 14:57
 */
public class AICar extends SuperCar {
    public AICar(ICar car) {
        super(car);
    }
    private void autoMove(){
        System.out.println("自动驾驶、、、、、");
    }

    @Override
    public void move() {
        super.move();
        autoMove();
    }
}
