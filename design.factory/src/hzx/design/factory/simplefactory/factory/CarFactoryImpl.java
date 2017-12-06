/**
 * 工程名称：DesignPattern
 * 工程路径：factory.simplefactory.factory
 * 团队名称：
 */
package hzx.design.factory.simplefactory.factory;

import hzx.design.factory.simplefactory.bean.Audi;
import hzx.design.factory.simplefactory.bean.Bmw;
import hzx.design.factory.simplefactory.bean.Byd;

/**
 * @author ZongxingH
 * @date 2015-11-24 12:03
 * @desc
 * @see
 */
public class CarFactoryImpl implements CarFactory{
    @Override
    public void createCar(String carType) {
        if ("奥迪".equals(carType)){
            Audi audi = new Audi();
            audi.run();
        }else if ("宝马".equals(carType)){
            Bmw bmw = new Bmw();
            bmw.run();
        }else if ("比亚迪".equals(carType)){
            Byd byd = new Byd();
            byd.run();
        }
    }
}
