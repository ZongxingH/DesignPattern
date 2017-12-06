/**
 * 工程名称：DesignPattern
 * 工程路径：hzx.design.builder.bean
 * 团队名称：
 */
package hzx.design.builder.bean;

/**
 * @author ZongxingH
 * @date 2015-11-25 16:20
 * @desc
 * @see
 */
public class Car {

    private Engine engine;
    private Seat seat;
    private Tire tire;

    public Car(){}

    public Car(Engine engine, Seat seat, Tire tire) {
        this.engine = engine;
        this.seat = seat;
        this.tire = tire;
    }

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

    public String toString(){
        return engine.getName() + "\n"
                + seat.getName() + "\n"
                + tire.getName() + "\n";
    }
}
