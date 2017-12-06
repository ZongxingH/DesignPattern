/**
 * 工程名称：DesignPattern
 * 工程路径：factory.abstractfactory.bean
 * 团队名称：
 */
package hzx.design.factory.abstractfactory.bean;

/**
 * @author ZongxingH
 * @date 2015-11-24 18:01
 * @desc
 * @see
 */
public class Car {

    private Engine engine;
    private Seat seat;
    private Tire tire;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    @Override
    public String toString() {
        return engine.start() + "\n"
                + engine.run() + "\n"
                + engine.stop() + "\n"
                + seat.use() + "\n"
                + tire.use() + "\n";
    }
}
