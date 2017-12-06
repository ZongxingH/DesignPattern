/**
 * 工程名称：DesignPattern
 * 工程路径：factory.simplefactory.main
 * 团队名称：
 */
package hzx.design.factory.abstractfactory.main;

import hzx.design.factory.abstractfactory.bean.Car;
import hzx.design.factory.abstractfactory.factory.LowCarFactory;
import hzx.design.factory.abstractfactory.factory.LuxuryCarFactory;

/**
 * @author ZongxingH
 * @date 2015-11-24 12:10
 * @desc
 * @see
 */
public class Main {

    public static void main(String[] args) {
        Car lowCar = new LowCarFactory().createCar();
        System.out.println(lowCar.toString());

        Car luxuryCar = new LuxuryCarFactory().createCar();
        System.out.println(luxuryCar.toString());
    }
}
