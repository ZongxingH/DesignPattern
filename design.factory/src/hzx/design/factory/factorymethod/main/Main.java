/**
 * 工程名称：DesignPattern
 * 工程路径：factory.simplefactory.main
 * 团队名称：
 */
package hzx.design.factory.factorymethod.main;

import hzx.design.factory.factorymethod.bean.Car;
import hzx.design.factory.factorymethod.factory.AudiFactory;
import hzx.design.factory.factorymethod.factory.BmwFactory;
import hzx.design.factory.factorymethod.factory.BydFactroy;

/**
 * 工厂方法模式
 * @author ZongxingH
 * @date 2015-11-24 12:10
 * @desc
 * @see
 */
public class Main {

    public static void main(String[] args) {
        Car car1 = new AudiFactory().createCar();
        car1.run();
        Car car2 = new BmwFactory().createCar();
        car2.run();
        Car car3 = new BydFactroy().createCar();
        car3.run();

    }
}
