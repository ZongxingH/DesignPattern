package hzx.design.decorator.car.bean;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  design.decorator.bean
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/9 14:55
 */
public class WaterCar extends SuperCar {
    public WaterCar(ICar car) {
        super(car);
    }
    private void swimm(){
        System.out.println("水中游、、、、、");
    }

    @Override
    public void move() {
        super.move();
        swimm();
    }
}
