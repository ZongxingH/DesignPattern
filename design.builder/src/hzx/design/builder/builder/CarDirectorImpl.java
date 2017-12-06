/**
 * 工程名称：DesignPattern
 * 工程路径：hzx.design.builder.builder
 * 团队名称：
 */
package hzx.design.builder.builder;

import hzx.design.builder.bean.Car;

/**
 * @author ZongxingH
 * @date 2015-11-25 16:29
 * @desc
 * @see
 */
public class CarDirectorImpl implements CarDirector {

    private CarBuilder carBuilder;

    public CarDirectorImpl(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }

    @Override
    public Car directCar() {
        Car car = new Car();
        car.setEngine(carBuilder.buildEngine("德国发动机"));
        car.setSeat(carBuilder.buildSeat("美国座椅"));
        car.setTire(carBuilder.buildTire("德国轮胎"));

        return car;
    }
}
