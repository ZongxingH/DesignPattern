package hzx.design.builder.builder;

import hzx.design.builder.bean.Engine;
import hzx.design.builder.bean.Seat;
import hzx.design.builder.bean.Tire;

/**
 * 工程名称：DesignPattern
 * 工程路径：hzx.design.builder.builder
 * 团队名称：
 */
public interface CarBuilder {
    Engine buildEngine(String name);
    Seat buildSeat(String name);
    Tire buildTire(String name);
}
