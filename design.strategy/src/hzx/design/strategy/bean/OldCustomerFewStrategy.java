package hzx.design.strategy.bean;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.strategy.bean
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/18 14:56
 */
public class OldCustomerFewStrategy implements Strategy {
    @Override
    public double getPrice(double price) {
        System.out.println("老客户，大量购买，打八五折！");
        return price * 0.85;
    }
}
