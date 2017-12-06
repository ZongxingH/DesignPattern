/**
 * 工程名称：DesignPattern
 * 工程路径：factory.factorymethod.factory
 * 团队名称：
 */
package hzx.design.factory.factorymethod.factory;

import hzx.design.factory.factorymethod.bean.Audi;
import hzx.design.factory.factorymethod.bean.Car;

/**
 * @author ZongxingH
 * @date 2015-11-24 12:21
 * @desc
 * @see
 */
public class AudiFactory implements CarFactory {
    @Override
    public Car createCar() {
        Car audi = new Audi();
        return audi;
    }


}
