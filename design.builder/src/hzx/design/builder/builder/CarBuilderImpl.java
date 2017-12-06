/**
 * 工程名称：DesignPattern
 * 工程路径：hzx.design.builder.builder
 * 团队名称：
 */
package hzx.design.builder.builder;

import hzx.design.builder.bean.Engine;
import hzx.design.builder.bean.Seat;
import hzx.design.builder.bean.Tire;

/**
 * @author ZongxingH
 * @date 2015-11-25 16:27
 * @desc
 * @see
 */
public class CarBuilderImpl implements CarBuilder {
    @Override
    public Engine buildEngine(String name) {
        Engine engine = new Engine(name);
        return engine;
    }

    @Override
    public Seat buildSeat(String name) {
        Seat seat = new Seat(name);
        return seat;
    }

    @Override
    public Tire buildTire(String name) {
        Tire tire = new Tire(name);
        return tire;
    }
}
