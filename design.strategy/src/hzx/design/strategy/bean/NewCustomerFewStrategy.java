package hzx.design.strategy.bean;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.strategy.bean
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/18 14:56
 */
public class NewCustomerFewStrategy implements Strategy {
    @Override
    public double getPrice(double price) {
        System.out.println("新客户，少量购买，不打折！");
        return price;
    }
}
