package hzx.design.decorator.car.mian;

import hzx.design.decorator.car.bean.FlyCar;
import hzx.design.decorator.car.bean.ICar;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  design.decorator.mian
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/9 14:59
 */
public class Main {

    public static void main(String[] args){
        ICar car = new ICar();
        car.move();

        FlyCar flyCar = new FlyCar(car);
        flyCar.move();
    }
}
