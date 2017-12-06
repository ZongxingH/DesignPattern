package hzx.design.factory.abstractfactory.factory;

import hzx.design.factory.abstractfactory.bean.Car;
import hzx.design.factory.abstractfactory.bean.Engine;
import hzx.design.factory.abstractfactory.bean.Seat;
import hzx.design.factory.abstractfactory.bean.Tire;

/**
 * 工程名称：DesignPattern
 * 工程路径：factory.abstractfactory.factory
 * 团队名称：
 */
public interface CarFactory {
    Car createCar();
    Engine createEngine();
    Seat createSeat();
    Tire createTire();
}
