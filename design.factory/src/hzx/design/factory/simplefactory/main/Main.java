/**
 * 工程名称：DesignPattern
 * 工程路径：factory.simplefactory.main
 * 团队名称：
 */
package hzx.design.factory.simplefactory.main;

import hzx.design.factory.simplefactory.factory.CarFactory;
import hzx.design.factory.simplefactory.factory.CarFactoryImpl;

/**
 * 简单工厂模式
 * @author ZongxingH
 * @date 2015-11-24 12:10
 * @desc
 * @see
 */
public class Main {

    public static void main(String[] args){

        CarFactory carFactory = new CarFactoryImpl();
        carFactory.createCar("宝马");
        carFactory.createCar("奥迪");
        carFactory.createCar("比亚迪");
    }
}
