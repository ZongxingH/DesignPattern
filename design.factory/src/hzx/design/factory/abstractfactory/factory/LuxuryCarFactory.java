/**
 * 工程名称：DesignPattern
 * 工程路径：factory.abstractfactory.factory
 * 团队名称：
 */
package hzx.design.factory.abstractfactory.factory;

import hzx.design.factory.abstractfactory.bean.Car;
import hzx.design.factory.abstractfactory.bean.Engine;
import hzx.design.factory.abstractfactory.bean.LuxuryEngine;
import hzx.design.factory.abstractfactory.bean.LuxurySeat;
import hzx.design.factory.abstractfactory.bean.LuxuryTire;
import hzx.design.factory.abstractfactory.bean.Seat;
import hzx.design.factory.abstractfactory.bean.Tire;

/**
 * @author ZongxingH
 * @date 2015-11-24 17:53
 * @desc
 * @see
 */
public class LuxuryCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        Car car = new Car();
        car.setEngine(this.createEngine());
        car.setSeat(this.createSeat());
        car.setTire(this.createTire());
        return car;
    }
    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    @Override
    public Seat createSeat() {
        return new LuxurySeat();
    }

    @Override
    public Tire createTire() {
        return new LuxuryTire();
    }
}
