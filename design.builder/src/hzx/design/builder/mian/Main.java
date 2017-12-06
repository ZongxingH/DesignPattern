/**
 * 工程名称：DesignPattern
 * 工程路径：hzx.design.builder.mian
 * 团队名称：
 */
package hzx.design.builder.mian;

import hzx.design.builder.bean.Car;
import hzx.design.builder.builder.CarBuilder;
import hzx.design.builder.builder.CarBuilderImpl;
import hzx.design.builder.builder.CarDirector;
import hzx.design.builder.builder.CarDirectorImpl;

/**
 * @author ZongxingH
 * @date 2015-11-25 16:34
 * @desc
 * @see
 */
public class Main {

    public static void main(String[] args){
        CarBuilder carBuilder = new CarBuilderImpl();
        CarDirector carDirector = new CarDirectorImpl(carBuilder);
        Car car = carDirector.directCar();
        System.out.println(car.toString());
    }
}
