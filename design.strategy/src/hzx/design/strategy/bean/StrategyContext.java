package hzx.design.strategy.bean;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.strategy.bean
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/18 15:01
 */
public class StrategyContext {
    private Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }
    public void ptintPrice(double price){
        double priPrice = this.strategy.getPrice(price);

        System.out.println("出售的价格为：" + priPrice);
    }
}
